import java.util.Scanner;
public class Praktik_2{
	public static void main (String [] args){
		Scanner masuk = new Scanner(System.in);
		int score, sum=0;
		do{
			System.out.print("Masukan nilai -1 untuk keluar : ");
			score = masuk.nextInt();
			if(score != 1 )
				sum = sum + score;

		}while(score != -1);
			System.out.println("Hasil penjumlahan : "+sum);

	}
}