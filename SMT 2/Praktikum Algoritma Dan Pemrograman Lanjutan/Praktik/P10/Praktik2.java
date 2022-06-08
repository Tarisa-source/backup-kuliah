import java.util.Scanner;
public class Praktik2{
	public static void cetakUlang(String kalimat,int nUlang){
		for (int i = 0; i < nUlang; i++) {
			System.out.println(kalimat);
		}
	}
	public static void main(String[] args) {
		String kalimat;
		int nUlang;
		Scanner scan = new Scanner(System.in);
		System.out.print("Masukkan kalimat : ");
		kalimat = scan.nextLine();
		System.out.print("Akan dicetak berapa kali ?  : ");
		nUlang = scan.nextInt();
		cetakUlang(kalimat, nUlang);
    }
}