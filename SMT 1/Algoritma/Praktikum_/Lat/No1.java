import java.math.BigDecimal;
import java.util.Scanner;
public class No1{
	public static void main (String [] args){
		Scanner masuk = new Scanner(System.in);
		int  thn;
		double jumlah_dis, jml,jumlah_pembayaran;
		String nama;
		double sewa = 10.000000;
		BigDecimal besar = new BigDecimal(sewa);
		System.out.println("Pembayaran Sewa Kontrakan");
		System.out.println("1 tahun = 10.000.000");
		System.out.print("Nama penyewa : ");
		nama = masuk.nextLine();
		System.out.print("Jumlah tahun : ");
		thn = masuk.nextInt();
		if(thn==3||thn>3){
			jml = besar * thn;
			jumlah_dis = 0.2 * jml;
			jumlah_pembayaran = jml - jumlah_dis;
			System.out.println("Nama : "+nama);
			System.out.println("Porsen Diskon = 20%");
			System.out.println("Jumlah diskon = "+jumlah_dis);
			System.out.println("Total Bayar  = "+jumlah_pembayaran);
		}else{
			if(thn==2){
				jml = besar * thn;
				jumlah_dis = 0.1 * jml;
				jumlah_pembayaran = jml - jumlah_dis;
				System.out.println("Nama : "+nama);
				System.out.println("Porsen Diskon = 10%");
				System.out.println("Jumlah diskon = "+jumlah_dis);
				System.out.println("Total Bayar  = "+jumlah_pembayaran);
			}else{
				jml = besar * thn;
				System.out.println("Nama : "+nama);
				System.out.println("Total Bayar  = "+jml);
			}
		}
	}
}