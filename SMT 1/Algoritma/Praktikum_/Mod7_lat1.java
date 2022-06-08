import java.util.Scanner;
public class Mod7_lat1{
	public static void main (String [] args){
		Scanner masuk = new Scanner (System.in);
		int pil,jenis;
		System.out.println("Masukan kode angka");
		System.out.println("Masukan pilihan mobil(1)/motor(2) :");
		pil = masuk.nextInt();
		if (pil == 1 ){
			System.out.println("Masukan kode angka ");
			System.out.println("Mobil  apa yang anda pilih Jazz (1) / Brio (2) / Moilio (3)  : ");
			jenis = masuk.nextInt();
			if (jenis == 1){
				System.out.println("Harga mobil Jazz = 170.000.000");
			}else {
				if (jenis == 2){
					System.out.println("Harga mobil Brio = 120.000.000");
				}else {
					if (jenis == 3){
						System.out.println("Harga mobil Mobilio : 170.000.000");
					}else {
						System.out.println("Pilihan mobil yang anda masukan salah ");
					}
				}
			}
		}else{
			if (pil == 2 ){
				System.out.println("Masukan kode angka ");
				System.out.println("Masukan  motor apa yang anda pilih Vario(1) / Beat (2) / Vixion (3) : ");
				jenis = masuk.nextInt();
				if (jenis == 1){
					System.out.println("Harga motor  Vario = 16.000.000");
				}else {
					if (jenis == 2){
						System.out.println("Harga motor Beat = 12.000.000 ");
					}else {
						if (jenis == 3){
							System.out.println("Harga motor Vixion = 20.000.000");
						}else {
							System.out.println("Pilihan motor yang anda masukan salah ");
						}
					}
				}
			}
		}
	}
}