/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukl_pt2;

import java.util.ArrayList;

/**
 *
 * @author Neysaa
 */
public class Petugas {
    private ArrayList<String> namaPetugas = new ArrayList<String>();
    private ArrayList<String> Alamat = new ArrayList<String>();
    private ArrayList<String> Telepon = new ArrayList<String>();

    public Petugas() {
        nambah("Alien","Planet Lain","0878***");
    }
    
//    @Override
    public void nambah(String nama, String alamat, String tlp){
        
        setNama(nama);
        setAlamat(alamat);
        setTelepon(tlp);
//        this.namaPetugas.add(nama);
//        this.Alamat.add(alamat);
//        this.Telepon.add(tlp);

    }

 //   @Override
    public void setNama(String nama) {
        this.namaPetugas.add(nama);
    }

 //   @Override
    public void setAlamat(String alamat) {
        this.Alamat.add(alamat);
    }

 //   @Override
    public void setTelepon(String tlp) {
        this.Telepon.add(tlp);
    }

  //  @Override
    public String getNama(int nama) {
        return this.namaPetugas.get(nama);
    }

 //   @Override
    public String getAlamat(int alamat) {
        return this.Alamat.get(alamat);
    }

//    @Override
    public String getTelepon(int tlp) {
        return this.Telepon.get(tlp);
    }
    
    public int JumlahPetugas(){
        return this.namaPetugas.size();
    }
}
