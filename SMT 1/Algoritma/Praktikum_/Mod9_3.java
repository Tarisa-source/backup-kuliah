import java.util.Scanner;
public class Mod9_3{
	public static void main (String [] args){
	Scanner masuk = new Scanner (System.in);
	int bill ;
	int a = 1;
	System.out.println("Masukan jumlah perulangan : ");
	bill = masuk.nextInt();
	do{
		System.out.println("STMIK AKAKOM");
		bill--;
	}while(a <= bill );
}
}