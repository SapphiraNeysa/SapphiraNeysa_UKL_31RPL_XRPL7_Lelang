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
public class Masyarakat {

    private ArrayList<String> namaMasyarakat = new ArrayList<String>();
    private ArrayList<String> Alamat = new ArrayList<String>();
    private ArrayList<String> Telepon = new ArrayList<String>();
    private ArrayList<Integer> ID = new ArrayList<Integer>();

    public Masyarakat() {
//        nambah("Phira","Malang","0813***");
        nambah(0,"Makhluk Asing", "Planet lain", "0000***");
        nambah(1,"Makhluk Bumi", "Bumi", "0830***");
//        nambah(2,"Sapphira","Sawojajar","0897***");

    }

    public void nambah(int ID, String nama, String almt, String tlp) {
        setId(ID);
        setNama(nama);
        setAlamat(almt);
        setTelepon(tlp);
    }
    
    public void setId(int id) {
        this.ID.add(id);
    }

    public void setNama(String nama) {
        this.namaMasyarakat.add(nama);
    }

    public void setAlamat(String alamat) {
        this.Alamat.add(alamat);
    }

    public void setTelepon(String tlp) {
        this.Telepon.add(tlp);
    }
    
    public int getId(int id) {
        return this.ID.get(id);
    }


    public String getNama(int nama) {
        return this.namaMasyarakat.get(nama);
    }

    public String getAlamat(int alamat) {
        return this.Alamat.get(alamat);
    }

    public String getTelepon(int tlp) {
        return this.Telepon.get(tlp);
    }

    public int getJumlahMasyarakat() {
        return this.namaMasyarakat.size();
    }
}
