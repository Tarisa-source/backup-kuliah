import java.util.Scanner;
public class Praktik_3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int bts;
		int coun = 0;
		int faktorial = 1;
		System.out.println("Masukan bilangan : ");
		bts = input.nextInt();
		for(coun=1; coun<=bts; coun++){
			faktorial *= coun;
			System.out.println("Nilai " + coun + "!" + " adalah " + faktorial);
		}
	}
}
