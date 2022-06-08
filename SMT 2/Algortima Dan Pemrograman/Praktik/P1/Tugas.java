import java.util.Scanner;
public class Tugas{
	public static void main (String [] args){
		Scanner masuk = new Scanner(System.in);
		int buku, diskon, admin;
		String kartu;
		System.out.println("Apakah ada kartu member (Y/T) : ");
		kartu = masuk.nextLine();
		System.out.println("Total buku yang dipinjam (1 buku = 5k): ");
		buku = masuk.nextInt();
		int total = 5000 * buku;
		if(kartu.equalsIgnoreCase("Y")){
			if(total > 25000 && total < 50000){
				diskon = 5000;
			}else if (total >= 2000 && total <= 50000 ){
				diskon = 4000;
			}else{
				diskon = 2000;
			}
		}else{
			if(total > 25000 && total <= 10000){
				diskon = 2000;
			}else{
				diskon = 0;
			}
		}
		admin = total - diskon;
		System.out.println("Total biaya admin Rp. "+admin);
	}
}