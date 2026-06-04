package bagian1.array;
public class Latihan1_1 {
    public static void main(String[] args) {

        double[] suhu = {30.5, 28.7, 32.1, 29.8, 31.4, 27.9};

        double tertinggi = suhu[0];
        double terendah = suhu[0];

        for (int i = 1; i < suhu.length; i++) {
            if (suhu[i] > tertinggi) {
                tertinggi = suhu[i];
            }

            if (suhu[i] < terendah) {
                terendah = suhu[i];
            }
        }

        System.out.println("Suhu tertinggi : " + tertinggi);
        System.out.println("Suhu terendah  : " + terendah);
    }
}
