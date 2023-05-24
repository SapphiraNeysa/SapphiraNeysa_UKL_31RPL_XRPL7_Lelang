/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukl_pt2;

/**
 *
 * @author Neysaa
 */
public class Admin {
    
    public void showPetugas(Petugas p) {
        int y = 0;
        System.out.println("\n----------------------------PETUGAS LELANG----------------------------");
        System.out.println("Nama Petugas    : " + p.getNama(y));
        System.out.println("Alamat Petugas  : " + p.getAlamat(y));
        System.out.println("Telepon Petugas : " + p.getTelepon(y));
    }

    public void showBarang(Barang b) {
        int z = b.getJumlahBarang();
        System.out.println("");
        System.out.println("\n----------------------------DAFTAR BARANG------------------------------");
        System.out.println("______________________________________________________________________");
        System.out.println(String.format("|%-15s|%-20s|%-15s|%-15s|", "KODE BARANG", "NAMA", "HARGA", "STATUS"));
        System.out.println("______________________________________________________________________");
        for (int n = 0; n < z; n++) {
            System.out.println(String.format("|%-15d|%-20s|$%-15d|%-15b|", n, b.getNama(n), b.getHarga(n), b.getStatus(n)));
        }
    }

    public void showMasyarakat(Masyarakat m) {
        int x = m.getJumlahMasyarakat();
        System.out.println("");
        System.out.println("\n---------------------------PARA MASYARAKAT----------------------------");
        System.out.println("______________________________________________________________________");
        System.out.println(String.format("|%-10s|%-20s|%-20s|%-15s|", "ID", "NAMA", "ALAMAT", "TELP"));
        System.out.println("______________________________________________________________________");
        for (int n = 0; n < x; n++) {
            System.out.println(String.format("|%-10d|%-20s|%-20s|%-15s|", n, m.getNama(n), m.getAlamat(n), m.getTelepon(n)));
        }
        System.out.println("______________________________________________________________________");
    }

}
