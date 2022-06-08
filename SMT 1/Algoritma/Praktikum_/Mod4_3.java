import java.util.Scanner;
public class Mod4_3{
	public static void main (String args []){
			Scanner masuk = new Scanner (System.in);
			int Bill1, Bill2, Hasil ;
			System.out.println("Masukan bilangan pertama = ");
			Bill1 = masuk.nextInt();
			System.out.println("Masukan bilangan ke dua = ");
			Bill2 = masuk.nextInt();
			Hasil = Bill1%Bill2;
			System.out.println("Hasil = "+Hasil);

	}
}