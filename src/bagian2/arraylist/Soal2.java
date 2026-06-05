package bagian2.arraylist;

import java.util.ArrayList;

public class Soal2 {
    public static void main(String[] args) {

        ArrayList<Integer> angka = new ArrayList<>();

        angka.add(10);
        angka.add(25);
        angka.add(18);
        angka.add(40);
        angka.add(32);

        int terbesar = angka.get(0);

        for (int n : angka) {
            if (n > terbesar) {
                terbesar = n;
            }
        }

        System.out.println("Data angka: " + angka);
        System.out.println("Nilai terbesar: " + terbesar);
    }
}
