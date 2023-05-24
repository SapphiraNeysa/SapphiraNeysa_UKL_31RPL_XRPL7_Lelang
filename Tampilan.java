/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukl_pt2;

import java.util.Scanner;

/**
 *
 * @author Neysaa
 */
public class Tampilan{

    static Scanner gatau = new Scanner(System.in);
    static Admin tampil = new Admin();
    static Barang show = new Barang();
    static Petugas lihat = new Petugas();
    static Masyarakat gtw = new Masyarakat();
    static Lelang llg= new Lelang();

    public void Tampilan() {
        System.out.println("\n--------------------------PILIH OPSI LELANG---------------------------");
        System.out.println("1. Daftar Masyarakat\n"
                + "2. Daftar Barang\n"
                + "3. Mulai Lelang\n"
                + "4. Data Petugas");

        System.out.println("\nMasukkan Opsi : ");
        int pilihan = gatau.nextInt();

        switch (pilihan) {
            case 1: {
                tampil.showMasyarakat(gtw);
                break;
            }
            case 2:{
                tampil.showBarang(show);
                break;
            }
            case 3 :{
                tampil.showMasyarakat(gtw);
                tampil.showBarang(show);
                llg.Proses();
                break;
            }
            case 4 :{
                tampil.showPetugas(lihat);
                break;
            }
            default :
                System.out.println("Gaada");
                break;
        }
    }

    public void Akhiran() {
        System.out.println("\n------------------TERIMAKASIH SUDAH MELAKUKAN LELANG-------------------");
    }
}
