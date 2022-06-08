import java.util.Scanner;
public class Lat_P6{
	public static void main (String [] args){
		Scanner masuk = new Scanner (System.in);
		int a,b,c, pilihan, jumlah, kali, kurang ;
		System.out.println("Masukan pilihan anda 1/2/3 : ");
		pilihan = masuk.nextInt();
		/**switch(pilihan){
			case 1 :
				System.out.println("Pilih 1 untuk penjumlahan 2 bilangan ");
				System.out.println("Masukan bilangan pertama : ");
				a = masuk.nextInt();
				System.out.println("Masukan bilangan ke dua ");
				b = masuk.nextInt();
				jumlah = a + b ;
				System.out.println("Hasil"+jumlah);
				break;
			case 2 :
				System.out.println("Pilih 2 untuk pengurangan 2 bilangan ");
				System.out.println("Masukan bilangan pertama : ");
				a = masuk.nextInt();
				System.out.println("Masukan bilangan ke dua : ");
				b = masuk.nextInt();
				kurang = a-b;
				System.out.println("Hasil :"+kurang);
				break;
			case 3 :
				System.out.println("Pilih 3 untuk perkalian 2 bilagan");
				System.out.println("Masukan bilangan pertama : ");
				a = masuk.nextInt();
				System.out.println("Masukan bilangan ke dua : ");
				b = masuk.nextInt();
				kali = a * b ;
				System.out.println("Hasil : "+kali);
				break;
			default:
				System.out.println("Pilihan yang anda masukan salah");
				break;
		}**/
		if (pilihan==1){
			System.out.println("Pilih 1 untuk penjumlahan 2 bilangan ");
			System.out.println("Masukan bilangan pertama : ");
			a = masuk.nextInt();
			System.out.println("Masukan bilangan ke dua ");
			b = masuk.nextInt();
			jumlah = a + b ;
			System.out.println("Hasil"+jumlah);
		}else {
			if(pilihan==2){
				System.out.println("Pilih 2 untuk pengurangan 2 bilangan ");
				System.out.println("Masukan bilangan pertama : ");
				a = masuk.nextInt();
				System.out.println("Masukan bilangan ke dua : ");
				b = masuk.nextInt();
				kurang = a-b;
				System.out.println("Hasil :"+kurang);
			}else{
				if(pilihan==3){
					System.out.println("Pilih 3 untuk perkalian 2 bilagan");
					System.out.println("Masukan bilangan pertama : ");
					a = masuk.nextInt();
					System.out.println("Masukan bilangan ke dua : ");
					b = masuk.nextInt();
					kali = a * b ;
				 	System.out.println("Hasil : "+kali);
				}else{
					System.out.println("Pilihan yang anda masukan salah");
				}
			}
		}
	}
}