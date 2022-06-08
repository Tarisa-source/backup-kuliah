import java.util.Scanner;
public class Mod6_3{
	public static void main (String [] args){
		Scanner masuk = new Scanner (System.in);
		int kode_bulan ;
		System.out.println("Masukan kode bulan : ");
		kode_bulan = masuk.nextInt();
		if (kode_bulan == 1 || kode_bulan == 3 || kode_bulan == 5 || kode_bulan == 7 || kode_bulan == 8 || kode_bulan == 10 || kode_bulan == 12){
			System.out.println("Jumlah hari adalah 31 hari ");
		}else {
			if (kode_bulan == 4 || kode_bulan==6 || kode_bulan == 9||kode_bulan == 11){
							System.out.println("Jumlah hari adalah 30 hari ");
			}else {
						if (kode_bulan == 2){
							System.out.println("Jumlah hari adalah 28 atau 29 hari");
						}else {
							System.out.println("Kode bulan yang anda masukan salah ");
				}
			}
		}
	}
}













/**switch(kode_bulan){
			case 1: case 3 : case 5: case 7 : case 8 : case 10 : case 12 :
				System.out.println("Jumlah hari adalah 30 hari");
				//break ;
			case 4: case 6 : case 9: case 11:
				System.out.println("Jumlah hari adalah 30 hari");
				break ;
			case 2 :
				System.out.println("Jumlah hari adalah 28 atau 29 hari");
				break;
			default :
				System.out.println("Salah memasukan kode bulan");
				break;
		}**/