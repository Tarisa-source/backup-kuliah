import java.util.Scanner;
public class Lat2_P10{
	public static void main (String [] args){
		Scanner masuk = new Scanner (System.in);
		int a,b, bil;
		System.out.println("Masukan angka untuk memulaii kelipatan 5  : ");
		a = masuk.nextInt();
		System.out.println("Masukan angka untuk mengakhiri : ");
		b = masuk.nextInt();
		for(bil = a; bil<=b; bil = bil+5){
			System.out.println(bil);
		}
	}
}