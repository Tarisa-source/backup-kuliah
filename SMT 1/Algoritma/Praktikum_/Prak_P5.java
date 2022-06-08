import java.util.Scanner;
public class Prak_P5 {
	public static void main (String [] args){
		Scanner masuk = new Scanner (System.in);
		int bill ;
		System.out.println("Masukan bilangan : ");
		bill = masuk.nextInt();
		if(bill==0){
			System.out.println("Bilangan 0");
		}
	}
}
