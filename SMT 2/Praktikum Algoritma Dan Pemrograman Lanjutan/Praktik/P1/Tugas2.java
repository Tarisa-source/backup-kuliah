import java.util.Scanner;
public class Tugas2{
	public static void main (String [] args){
		Scanner masuk = new Scanner (System.in);
		int tahun, bulan;
		System.out.print("Masukan tahun : ");
		tahun = masuk.nextInt();
		System.out.print("Masukan bulan (dalam angka) : ");
		bulan = masuk.nextInt();
		switch(bulan){
				case 1 :
				System.out.print("Bulan = Januari, Hari = 31 ");
				break;

				case 2 :
					if(tahun%4 == 0 ){
						System.out.print("Bulan = Februari, Jumlah hari = 29 ");
					}else{
						System.out.print("Bulan = Februari, Jumlah hari = 28 ");
					}
				break;

				case 3 :
				System.out.print("Bulan = Maret, Jumlah hari = 31");
				break;

				case 4 :
				System.out.print("Bulan = April, Jumlah hari = 30");
				break;

				case 5 :
				System.out.print("Bulan = Mei, Jumlah hari = 31");
				break;

				case 6 :
				System.out.print("Bulan = Juni, Jumlah hari = 30");
				break;

				case 7 :
				System.out.print("Bulan = Juli, Jumlah hari = 31");
				break;

				case 8 :
				System.out.print("Bulan = Agustus, Jumlah hari = 30");
				break;

				case 9 :
				System.out.print("Bulan = September, Jumlah hari = 30");
				break;

				case 10 :
				System.out.print("Bulan = Oktober, Jumlah hari = 31");
				break;

				case 11:
				System.out.print("Bulan = November, Jumlah hari = 30 ");
				break;

				case 12:
				System.out.print("Bulan = Desember, Jumlah hari = 31");
				break;

				default:
				System.out.print("Salah masukan bulan!!");
				break;


		}
	}

}