import java.util.Scanner;
public class Latihan4{
	public static void main (String [] args){
		Scanner masuk = new Scanner(System.in);
		int gel;
		String jen, jur;
		System.out.print("Masukan gelombang (1/2/3) : ");
		gel = masuk.nextInt();
		System.out.print("Masukan jenjang (D3/S1): ");
		jen = masuk.next();
		System.out.print("Masukan jurusan : ");
		jur = masuk.next();
		switch(gel){
			case 1:
			switch(jen){
				case "D3":
				System.out.println("SPA gel "+gel+" : Rp. 8.600.000 ");
				break;

				case "S1":
				switch(jur){
					case "TI":
					System.out.println("SPA gel "+gel+" : Rp. 13.400.000 ");
					break;

					case "SI":
					System.out.println("SPA gel "+gel+" : Rp. 12.400.000 ");
					break;

					default:
					System.out.println("jurusan tidak terdaftar");
				}
				break;
			}
			break;

			case 2:
			switch(jen){
				case "D3":
				System.out.println("SPA gel "+gel+" : Rp. 9.100.000 ");
				break;

				case "S1":
				switch(jur){
					case "TI":
					System.out.println("SPA gel "+gel+" : Rp. 13.900.000 ");
					break;

					case "SI":
					System.out.println("SPA gel "+gel+" : Rp. 12.900.000 ");
					break;

					default:
					System.out.println("jurusan tidak terdaftar");
				}
				break;
			}
			break;

			case 3:
			switch(jen){
				case "D3":
				System.out.println("SPA gel "+gel+" : Rp. 9.600.000 ");
				break;

				case "S1":
				switch(jur){
					case "TI":
					System.out.println("SPA gel "+gel+" : Rp. 14.400.000 ");
					break;

					case "SI":
					System.out.println("SPA gel "+gel+" : Rp. 13.400.000 ");
					break;

					default:
					System.out.println("jurusan tidak terdaftar");
				}
				break;
			}
			break;


			default:
			System.out.println("Salah masukkan gelombang");
		}
	}
}