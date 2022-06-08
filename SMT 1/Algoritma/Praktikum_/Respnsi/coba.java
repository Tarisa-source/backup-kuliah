import java.util.Scanner;
public class coba{
	public static void main (String [] args){
		Scanner masuk = new Scanner(System.in);
		Scanner scan = new Scanner(System.in);
		String menu, paket, jawab;

		boolean running = true;
		System.out.print("Pilih menu : A(Nasi/B(Mi)  ");
		menu = masuk.nextLine();
		while(running){
			double sub_total, total;
			if(menu.equalsIgnoreCase("A")){
				System.out.println("Pilih paket : A(Nasi ayam)/B(Nasi Lele)");
				paket = scan.nextLine();
				if(paket.equalsIgnoreCase("A")) {
					sub_total = 15.000;
					System.out.print("Sub total = "+sub_total);
				}else if (paket.equalsIgnoreCase("B")){
					sub_total = 12.000;
					System.out.println("Subt total = 12.000"+sub_total);
				}
			}else if (menu.equalsIgnoreCase("B")){
				System.out.println("Pilih paket : 1(Mi goreng)/2(Mi rebus)");
				paket = scan.nextLine();
				if(paket.equalsIgnoreCase("B")) {
								sub_total = 14.000;
								System.out.print("Sub total = "+sub_total);
				}else if (paket.equalsIgnoreCase("B")){
					sub_total = 14.500;
					System.out.println("Subt total ="+sub_total);
				}
				System.out.println("Ingin pesan lagi ? [ya/tidak] ");
							jawab = masuk.nextLine();
							if (jawab.equalsIgnoreCase("tidak")){
								running = false;
								total = sub_total + total;
								System.out.println("Total bayar : "+total);
			}
			}

		}
	}
}