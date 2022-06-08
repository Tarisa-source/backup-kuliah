import java.util.Scanner;
public class Praktik3{
	//method rekursif
	public static int faktorial( int N ){
		if ( N <= 1 ) // kondisi terpenuhi untuk akhir rekursif
			return 1; // nilai akhir: 0! = 1 dan 1! = 1
		else // step rekursif, ada pemanggilan kembali method 'faktorial'
			return N * faktorial( N - 1 );
		}
		public static void main( String[] args ){
		int bill;
		Scanner masuk = new Scanner(System.in);
		System.out.println("Masukan bilangan yang ingin di faktorialkan : ");
		bill = masuk.nextInt();
		for(int i = 1; bill >= i;bill--){
			int hasil = faktorial(bill);
			System.out.println("Faktorial "+bill+ "= "+hasil);
		}

		}
}