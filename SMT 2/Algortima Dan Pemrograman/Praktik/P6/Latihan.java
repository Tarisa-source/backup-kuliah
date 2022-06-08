import java.util.Scanner;

public class Latihan {
    public static void pertukaran(int nil1, int nil2) {
        int a, b;
        b = nil1;
        a = nil2;
        System.out.println("Nilai a = " + a + "\nNilai b = " + b);
    }

    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        int a, b;
        System.out.println("Masukan a : ");
        a = masuk.nextInt();
        System.out.println("Masukan b : ");
        b = masuk.nextInt();
        pertukaran(a, b);
    }
}