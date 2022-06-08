import java.util.Scanner;
public class Tugas2 {
    private static Boolean polindrome(String kata) {
        String balik = "";
        for (int i = kata.length(); i > 0; i--) {
            String a = kata.substring(i - 1, i);
            balik += a;
        }
        if (kata.equals(balik)) {
            return true;
        }
        return false;

    }

    public static void main(String[] args) {
        String kata;
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan kata : ");
        kata = scan.nextLine();
        System.out.println(polindrome(kata));
    }
}