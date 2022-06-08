import java.util.Scanner;
public class ketiga{
	public static void main (String [] args){
		Scanner masuk = new Scanner(System.in);
		int awal, akhir, tetap = 4 ;
		System.out.print("Masukan batas awal : ");
		awal = masuk.nextInt();
		System.out.print("Masukan batas akhir : ");
		akhir = masuk.nextInt();
		while(tetap <= akhir){
			System.out.print(tetap+" ");
			tetap = tetap + 4;
		}
	}
}