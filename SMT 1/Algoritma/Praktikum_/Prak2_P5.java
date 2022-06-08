import java.util.Scanner;
public class Prak2_P5{
	public static void main (String []args){
		Scanner masuk = new Scanner (System.in);
		int bil;
		System.out.println("Masukan Bilangan : ");
		bil = masuk.nextInt();
		if(bil % 2 == 0 ){
			System.out.println("Bilangan genap ");
		}else {
			System.out.println("Bilngan ganjil ");
		}
	}
}