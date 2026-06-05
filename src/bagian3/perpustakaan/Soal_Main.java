package bagian3.perpustakaan;
public class Soal_Main {
    public static void main(String[] args) {

        Soal_Perpustakaan perpus = new Soal_Perpustakaan();

        Soal_Buku b1 = new Soal_Buku("Laskar Pelangi", "Andrea Hirata", 2005);
        Soal_Buku b2 = new Soal_Buku("Sang Pemimpi", "Andrea Hirata", 2006);
        Soal_Buku b3 = new Soal_Buku("Bumi", "Tere Liye", 2014);

        perpus.tambahBuku(b1);
        perpus.tambahBuku(b2);
        perpus.tambahBuku(b3);

        System.out.println("=== Semua Buku ===");
        perpus.tampilkanSemuaBuku();

        System.out.println("=== Pinjam Buku ===");
        perpus.pinjamBuku("Bumi");

        System.out.println("\n=== Kembalikan Buku ===");
        perpus.kembalikanBuku("Bumi");

        System.out.println("\n=== Cari Buku Berdasarkan Penulis ===");
        perpus.cariPenulis("Andrea Hirata");
    }
}
