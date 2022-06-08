import java.util.Scanner;
public class Latihan1{
	public static void main(String [] args){
		Scanner masuk = new Scanner(System.in);
		int nilai, i;
		System.out.println(" Masukan pilihan");
		System.out.println(" 1. bil ganjil");
		System.out.println(" 2. bil genap");
		System.out.print(" pilihan : ");
		nilai=masuk.nextInt();
		 if (nilai == 1) {
			 i = -1;
			 while(i <=7){
				 i = i+2;
				 System.out.println(i);
			 }
		 }
		 else{
			i = 0;
			while(i <= 8){
				i = i+2;
				System.out.println(i);
			}
		 }
	}
}