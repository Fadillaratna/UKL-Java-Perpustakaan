package Perpustakaan;

import java.util.ArrayList;

public class Buku extends Barang {
    private ArrayList<String>namaBuku= new ArrayList<String>();
    private ArrayList<Integer>stok= new ArrayList<Integer>();
    private ArrayList<Integer>harga= new ArrayList<Integer>();

    public Buku(){
        this.namaBuku.add("Programming");
        this.stok.add(20);
        this.harga.add(250000);

        this.namaBuku.add("Webdevel");
        this.stok.add(7);
        this.harga.add(310000);

        this.namaBuku.add("Matematika");
        this.stok.add(12);
        this.harga.add(76000);

        this.namaBuku.add("History Ind");
        this.stok.add(19);
        this.harga.add(110000);
    }
    
    public int getJmlBuku(){
        return this.namaBuku.size();
    }
    
    public void setNamaBuku(String namaBuku){
        this.namaBuku.add(namaBuku);
    }
    
    public void setStok(int stok){
        this.stok.add(stok);
    }
    
    public void setHarga(int harga){
        this.harga.add(harga);
    }
    
    public String getNamaBuku(int id){
        return this.namaBuku.get(id);
    }
    
    public void editStok(int id, int stok){
        this.stok.set(id, stok);
    }
    
    @Override
    public int getStok(int id){
        return this.stok.get(id);
    }
    
    @Override
    public int getHarga(int id){
        return this.harga.get(id);
    }
}
