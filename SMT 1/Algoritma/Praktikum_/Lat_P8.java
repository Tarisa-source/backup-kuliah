import java.util.Scanner;
public class Lat_P8{
	public static void main (String [] args){
		Scanner masuk = new Scanner (System.in);
		int awal, akhir;
		System.out.println("Menghitung bilangan genap");
		System.out.println("Masukan bilangan pertama untuk memulai meghitung bilangan : ");
		awal = masuk.nextInt();
		System.out.println("Masukan bilangan terakhir untuk mengakhiri perhitungan bilangan : ");
		akhir = masuk.nextInt();
		while(awal <= akhir && awal % 2 == 0){
			System.out.println();
			System.out.println(awal);
			awal = awal + 2;
		}
	}
}