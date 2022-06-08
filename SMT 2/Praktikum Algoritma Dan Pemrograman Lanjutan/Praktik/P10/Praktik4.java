import java.util.Scanner;
public class Praktik4{
	public static int hitungJumlah(int[] x){
		int jum=0;

		for (int i=0;i<x.length;i++){
			jum += x[i];
		}

		return jum;
	}

	public static void main(String[] args) {
		 int data[] = new int[10];
		 int jumlah;
		 int total;
		 Scanner scan = new Scanner(System.in);
		 for (int i=0;i<10;i++){
			 System.out.println("Masukkan data ke-"+(i+1)+":");
			 data[i] = scan.nextInt();
		 }
		 jumlah = hitungJumlah(data);
		 total = jumlah / 10;
		 System.out.println("Jumlah data = "+jumlah);
	 }

}