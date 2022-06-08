import java.util.Scanner;
public class Tugas_No2 {
    private static String polindrome(String kata) {
        String balik = "";
        for (int i = kata.length(); i > 0; i--) {
            String a = kata.substring(i - 1, i);
            balik += a;
        }
        if (kata.equals(balik)){
            System.out.println("Kata ini adalah palindrom");
        }else{
			System.out.println("Kata ini bukan palindrom");
		}
		return kata;
    }
    public static void main(String[] args) {
        String kata;
        Scanner input = new Scanner(System.in);
        System.out.print("Input kalimat  : ");
        kata = input.nextLine();
        System.out.println(polindrome(kata));
    }
}