package Perpustakaan;

import java.util.ArrayList;

public class Siswa implements User{
    private ArrayList<String>namaSiswa = new ArrayList<String>();
    private ArrayList<String>alamat = new ArrayList<String>();
    private ArrayList<String>telepon = new ArrayList<String>();
    private ArrayList<Boolean>status = new ArrayList<Boolean>();

    public Siswa(){
        //index 0
        this.namaSiswa.add("Fadilla");
        this.alamat.add("Malang");
        this.telepon.add("082335162065");
        this.status.add(true);
        
        //index 1
        this.namaSiswa.add("Aizarr");
        this.alamat.add("Blitar");
        this.telepon.add("081990228105");
        this.status.add(true);
        
        //index 2
        this.namaSiswa.add("Cessaly");
        this.alamat.add("Malang");
        this.telepon.add("082335162060");
        this.status.add(true);
    }
    
    public int getJmlSiswa(){
        return this.namaSiswa.size();
    }
    
    public void setStatus(boolean status){
        this.status.add(status);
    }
    
    public boolean getStatus(int id){
        return this.status.get(id);
    }
    
    public void editStatus(int id, boolean status){
        this.status.set(id, status);
    }
    
    @Override
    public void setNama(String nama) {
        this.namaSiswa.add(nama);
    }

    @Override
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }

    @Override
    public void setTelepon(String telepon) {
        this.telepon.add(telepon);
    }

    @Override
    public String getNama(int id) {
        return this.namaSiswa.get(id);
    }

    @Override
    public String getAlamat(int id) {
        return this.alamat.get(id);
    }

    @Override
    public String getTelepon(int id) {
        return this.telepon.get(id);
    }
}
