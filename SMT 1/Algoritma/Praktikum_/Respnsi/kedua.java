import java.util.Scanner;
public class kedua{
	public static void main (String [] args){
		Scanner masuk = new Scanner(System.in);
		int awal = 4;
		int akhir;
		System.out.println("Program untuk menampilkan semua bilangan genap mulai dari 1");
		System.out.println("Masukan batas penghitungan : ");
		akhir = masuk.nextInt();
		while(awal <= akhir){
			System.out.print(awal+", ");
			awal = awal + 4;
		}
	}
}