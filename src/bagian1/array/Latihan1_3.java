package bagian1.array;
public class Latihan1_3 {
    public static void main(String[] args) {

        int[] angka = {4, 8, 15, 16, 23, 42};

        int jumlahGenap = 0;

        for (int n : angka) {
            if (n % 2 == 0) {
                jumlahGenap++;
            }
        }

        System.out.println("Jumlah angka genap = " + jumlahGenap);
    }
}
