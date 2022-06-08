import java.util.Random;
import java.util.Scanner;
public class Mod3{
	public static void main (String [] args){
		String prinsip;
		int i, pill, acak;
		Scanner masuk = new Scanner (System.in);
		Random rd = new Random();
		System.out.println("   Menu    ");
		System.out.println("1. Bilangan Random ");
		System.out.println("2. Semboyan hidup ");
		System.out.print("Masukan pilihan : ");
		pill = masuk.nextInt();
		if(pill==1){
			System.out.println("Angka keberuntungan anda  = ");
			for(i = 1; i<=3; i++){
				acak = rd.nextInt(20);
				System.out.println(acak);
			}
		}else{
			System.out.println("Masukan prinsip anda : ");
			prinsip = masuk.next();
			System.out.println("Prinsip anda = "+prinsip);
		}
	}
}