import java.util.Scanner;
public class Tugas2_P10{
	public static void main (String [] args){
		Scanner masuk = new Scanner (System.in);
		int a,b,bil, c = 0, d=0, e;
		System.out.println("Masukan angka untuk memulaii kelipatan 5  : ");
		a = masuk.nextInt();
		System.out.println("Masukan angka untuk mengakhiri : ");
		b = masuk.nextInt();
		for(bil = a; bil<=b; bil = bil+5){
			c = c + bil;
			System.out.println(bil);
		}
		System.out.println("Total : "+c);
		for (bil = 0; bil<20; bil++){
			d = d + bil;
			System.out.print(bil+",");
		}
		System.out.println();
		System.out.println("Total : " +d);

		e = c + d;
		System.out.println("Total semua : " +e);

	}
}