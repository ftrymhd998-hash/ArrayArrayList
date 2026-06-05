package bagian3.perpustakaan;

import java.util.ArrayList;


public class Soal_Perpustakaan {
    private ArrayList<Soal_Buku> daftarBuku = new ArrayList<>();

    public void tambahBuku(Soal_Buku buku) {
        daftarBuku.add(buku);
    }

    public void pinjamBuku(String judul) {
        for (Soal_Buku buku : daftarBuku) {
            if (buku.getJudul().equalsIgnoreCase(judul)) {
                buku.setDipinjam(true);
                System.out.println("Buku \"" + judul + "\" berhasil dipinjam.");
                return;
            }
        }
        System.out.println("Buku tidak ditemukan.");
    }

    public void kembalikanBuku(String judul) {
        for (Soal_Buku buku : daftarBuku) {
            if (buku.getJudul().equalsIgnoreCase(judul)) {
                buku.setDipinjam(false);
                System.out.println("Buku \"" + judul + "\" berhasil dikembalikan.");
                return;
            }
        }
        System.out.println("Buku tidak ditemukan.");
    }

    public void cariPenulis(String penulis) {
        System.out.println("Daftar buku karya " + penulis + ":");

        boolean ditemukan = false;

        for (Soal_Buku buku : daftarBuku) {
            if (buku.getPenulis().equalsIgnoreCase(penulis)) {
                buku.info();
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Tidak ada buku yang ditemukan.");
        }
    }

    public void tampilkanSemuaBuku() {
        for (Soal_Buku buku : daftarBuku) {
            buku.info();
        }
    }
}