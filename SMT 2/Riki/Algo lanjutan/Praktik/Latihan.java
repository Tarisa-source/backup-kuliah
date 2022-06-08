import java.util.Scanner;
public class Latihan{
    public static void pertukaran(int nil1, int nil2) {
        int a, b;
        b = nil1;
        a = nil2;
        System.out.printnln("Setelah ditukar !!");
        System.out.println("Nilai ke-1 = " + a + "\nNilai ke-2 = " + b);
    }
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        int a, b;
        System.out.println("Masukan nilai ke-1 : ");
        a = masuk.nextInt();
        System.out.println("Masukan nilai ke-2 : ");
        b = masuk.nextInt();
        pertukaran(a, b);
    }
    }