import java.util.Scanner;
public class Prak3{
	public static void main (String [] args){
		Scanner masuk = new Scanner (System.in);
		int a,b,c,d,e;
		double total;
		System.out.println("Menghitung rata-rata 5 buah bilangan ");
		System.out.print("Masukan angka ke-1 : ");
		a = masuk.nextInt();
		System.out.print("Masukan angka ke-2 : ");
		b = masuk.nextInt();
		System.out.print("Masukan angka ke-3 : ");
		c = masuk.nextInt();
		System.out.print("Masukan angka ke-4 : ");
		d = masuk.nextInt();
		System.out.print("Masukan angka ke-5 : ");
		e = masuk.nextInt();
		total = (a+b+c+d+e)/5;
		System.out.print("Rata-rata 5 buah bilangan tersebut : "+total);
	}
}