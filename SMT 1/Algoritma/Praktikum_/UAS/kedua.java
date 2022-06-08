import java.util.Scanner;
public class kedua{
	public static void main (String [] args){
		Scanner masuk = new Scanner(System.in);
		int bil = 0, n;
		System.out.print("Masukan banyak bilangan : ");
		n = masuk.nextInt();
		do {
			int ang = 0;
			while(ang <= 2 ){
				System.out.println(bil+" dan "+ang);
				ang++;
			}
			bil = bil += 5;
		}while(bil<=n);

	}
}
