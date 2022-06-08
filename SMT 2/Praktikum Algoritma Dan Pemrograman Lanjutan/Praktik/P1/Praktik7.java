import java.util.Scanner;
public class Praktik7{
	public static void main (String [] args){
		Scanner masuk = new Scanner(System.in);
		//deklarasi var dan scanner
		int belanja, diskon, bayar;
		String kartu;
		//mengambil input
		System.out.println("Apakah ada kartu member : ");
		kartu = masuk.nextLine();
		System.out.println("Total belanja : ");
		belanja = masuk.nextInt();

		//proses
		if(kartu.equalsIgnoreCase("ya")){
			if(belanja > 500000){
				diskon = 50000;
			}else if (belanja > 100000){
				diskon = 15000;
			}else{
				diskon = 0;
			}
		}else{
			if(belanja > 100000){
				diskon = 5000;
			}else{
				diskon = 0;
			}
		}
		// Bayar
		bayar = belanja - diskon;

		// output
		System.out.println("Total bayar Rp. "+bayar);
	}
}