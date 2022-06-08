import java.util.Scanner;
public class Lat2_P9{
	public static void main (String [] args){
		boolean running = true;
		String jawab;
		Scanner scan = new Scanner (System.in);
		do{
			System.out.println("STMIK AKAKOM");
			System.out.println("Tampilkan tulisan lagi [ya/tidak]>");
			jawab = scan.nextLine();
			if (jawab.equalsIgnoreCase("tidak")){
				running = false;
			}
		}while (running);
	}
}