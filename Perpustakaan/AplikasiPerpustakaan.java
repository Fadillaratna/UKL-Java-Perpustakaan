package Perpustakaan;

import java.util.Scanner;

public class AplikasiPerpustakaan {

    public static void main(String[] args) {
        Buku buku = new Buku();
        Siswa siswa = new Siswa();
        Petugas petugas = new Petugas();
        Peminjaman peminjaman = new Peminjaman();
        Laporan laporan = new Laporan();

        Scanner a = new Scanner(System.in);
        int menu = 0;

        System.out.println("\n======================== PERPUSTAKAAN =================");

        do {
            System.out.println("\n~~~~~~~~~~~~~~~~ Menu ~~~~~~~~~~~~~~");
            System.out.println("1. List Buku");
            System.out.println("2. List Siswa");
            System.out.println("3. List Petugas");
            System.out.println("4. Transaksi");
            System.out.println("5. Exit");
            System.out.print("Pilih Menu ==> ");
            menu = a.nextInt();
            
           
            if (menu == 1) {
                laporan.laporan(buku);
            } else if (menu == 2) {
                laporan.laporan(siswa);
            } else if (menu == 3) {
                laporan.laporan(petugas);
            } else if (menu == 4) {
                System.out.print("M");
                peminjaman.prosesPeminjaman(siswa, peminjaman, buku, laporan);
            } else if (menu == 5) {
                System.out.println("\nTerima kasih");
            } else {
                System.out.println("\nMohon maaf menu yang anda pilih tidak tersedia");
            }

        } while (menu != 5);
    }
}
