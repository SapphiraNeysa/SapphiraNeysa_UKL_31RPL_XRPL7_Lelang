/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukl_pt2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Neysaa
 */
public class Lelang implements SetGet {

    static Scanner gatau = new Scanner(System.in);
    private ArrayList<Integer> idPenawar = new ArrayList<Integer>();
    private ArrayList<Integer> idBarang = new ArrayList<Integer>();
    private ArrayList<Integer> hargaTawar = new ArrayList<Integer>();

    static int i;
    static Admin show = new Admin();
    static Masyarakat masy = new Masyarakat();
    static Barang brg = new Barang();
    static Petugas ptgs = new Petugas();
    static int idB, idM;

    public void Show() {
        show.showBarang(brg);
        show.showMasyarakat(masy);
    }

    public void Proses() {
        System.out.println("\n----------------------SILAHKAN MELAKUKAN LELANG-----------------------");

        //input barang
        System.out.println("\nMasukkan ID Barang : ");
        idB = gatau.nextInt();
        this.idBarang.add(idB);
        if (idB > brg.getJumlahBarang()) {
            System.out.println("Id salah, Silahkan Masukkan Ulang!");
            Proses();
        } else {
            System.out.println("\n------------------------BARANG YANG DIPILH-------------------------");
            System.out.println(
                    "\n Id Barang     : " + brg.getId(idB)
                    + "\n Nama Barang   : " + brg.getNama(idB)
                    + "\n Harga Barang  : $" + brg.getHarga(idB)
                    + "\n Status Barang : " + brg.getStatus(idB)
            );inputBarang();
        }
    }

    public void inputBarang() {
        System.out.println("\nMasukkan ID Masyarakat : ");
        idM = gatau.nextInt();
        this.idPenawar.add(idM);
        if (idM > masy.getJumlahMasyarakat()) {
            System.out.println("Id Salah, Silahkan Masukkan Ulang!");
            inputBarang();
        } else {
            System.out.println("\n----------------------IDENTITAS MAKHLUK-----------------------");
            System.out.println(
                    "\n Id Masyarakat : " + idM
                    + "\n Nama          : " + masy.getNama(idM)
                    + "\n Alamat        : " + masy.getAlamat(idM)
                    + "\n No.Telepon    : " + masy.getTelepon(idM)
            );
            nawar();
        }
    }

    public void nawar() {
        System.out.print("\nMasukkan Harga Tawar : $");
        int harga = gatau.nextInt();
        brg.getHarga(idB);
        if (brg.getHarga(idB) < harga) {
            if (i < harga) {
                i = harga;
                setHarga(harga);

            } else {
                System.out.println("Udah ada yang menawar lebih:/");
            }
        } else {
            System.out.println("Terlalu Murah! Coba Lagi!");
            nawar();
        }

        System.out.println("Apakah Ada yang Ingin Menawar Lagi? (y=1/t=2)");
        int pilihan = gatau.nextInt();
        if (pilihan == 1) {
            inputBarang();
        } else if (pilihan == 2 && (i > brg.getHarga(idB))) {
            brg.editStatus(idB, Boolean.FALSE);
            System.out.println("\nSelamat! Anda Mendapatkan Barang!");
            System.out.println("Atas Nama " + masy.getNama(idM));
            System.out.println("\n Id Barang     : " + brg.getId(idB)
                    + "\n Nama Barang   : " + brg.getNama(idB)
                    + "\n Harga Barang  : $" + brg.getHarga(idB)
                    + "\n Status Barang : " + brg.getStatus(idB)
                    + "\n Harga Akhir   : $" + i);
        }
        show.showPetugas(ptgs);
    }

    public void setIdBarang(Barang brg, int idB) {
        this.idBarang.add(brg.getId(idB));
    }

    @Override
    public void setHarga(int harga) {
        this.hargaTawar.add(harga);
    }

    @Override
    public void setId(int id) {
        this.idPenawar.add(id);
    }

    @Override
    public int getHarga(int harga) {
        return this.idPenawar.get(harga);
    }

    @Override
    public int getId(int id) {
        return this.idPenawar.get(id);
    }
}
