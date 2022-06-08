import java.util.Scanner;
public class Mod9_1{
	public static void main (String [] args){
		Scanner masuk = new Scanner (System.in);
		int bill;
		bill = 20;
		do{
			System.out.println(bill);
			bill+= 2;
		}while(bill<=10);
	}
}