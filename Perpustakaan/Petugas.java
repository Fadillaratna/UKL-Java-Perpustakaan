package Perpustakaan;

import java.util.ArrayList;

public class Petugas implements User{
    private ArrayList<String>namaKaryawan = new ArrayList<String>();
    private ArrayList<String>alamat = new ArrayList<String>();
    private ArrayList<String>telepon = new ArrayList<String>();
    
    public Petugas(){
        this.namaKaryawan.add("Admin");
        this.alamat.add("Yogya");
        this.telepon.add("085336710027");
    }

    public int getJmlPetugas(){
        return this.namaKaryawan.size();
    }
    @Override
    public void setNama(String nama) {
        this.namaKaryawan.add(nama);
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
        return this.namaKaryawan.get(id);
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
