import java.util.Scanner;
public class Mod4_tugas2{
	public static void main (String args[]){
		Scanner masuk = new Scanner (System.in);
		double c, r, f;
		System.out.println("Masukan Celcius : ");
		c = masuk.nextInt();
		r = 0.8 *c;
		f = 1.8 * c + 32;
		System.out.println("Konversi dari Celcius ke Reamur :  "+r);
		System.out.println("Konversi dari Celcius ke Fahrenheit : "+f);
	}
}