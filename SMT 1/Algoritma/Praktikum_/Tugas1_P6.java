import java.util.Scanner;
public class Tugas1_P6{
	public static void main (String [] args){
		Scanner masuk = new Scanner (System.in);
		int kode, persegi, p, l, r;
		float lingkaran;
		System.out.println("Masukan kode : ");
		kode = masuk.nextInt();
		switch (kode = 1 ){
			case 1 :
				 System.out.println("Menghitung luas persegi panjang !!");
				 System.out.println("Masukan panjang : ");
				 p = masuk.nextInt();
				 System.out.println("Masukan lebar : ");
				 l = masuk.nextInt();
				 persegi = p*l;
				 System.out.println("Luas persegi panjang adalag "+persegi);
				 break;
			case 2 :
				System.out.println("Menhitung luas lingkaran ");
				System.out.println("Masukan jari - jari lingkaran : ");
				r = masuk.nextInt();
				lingkaran = 3.14f * r * r ;
				System.out.println("Luas lingkaran adalah "+lingkaran);
				break;
			default :
				System.out.println("Kode yang anda masukan salah ");
		}
	}
}