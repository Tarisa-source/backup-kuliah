import java.util.Scanner;
public class Praktik_1{
	public static void main (String [] args){
		Scanner masuk = new Scanner(System.in);
		int oracle =0, ocna=0, jumlah=0;
		int jawab=1;
		System.out.println("Kategori workshop : ");
		System.out.println("1. Oracle");
		System.out.println("2. Ocna");
		while(jawab==1){
			System.out.println("Masukan kategori worksop (1/2): ");
			int kategori = masuk.nextInt();
			if(kategori==1){
				oracle++;
			}else{
				ocna++;
			}
			System.out.println("Daftar workshop lagi ??? (1.ya/2.tida) : ");
			jawab = masuk.nextInt();
		}
		System.out.println("");
		System.out.println("");
		System.out.println("Data yang dimasukan ");
		System.out.println("Jumlah oracle = "+oracle);
		System.out.println("Jumlah ocna = "+ocna);
	}
}