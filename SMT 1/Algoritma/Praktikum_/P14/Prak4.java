import java.util.Scanner;
public class Prak4{
	public static void main (String [] args){
		Scanner masuk = new Scanner(System.in);
		int banyak;
		double hasil = 0;
		int total = 0 ;
		int awal = 0;
		int  bill = 1;
		System.out.print("Masukan jumlah bilangan yang ingin di rata-rata : ");
		banyak = masuk.nextInt();
		for(int a = 1; a<=banyak; a++){
			System.out.print("Masukan angka : ");
			awal = masuk.nextInt();
			total = total + awal;
			hasil = total/banyak;
		}
		System.out.println("Total bilangan : "+total);
		System.out.println("Rata-rata bilangan : "+hasil);
	}
}