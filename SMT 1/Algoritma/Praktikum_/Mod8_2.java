import java.util.Scanner;
public class Mod8_2{
	public static void main (String [] args){
		Scanner masuk = new Scanner (System.in);
		int bill;
		bill = 5;
		while (bill >= 1 ){
			System.out.println(bill);
			bill = bill - 1 ;
		}
	}
}