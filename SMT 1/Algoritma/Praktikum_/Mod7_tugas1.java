import java.util.Scanner;
public class Mod7_tugas1{
	public static void main (String [] args){
		Scanner masuk = new Scanner (System.in);
		String jenjang, jurusan;
		System.out.println("Menampilkan SPA pembayaran ");
		System.out.println("Masukan jenjang kuliah : ");
		jenjang = masuk.next();
		switch (jenjang){
			case "D3" :
				System.out.println("Masukan jurusan anda : ");
				jurusan = masuk.next();
				switch (jurusan){
					case "TK" : case "KA" : case  "MI" :
						System.out.println("Biaya SPA kamu 10.000.000");
						break;
					default :
					 	System.out.println("Jurusan yang anda masukan tidak ada ");
						break;
				}
				break;
			case "S1":
				System.out.println("Masukan jurusan anda : ");
				jurusan = masuk.next();
				switch (jurusan){
					case "TI":
						System.out.println("Biaya SPA kamu 13.000.000");
						break;
					case "SI" :
						System.out.println("Biaya SPA kamu 12.000.000");
						break;
					default :
						System.out.println("Jurusan yang anda masukan tidak ada ");
						break;
				}
		}
	}
}