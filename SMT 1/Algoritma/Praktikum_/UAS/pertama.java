import java.util.Scanner;
public class pertama {
	public static void main (String [] args){
		Scanner masuk = new Scanner(System.in);
		double ipk, tinggi;
		int toefl;
		System.out.println("Seleksi penerimaan pegawai");
		System.out.println("Masukan IPK : ");
		ipk = masuk.nextDouble();
		if(ipk >= 3.75){
			System.out.println("Anda diterima");
		}else {
			if(ipk >= 3.00 && ipk < 3.75){
				System.out.println("Nilai IPK anda kurang, tolong masukan nilai TOEFL dan tinggi badan ");
				System.out.println("Nilai TOEFL : ");
				toefl = masuk.nextInt();
				System.out.println("Tinggi badan : ");
				tinggi = masuk.nextDouble();
				if(toefl>=450 && tinggi >= 165){
					System.out.println("Anda diterima");
				}else{
					System.out.println("Anda tidak diterima");
				}
			}else if(ipk < 3.00){
				System.out.println("Nilai IPK anda kurang, tolong masukan nilai TOEFL dan tinggi badan anda ");
				System.out.println("Nilai TOEFL : ");
				toefl = masuk.nextInt();
				System.out.println("Tinggi badan : ");
				tinggi = masuk.nextInt();
				if(toefl>=500 && tinggi >= 175){
					System.out.println("Anda diterima");
				}else {
					System.out.println("Anda tidak diterima ");
				}
			}
		}
	}
}