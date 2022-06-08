import java.util.Scanner;
public class Mod4_5{
	public static void main (String args[]){
	 Scanner masuk = new Scanner (System.in);
	 int A, B, C, D;
	 System.out.println("Masukan B = ");
	 B = masuk.nextInt();
	 System.out.println("Masukan C = ");
	 C = masuk.nextInt();
	 System.out.println("Masukan D = ");
	 D = masuk.nextInt();
	 A = B+C*D;
	 System.out.println("Hasil = "+A);
	}
}