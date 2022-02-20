package Perpustakaan;

public class Laporan {
    public void laporan(Petugas petugas){
        int z = petugas.getJmlPetugas();
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~ Data Petugas ~~~~~~~~~~~~~~~~~~~~~~`\n");
        System.out.println("ID \tNama Petugas \tAlamat \tTelepon");
        for(int a = 0; a < z; a++){
            System.out.println(a + ",\t" + petugas.getNama(a) + "\t\t" + petugas.getAlamat(a) + "\t" + petugas.getTelepon(a));
        }
    }
    
    public void laporan(Siswa siswa){
        int z = siswa.getJmlSiswa();
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~ Data Siswa  ~~~~~~~~~~~~~~~~~~~~~~`\n");
        System.out.println("ID \tNama Siswa \tAlamat \tTelepon \tStatus");
        for(int a = 0; a < z; a++){
            System.out.println(a + ",\t" + siswa.getNama(a) + "\t\t" + siswa.getAlamat(a) + "\t" + siswa.getTelepon(a) + "\t" + siswa.getStatus(a));
        }
    }
    
    public void laporan(Buku buku){
        int z = buku.getJmlBuku();
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~ Data Buku  ~~~~~~~~~~~~~~~~~~~~~~`\n");
        System.out.println("ID \tNama Buku \tStok \tHarga");
        for(int a = 0; a < z; a++){
            System.out.println(a + ",\t" + buku.getNamaBuku(a) + "\t" + buku.getStok(a) + "\tRp" + buku.getHarga(a));
        }
    }
}
