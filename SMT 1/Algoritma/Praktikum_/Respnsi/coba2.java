import java.util.Scanner;
public class coba2{
	public static void main (String [] args){
		Scanner masuk = new Scanner(System.in);
		int menu, paket, jawab;
		double sub_total = 0 ;
		System.out.println("Pilih menu : 1(Nasi)/2(Mi) ");
		menu = masuk.nextInt();
		switch(menu){
			case 1 :

			System.out.println("Masukan paket : 1(Nasi ayam)/2(Nasi lele) ");
			paket = masuk.nextInt();
			switch(paket){
				case 1:
				double nasi_ayam = 14.000;
				System.out.println("Sub total : "+nasi_ayam);
				sub_total = nasi_ayam;
				break;
				case 2 :
				double nasi_lele = 12.000;
				System.out.println("Sub total : "+nasi_lele);
				sub_total = nasi_lele;
				break;
			}
			break;

			case 2:
			System.out.println("Masukan paket : 1(Mi goreng)/2(Mi rebus) ");
			paket = masuk.nextInt();
			switch(paket){
				case 1 :
				double mi_goreng = 12.000;
				System.out.println("Sub total :  "+mi_goreng);
				sub_total = mi_goreng;
				break;

				case 2 :
				double mi_rebus = 12.500;
				System.out.println("Sub total : "+mi_rebus);
				sub_total = mi_rebus;
				break;

			}
			break;

			default:
			System.out.println("Kode yang anda masukan salah");
			break;
		}
		//double total = total + sub_total;
	}
}