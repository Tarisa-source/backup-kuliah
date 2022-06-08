import java.util.Scanner;
public class Tugas2_P9{
	public static void main (String [] args){
		Scanner masuk  = new Scanner (System.in);
		int n, a = 1, deret = 1 , deretbaru = 1 , total = 0 ;
		System.out.println("Masukan jumlah deret yang kamu inginkan : ");
		n = masuk.nextInt();
		System.out.println("Deret : ");
		do{

			System.out.println(deretbaru);
			deret = deret + 2;
			deretbaru = deretbaru + deret;
			a++;

		}while(a <= n);
	}
}