import java.util.Scanner;

public class Pemilihan2Percobaan111 {
    public static void main(String[] args) {
        Scanner input11 = new Scanner(System.in);

        System.out.print("Masukkan Tahun : ");
        int tahun = input11.nextInt();

        if ((tahun % 4) == 0 && (!(tahun % 100 == 0) || (tahun % 400 == 0))) {
            System.out.println("Tahun Kabisat");
        } else {
            System.out.println("Bukan Tahun Kabisat");
        }
    }
}
