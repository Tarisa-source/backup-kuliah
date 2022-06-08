import java.util.Scanner;
public class Tugas1_P5{
	public static void main (String [] args){
		Scanner masuk = new Scanner (System.in);
		int terkecil, terbesar, bil1, bil2, bil3 ;
		System.out.println("Masukan bilangan pertama : ");
		bil1 = masuk.nextInt();
		System.out.println("Masukan bilangan ke dua : ");
		bil2 = masuk.nextInt();
		System.out.println("Masukan bilangan ke tiga : ");
		bil3 = masuk.nextInt();

		if (bil1>bil2 && bil2>bil3){
			terbesar = bil1;
		}else {
			if(bil2>bil1 && bil2>bil3){
				terbesar = bil2;
			}else {
				terbesar = bil3;
			}
		}

		if(bil1>bil2 && bil2>bil3){
			terkecil = bil3;
		}else {
			if(bil1>bil2){
				terkecil = bil2;
			}else {
				terkecil = bil1;
			}
		}
		System.out.println("Terbesar adalah "+terbesar);
		System.out.println("Terkecil adalah "+terkecil);
	}
}