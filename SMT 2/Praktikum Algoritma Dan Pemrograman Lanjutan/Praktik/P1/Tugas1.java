import java.util.Scanner;
public class Tugas1{
	public static void main (String [] args){
		Scanner masuk = new Scanner(System.in);
		int kendaraan;
		String merek, nama;
		System.out.print("Jenis kendaraan (1.mobil/2.motor) : ");
		kendaraan = masuk.nextInt();
		switch(kendaraan){
			case 1:
			System.out.println("Merek (Honda/Suzuki):  ");
			merek = masuk.next();
			switch(merek){
				case "Honda":
				System.out.println("Nama kendaraan (Jazz/Brio/Mobilio) :  ");
				nama = masuk.next();
				switch(nama){
					case"Jazz":
					System.out.println("Harga mobil Jazz : Rp. 170.000.000");
					break;

					case"Brio":
					System.out.println("Harga mobil Brio : Rp. 120.000.000");
					break;

					case"Mobilio":
					System.out.println("Harga mobil Mobilio : Rp. 170.000.000");
					break;
				}
				break;

				case "Suzuki":
				System.out.println("Nama kendaraan (APV/Swift/Ertiga) :  ");
				nama = masuk.next();
				switch(nama){
					case"APV":
					System.out.println("Harga mobil APV : Rp. 180.000.000");
					break;

					case"Swift":
					System.out.println("Harga mobil Swift : Rp. 155.000.000");
					break;

					case"Ertiga":
					System.out.println("Harga mobil Ertiga : Rp. 160.000.000");
					break;
				}
			}
				break;

			case 2:
			System.out.println("Merek (Honda/Yamaha):  ");
			merek = masuk.next();
			switch(merek){
				case "Honda":
				System.out.println("Nama kendaraan (Vario/Supra) :  ");
				nama = masuk.next();
				switch(nama){
					case"Vario":
					System.out.println("Harga motor Vario : Rp. 15.000.000");
					break;

					case"Supra":
					System.out.println("Harga motor Supra : Rp. 12.000.000");
					break;

				}
				break;

				case "Yamaha":
				System.out.println("Nama kendaraan (Mio/Swift) :  ");
				nama = masuk.next();
				switch(nama){
					case"Mio":
					System.out.println("Harga motor Mio: Rp. 14.000.000");
					break;

					case"Vixion":
					System.out.println("Harga motor Swift : Rp. 20.000.000");
					break;

				}
				break;
			}
			break;

			default:
			System.out.println("Salah masukan input !!");

		}
	}
}
