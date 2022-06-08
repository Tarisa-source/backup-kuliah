import java.util.Scanner;
public class Mod8_4{
	public static void main (String [] args){
		Scanner masuk = new Scanner (System.in);
		int bill;
		bill = 2;
		while (bill <= 10 && bill % 2 == 0 ){
			System.out.println(bill);
			bill = bill + 2 ;
		}
	}
}