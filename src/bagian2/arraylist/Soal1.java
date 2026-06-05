package bagian2.arraylist;

import java.util.ArrayList;

public class Soal1 {
    public static void main(String[] args) {

        ArrayList<String> daftarBelanja = new ArrayList<>();

        daftarBelanja.add("Beras");
        daftarBelanja.add("Gula");
        daftarBelanja.add("Minyak");
        daftarBelanja.add("Telur");

        // Menghapus item ke-2 (index 1)
        daftarBelanja.remove(1);

        System.out.println("Daftar Belanja: " + daftarBelanja);
        System.out.println("Jumlah item: " + daftarBelanja.size());
    }
}
