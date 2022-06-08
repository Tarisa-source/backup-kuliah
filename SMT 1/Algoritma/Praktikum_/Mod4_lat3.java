import java.util.Scanner;
public class Mod4_lat3{
	public static void main (String args[]){
		Scanner masuk = new Scanner (System.in);
			double jari, luas;
			System.out.println("Masukan jari jari lingkaran : ");
			jari = masuk.nextInt();
			luas = 3.14 * jari * jari;
			System.out.println("Luas lingkaran adalah "+luas);

	}
}