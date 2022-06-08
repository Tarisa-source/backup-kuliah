import java.util.Scanner;
public class Mod4_lat2{
	public static void main (String args[]){
		Scanner masuk = new Scanner (System.in);
		int NIM, usia, tanggal_lahir;
		String nama, tempat_lahir, email, jurusan, alamat , no_hp;
		System.out.println("Isilah biodata berikut !!!");
		System.out.println("NIM : ");
		NIM = masuk.nextInt();
		System.out.println("Nama : ");
		nama = masuk.next();
		System.out.println("Tempat lahir :");
		tempat_lahir = masuk.next();
		System.out.println("Tanggal lahir : ");
		tanggal_lahir = masuk.nextInt();
		System.out.println("Usia : ");
		usia = masuk.nextInt();
		System.out.println("No.hp : ");
		no_hp = masuk.next();
		System.out.println("E-mail : ");
		email = masuk.next();
		System.out.println("Jurusan : ");
		jurusan = masuk.next();
		System.out.println("Alamat : ");
		alamat = masuk.next();
		System.out.println("Biodata anda !!");
		System.out.println("NIM : "+NIM);
		System.out.println("Nama : "+nama);
		System.out.println("Tempat lahir : "+tempat_lahir);
		System.out.println("Tanggal lahir : "+tanggal_lahir);
		System.out.println("Usia : "+usia);
		System.out.print("No.hp : "+no_hp);
		System.out.print("E-mail : "+email);
		System.out.print("Jurusan : "+jurusan);
		System.out.print("Alamat : "+alamat);
	}
}


