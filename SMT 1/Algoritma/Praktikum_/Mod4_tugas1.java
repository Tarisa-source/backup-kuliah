import java.util.Scanner;
public class Mod4_tugas1{
	public static void main (String args[]){
		Scanner masuk = new Scanner (System.in);
		double gaji_pokok, kinerja, lain, total;
		System.out.println("Masukan gaji pokok ");
		gaji_pokok = masuk.nextInt();
		kinerja = 0.2 * gaji_pokok ;
		lain = 0.1 *kinerja ;
		total = gaji_pokok + kinerja + lain;
		System.out.println("Total gaji anda :"+total);
	}
}