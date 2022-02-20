package Perpustakaan;

import java.util.ArrayList;
import java.util.Scanner;

public class Peminjaman {

    private ArrayList<Integer> idSiswa = new ArrayList<Integer>();
    private ArrayList<Integer> idBuku = new ArrayList<Integer>();
    private ArrayList<Integer> banyak = new ArrayList<Integer>();
    Scanner a = new Scanner(System.in);

    public Peminjaman() {
        this.idSiswa.add(0);
        this.idBuku.add(0);
        this.banyak.add(2);
        this.idSiswa.add(0);
        this.idBuku.add(1);
        this.banyak.add(3);
        this.idSiswa.add(1);
        this.idBuku.add(0);
        this.banyak.add(1);
        this.idSiswa.add(1);
        this.idBuku.add(2);
        this.banyak.add(2);
    }

    public void prosesPeminjaman(Siswa siswa, Peminjaman peminjaman, Buku buku, Laporan laporan) {
        System.out.println("\n============== Silahkan Melakukan Peminjaman Buku ===============\n");

        System.out.print("Masukkan Id Siswa : ");
        int idSiswa = a.nextInt();
        if (siswa.getStatus(idSiswa) == false) {
            System.out.println("\nHalo " + siswa.getNama(idSiswa) + "! Selamat datang di Perpustakaan!\n");
            System.out.println("Mohon maaf anda tidak bisa melakukan peminjaman buku");
            System.exit(0);
        }

        System.out.println("\nHalo " + siswa.getNama(idSiswa) + "! Selamat datang di Perpustakaan!\n");
        ArrayList<Integer> idBuku = new ArrayList<Integer>();
        ArrayList<Integer> banyak = new ArrayList<Integer>();

        int i = 0;
        int temp = 0;
        String jawab;
        System.out.println("Apakah ingin membeli buku?");
        System.out.print("==> ");
        jawab = a.next();
        if ("yes".equalsIgnoreCase(jawab)) {
            do {
                System.out.print("\nMasukkan Id Buku : ");
                temp = a.nextInt();
                if ("yes".equalsIgnoreCase(jawab)) {
                    idBuku.add(temp);
                    System.out.print("Anda ingin meminjam buku " + buku.getNamaBuku(idBuku.get(i)) + " sebanyak : ");
                    banyak.add(a.nextInt());
                    if (buku.getStok(idBuku.get(i)) < banyak.get(i)) {
                        System.out.println("Mohon maaf stok buku tidak mencukupi");
                        System.exit(0);
                    }
                    i++;
                }
                System.out.println("\nApakah ingin membeli buku lagi?");
                System.out.print("==> ");
                jawab = a.next();
            } while ("yes".equalsIgnoreCase(jawab));

            System.out.println("\n================== Hasil Transaksi =======================");
            System.out.println("Transaksi peminjaman buku atas nama " + siswa.getNama(idSiswa) + " adalah sebagai berikut");
            System.out.println("Nama Buku \tQty \tHarga \t\tJumlah");
            int total = 0;
            int j = idBuku.size();
            for (int m = 0; m < j; m++) {
                int jumlah = banyak.get(m) * buku.getHarga(idBuku.get(m));
                total += jumlah;
                System.out.println(buku.getNamaBuku(idBuku.get(m)) + "\t" + banyak.get(m) + "\tRp" + buku.getHarga(idBuku.get(m)) + "\tRp" + jumlah);
                peminjaman.setPeminjaman(buku, idSiswa, idBuku.get(m), banyak.get(m));
            }

            siswa.editStatus(idSiswa, false);
            System.out.println("Status " + siswa.getNama(idSiswa) + " adalah " + siswa.getStatus(idSiswa));
            System.out.println("Total peminjaman dari " + siswa.getNama(idSiswa) + ": Rp" + total);
            laporan.laporan(buku);
            laporan.laporan(siswa);

            System.out.println("Apakah ingin melakukan pengembalian buku? (Yes : No)");
            System.out.print("==> ");
            String answer = a.next();
            if ("yes".equalsIgnoreCase(answer)) {
                for (int z = 0; z < j; z++) {
                    peminjaman.setPengembalian(buku, idSiswa, idBuku.get(z), banyak.get(z));
                }
                siswa.editStatus(idSiswa, true);
                System.out.println("Anda telah berhasil melakukan pengembalian buku");
                System.out.println("Status " + siswa.getNama(idSiswa) + " adalah " + siswa.getStatus(idSiswa));
                laporan.laporan(buku);
                laporan.laporan(siswa);
            } else if ("no".equalsIgnoreCase(answer)) {
                System.out.println("Anda belum mengembalikan buku");
                laporan.laporan(buku);
                laporan.laporan(siswa);
                System.exit(0);
            }
        }

    }

    public void setPeminjaman(Buku buku, int idSiswa, int idBuku, int banyak) {
        this.idBuku.add(idBuku);
        this.idSiswa.add(idSiswa);
        this.banyak.add(banyak);
        buku.editStok(idBuku, buku.getStok(idBuku) - banyak);
    }

    public void setPengembalian(Buku buku, int idSiswa, int idBuku, int banyak) {
        this.idBuku.add(idBuku);
        this.idSiswa.add(idSiswa);
        this.banyak.add(banyak);
        buku.editStok(idBuku, buku.getStok(idBuku) + banyak);
    }

    public int getIdSiswa(int id) {
        return this.idSiswa.get(id);
    }

    public int getIdBuku(int id) {
        return this.idBuku.get(id);
    }

    public int getBanyak(int id) {
        return this.banyak.get(id);
    }
}
