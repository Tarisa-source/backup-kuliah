import java.util.Scanner;
public class Kuis {
	public static void main (String [] args){
		Scanner masuk = new Scanner (System.in);
		int angkatan, teori, praktikum, praktik, total;
		System.out.println("Masukan angakatan keberapa anda : ");
		angkatan = masuk.nextInt();
		if (angkatan <= 2013 && angkatan >= 2005){
			System.out.println("Masukan total sks teori (50.000/sks): ");
			teori = masuk.nextInt();
			System.out.println("Masukan total sks praktik (75.000/sks) : ");
			praktik = masuk.nextInt();
			System.out.println("Masukan total sks praktikum (100.000/sks) : ");
			praktikum = masuk.nextInt();
			total = (teori * 50000)+(praktik *75000)+(praktikum*100000);
			System.out.println("Total bayar sks variable : "+total);
		}else {
			if (angkatan > 2013){
				System.out.println("Masukan total sks teori (75.000/sks): ");
							teori = masuk.nextInt();
							System.out.println("Masukan total sks praktik (100.000/sks) : ");
							praktik = masuk.nextInt();
							System.out.println("Masukan total sks praktikum (125.000/sks) : ");
							praktikum = masuk.nextInt();
							total = (teori * 75000)+(praktik *100000)+(praktikum*125000);
			System.out.println("Total bayar sks variable : "+total);
			}else {
				System.out.println("Angkatan yang anda masukan salah");
			}
		}
	}
}