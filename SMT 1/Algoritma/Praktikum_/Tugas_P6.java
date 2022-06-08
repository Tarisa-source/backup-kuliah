import java.util.Scanner;
public class Tugas_P6{
	public static void main (String [] args){
		Scanner masuk = new Scanner (System.in);
		int bil1, bil2, bil3 ;
		System.out.println("Masukan bilangan pertama : ");
		bil1 = masuk.nextInt();
		System.out.println("Masukan bilangan kedua : ");
		bil2 = masuk.nextInt();
		System.out.println("Masukan bilangan ketiga : ");
		bil3 = masuk.nextInt();
		if (bil1 >= bil2 && bil1>=bil3){
			System.out.println("Bilangan terbesar adalah : "+bil1);
		}else{
			if(bil2 >= bil1 && bil2 >= bil3){
				System.out.println("Bilangan terbesar adalah : "+bil2);
			}else{
				System.out.println("Bilangan terbesar adalah : "+bil3);
			}
		}
	}
}