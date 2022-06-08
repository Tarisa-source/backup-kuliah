import java.util.Scanner;
public class Mod8_3{
	public static void main (String [] args){
		boolean running = true;
		int counter = 0;
		String jawab;
		Scanner scan = new Scanner (System.in);
		while (running){
			System.out.println("STMIK AKAKOM");
			System.out.println("Tampilkan tulisan lagi [ya/tidak]>");
			jawab = scan.nextLine();
			if (jawab.equalsIgnoreCase("tidak")){
				running = false;
			}
			counter++;
		}
		System.out.println("Anda sudah melakukan perulangan sebanyak "+counter+"kali");
	}
}