import java.util.Scanner;
public class Latihan3{
	public static void main (String [] args){
		Scanner masuk = new Scanner(System.in);
		int gel;
		String jen, jur;
		System.out.print("Masukan gelombang (1/2) : ");
		gel = masuk.nextInt();
		System.out.println("Masukan jenjang (D3/S1): ");
		jen = masuk.next();
		System.out.println("Masukan jurusan : ");
		jur = masuk.next();

		if(gel==1){
			if(jen.equals("D3")){
				if(jur.equals("TK")){
					System.out.println("SPA gel "+gel+" : Rp. 8.600.000 ");
				}else{
					if(jur.equals("KA")){
						System.out.println("SPA gel "+gel+" : Rp. 8.600.000 ");
					}else if(jur.equals("KA")){
						System.out.println("SPA gel "+gel+" : Rp. 8.600.000 ");
					}else{
						System.out.println("Salah masuk jurusan ");
					}
				}
			}else{
				if(jur.equals("TI")){
					System.out.println("SPA gel "+gel+" : Rp. 13.400.000 ");
				}else if (jur.equals("SI")){
					System.out.println("SPA gel "+gel+" : Rp. 12.400.000 ");
				}else {
					System.out.println("jurusan tidak terdaftar");
				}
			}
		}else if (gel==2){
			if(jen.equals("D3")){
				if(jur.equals("TK")){
					System.out.println("SPA gel "+gel+" : Rp. 9.100.000 ");
				}else{
					if(jur.equals("KA")){
						System.out.println("SPA gel "+gel+" : Rp. 9.100.000 ");
					}else if(jur.equals("KA")){
						System.out.println("SPA gel "+gel+" : Rp. 9.100.000 ");
					}else{
						System.out.println("Salah masuk jurusan ");
					}
				}
			}else{
				if(jur.equals("TI")){
					System.out.println("SPA gel "+gel+" : Rp. 13.900.000 ");
				}else if (jur.equals("SI")){
					System.out.println("SPA gel "+gel+" : Rp. 12.900.000 ");
				}else{
					System.out.println("jurusan tidak terdaftar");
				}
			}
		}else{
			System.out.println("Salah masukkan gelombang");
		}
	}
}