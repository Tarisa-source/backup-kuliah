import java.util.Scanner;
public class Mod12_3{
	public static void main (String [] args){
		Scanner masuk = new Scanner(System.in);
		int JPB = 0, JM = 0, jumlah = 0 ;
		int jawab = 1;
		System.out.println("Kategori barang : ");
		System.out.println("1. Pecah Belah : ");
		System.out.println("2. Makanan : ");
		while(jawab!=0){
			System.out.println("Masukan kategori barang (1,2) : ");
			int kategori = masuk.nextInt();
			if(kategori ==1){
					JPB++;
			}else{
				JM++;
			}
			System.out.println("Barang habis ? (0=ya, 1=tidak)");
			jawab = masuk.nextInt();
		}
		System.out.println("");System.out.println("");
		System.out.println("Data yang dimasukan ");
		System.out.println("Jumlah pecah = "+JPB);
		System.out.println("Jumlah makanan = "+JM);
	}
}