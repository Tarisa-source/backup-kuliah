import java.util.Scanner;
public class uts {
	public static void main (String [] args){
		Scanner masuk = new Scanner (System.in);
		int total, angkatan, teori, praktik, praktikum;
		System.out.println("Menghitung total sks variable .");
		System.out.println("-------------------------------");
		System.out.println("Masukan total sks teori yang anda ikuti : ");
		teori = masuk.nextInt();
		System.out.println("Masukan total sks praktik yang anda ikuti :");
		praktik = masuk.nextInt();
		System.out.println("Masukan total sks praktikum yang anda ikuti : ");
		praktikum = masuk.nextInt();
		System.out.println("Masukan angkatan anda : ");
		angkatan = masuk.nextInt();
		if (angkatan <= 2013 && angkatan >= 2015 ){
			total = (teori * 50000)+(praktik * 75000)+(praktikum * 100000);
			System.out.println("Total biaya sks variable anda : "+total);
		}else {
			if (angkatan >= 2014){
				total = (teori * 75000)+(praktik * 100000)+(praktikum * 125000);
				System.out.println("Total biaya sks variable anda : "+total);
			}else{
				System.out.println("Angkatan yang anda masukan salah ");
			}
		}
	}
}