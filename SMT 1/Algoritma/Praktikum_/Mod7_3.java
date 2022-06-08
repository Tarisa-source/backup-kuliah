import java.util.Scanner;
public class Mod7_3{
	public static void main (String [] args){
		Scanner masuk = new Scanner (System.in);
		String pil, jenis;
		System.out.println("Hitung persegi/lingkaran");
		System.out.println("========================");
		System.out.println("Masukan pilihan");
		pil = masuk.next();
		switch(pil){
			case "persegi":
			int sisi;
			System.out.println("Masukan panjang sisi persegi : ");
			sisi = masuk.nextInt();
			System.out.println("Menghitung luas / keliling : ");
			jenis = masuk.next();
			switch (jenis){
				case "luas":
					int luas ;
					luas = sisi * sisi;
					System.out.println("Luas persegi : "+luas);
					break;
				case "keliling":
					int keliling ;
					keliling = 4*sisi;
					System.out.println("Keliling persegi : "+keliling);
					break ;
				default :
					System.out.println("Salah masukan jenis");
					break;
			}
			/**break;**/
			case "lingkaran":
			double jari;
			System.out.println("Masukan panjang jari jari lingkaran : ");
			jari = masuk.nextInt();
			System.out.println("Menghitung luas / keliling");
			jenis = masuk.next();
			switch (jenis){
				case "luas":
					double luas;
					luas = 3.14f * jari * jari ;
					System.out.println("Luas lingkaran : "+luas);
					break;
				case "keliling":
					double keliling ;
					keliling = 3.14f * jari *2 ;
					System.out.println("Keliling lingkaran : "+keliling);
					break ;
				default :
					System.out.println("Salah masukan jenis");
					break;
			}
			break;
			default :
			System.out.println("Salah masukan pilihan ");
			break;
		}
	}
}