package bagian1.array;
public class Soal2 {
     public static void main(String[] args) {

        String[] hari = {
            "Senin",
            "Selasa",
            "Rabu",
            "Kamis",
            "Jumat"
        };

        System.out.println("Nama hari yang memiliki lebih dari 5 huruf:");

        for (String h : hari) {
            if (h.length() > 5) {
                System.out.println(h);
            }
        }
    }
}
