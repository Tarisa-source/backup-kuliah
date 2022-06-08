import java.util.Scanner;
class Mod6_2{
	public static void main (String [] args){
		Scanner in = new Scanner (System.in);
		String kode;
		System.out.println("Masukan Kode Jurusan : ");
		kode = in.next();
		switch (kode){
			case "TI":
				System.out.println("Teknik Informatika");
				break;
			case "TK":
				System.out.println("Teknik Komputer");
				break;
			case "MI":
				System.out.println("Menejemen Informatika");
				break;
			case "SI":
				System.out.println("Sistem Informasi");
				break;
			case "KA":
				System.out.println("Komputerisasi Akuntansi");
				break;
			//default :
			//	System.out.println("Kode yang anda masukan salah ");
		}
	}
}