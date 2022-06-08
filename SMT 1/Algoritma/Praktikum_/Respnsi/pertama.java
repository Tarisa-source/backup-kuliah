import java.util.Scanner;
public class pertama {
	public static void main (String [] args){
		Scanner masuk = new Scanner(System.in);
		int thn;
		double ip;
		System.out.println("Menghitung SKS yang dapat anda anda");
		System.out.println("Masukan angkatan keberapa anda : ");
		thn = masuk.nextInt();
		System.out.println("Masukan IP Semester anda  : ");
		ip = masuk.nextDouble();
		if(thn>2014){
			if(ip >= 3.00 && ip<=4.00){
				System.out.println("Jumlah SKS maksimal yang dapat diambil = 24 sks");
			}else {
				if(ip >= 2.50 && ip <= 2.99){
					System.out.println("Jumlah SKS yang dapat diambil = 21 sks");
				}else{
					if (ip >= 2.00 && ip <= 2.49){
						System.out.println("Jumlah SKS yang dapat diambil = 18 sks");
					}else{
						if(ip >= 1.50 && ip <= 1.99){
							System.out.println("Jumlah SKS yang dapat diambil = 15 sks");
						}else{
							if(ip <= 1.49){
								System.out.println("Jumlah SKS yang dapat diambil = 12 sks");
							}
						}
					}
				}
			}
		}else{
			System.out.println("Berapapun nilai IP Semester yang anda dapatkan jumlah SKS yang dapat diambil = 24 sks ");
		}
	}
}