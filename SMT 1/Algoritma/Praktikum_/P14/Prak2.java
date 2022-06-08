import java.util.Scanner;
public class Prak2{
	public static void main (String [] args){
		Scanner masuk = new Scanner (System.in);
		double R1, R2, R3, total;
		System.out.print("Masukan R1 : ");
		R1 = masuk.nextInt();
		System.out.print("Masukan R2 : ");
		R2 = masuk.nextInt();
		System.out.print("Masukan R3 : ");
		R3 = masuk.nextInt();
		total = 1/R1+1/R2+1/R3;
		total = 1/total;
		System.out.println("Total nilai R : "+total);
	}
}