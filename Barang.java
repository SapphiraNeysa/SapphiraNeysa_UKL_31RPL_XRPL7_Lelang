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
public class Barang implements SetGet {

    private ArrayList<Integer> idMasyarakat = new ArrayList<Integer>();
    private ArrayList<String> namaBarang = new ArrayList<String>();
    private ArrayList<Integer> hargaAwal = new ArrayList<Integer>();
    private ArrayList<Boolean> Status = new ArrayList<Boolean>();

    public Barang(){
        Barang(0,"Satelit",500,Boolean.TRUE);
        Barang(1,"Debu Bulan",450,Boolean.TRUE);
        Barang(2,"Benda Asing",600,Boolean.TRUE);
    }
    
    public void Barang(int idM, String namaB, int hargaA, boolean st){
        setId(idM);
        setNama(namaB);
        setHarga(hargaA);
        setStatus(true);
    }
    
    @Override
    public void setHarga(int harga) {
        this.hargaAwal.add(harga);
    }

    @Override
    public void setId(int id) {
        this.idMasyarakat.add(id);
    }

    public void setNama(String nama) {
        this.namaBarang.add(nama);
    }

    public void setStatus(Boolean st) {
        this.Status.add(st);
    }

    public void editStatus(int a, Boolean b) {
        Status.set(a, b);
    }

    @Override
    public int getHarga(int harga) {
        return this.hargaAwal.get(harga);
    }

    @Override
    public int getId(int id) {
        return this.idMasyarakat.get(id);
    }

    public String getNama(int nama) {
        return this.namaBarang.get(nama);
    }

    public Boolean getStatus(int st) {
        return this.Status.get(st);
    }
    
    public int getJumlahBarang(){
        return this.namaBarang.size();
    }
}
