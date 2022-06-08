import java.util.Scanner;
public class ketiga{
	public static void main (String [] args){
		Scanner masuk = new Scanner(System.in);
		double nasi_ayam = 15.000, nasi_lele = 12.000, mi_goreng = 14.000, mi_rebus= 14.500, total = 0, awal, sub_total;
		int menu, paket;
		boolean running = true;
		String jawab;
		while(running){
		System.out.print("Pilih menu : 1(Nasi)/2(Mi) : ");
		menu = masuk.nextInt();
			switch(menu){
				case 1 :
				System.out.print("Pilih paket  : 1(Nasi Ayam)/2(Nasi Lele) : ");
				paket = masuk.nextInt();
				switch(paket){
					case 1 :
					System.out.println("Sub total : "+nasi_ayam);
					sub_total = nasi_ayam;
					break;

					case 2 :
					System.out.println("Sub total : "+nasi_lele);
					sub_total = nasi_lele;
					break;
				}
				break;

				case 2 :
				System.out.print("Pilih paket  : 1(Mi goreng)/2(Mi rebus) : ");
				paket = masuk.nextInt();
				switch(paket){
					case 1 :
					System.out.println("Sub total : "+mi_goreng);
					sub_total = mi_goreng;
					break;

					case 2 :
					System.out.println("Sub total : "+mi_rebus);
					sub_total = mi_rebus;
					break;
				}
				break;

				default :
				System.out.println("Salah masukkan pilihan");
				break;
			}
			System.out.println("Ingin pesan lagi ? [ya/tidak] ");
			jawab = masuk.nextLine();
			if( jawab.equalsIgnoreCase("tidak") ){
			 running = false;
 			}else if(jawab.equalsIgnoreCase("ya")){
				running = true;
			}
		}
	}
}