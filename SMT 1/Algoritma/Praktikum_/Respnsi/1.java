import java.util.Scanner;
public class 1 {
	public static void main (String [] args){
		Scanner masuk = new Scanner(System.in);
		int thn;
		double ip;
		System.out.println("Menghitung SKS yang dapat anda anda");
		System.out.println("Masukan angkatan keberapa anda : ");
		thn = masuk.nexInt();
		System.out.println("Masukan IP Semester anda  : ");
		ip = masuk.nextDouble();
		if(angkatan>2014){
			if(ip >= 3.00 && ip<=4.00){
				System.out.println("Jumlah SKS maksimal yang dapat diambil = 24 sks");
			}else {
				if(ip >= 2.50 && ip <= 2.49){
					System.out.println("Jumlah SKS yang dapat diambil = 21 sks");
				}
			}
		}else{
			System.out.println("Jumlah SKS yang dapat diambil = 24 sks ");
		}
	}
}