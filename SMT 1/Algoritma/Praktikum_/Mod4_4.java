import java.util.Scanner;
public class Mod4_4{
	public static void main (String args[]){
		Scanner masuk = new Scanner (System.in);
		int m;
		float cm,inci;
		System.out.println("Masukan meter = ");
		m = masuk.nextInt();
		cm = m*100;
		inci = m*100/2.54f;
		System.out.println("Konversi dari meter ke cm ="+cm);
		System.out.println("Konversi dari meter ke inci = "+inci);
	}
}