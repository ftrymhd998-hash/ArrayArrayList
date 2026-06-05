package tugas;

public class MainTugas {
    public static void main(String[] args) {

        // Array mata kuliah
        String[] mataKuliah = {
            "Pemrograman Java",
            "Struktur Data",
            "Basis Data"
        };

        System.out.println("=== DAFTAR MATA KULIAH ===");
        for (String mk : mataKuliah) {
            System.out.println(mk);
        }

        System.out.println();

        // Membuat objek KelasKuliah
        KelasKuliah kelas = new KelasKuliah();

        // Menambahkan minimal 5 mahasiswa
        kelas.tambahMahasiswa(new Mahasiswa("Andi", "231001001", 85));
        kelas.tambahMahasiswa(new Mahasiswa("Budi", "231001002", 70));
        kelas.tambahMahasiswa(new Mahasiswa("Citra", "231001003", 55));
        kelas.tambahMahasiswa(new Mahasiswa("Dina", "231001004", 90));
        kelas.tambahMahasiswa(new Mahasiswa("Eko", "231001005", 60));

        kelas.tampilkanSemua();

        System.out.println();
        System.out.println("Rata-rata nilai : " + kelas.hitungRataRata());
        System.out.println("Jumlah lulus    : " + kelas.jumlahLulus());

        // Menambah satu mahasiswa baru
        kelas.tambahMahasiswa(
            new Mahasiswa("Fajar", "231001006", 75)
        );

        System.out.println();
        System.out.println("Setelah menambah 1 mahasiswa:");
        System.out.println("Jumlah data mahasiswa = "
                + kelas.jumlahMahasiswa());
    }
}