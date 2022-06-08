import java.util.Scanner;
public class Praktik3 {
	public static void main(String[] args) {
		Scanner masuk = new Scanner(System.in);
		int batas;
		int counter = 0;
		int faktorial = 1;
		System.out.println("Masukan bilangan yang ingin di faktorialkan : ");
		batas = masuk.nextInt();
		for(counter=1; counter<=batas; counter++){
			faktorial *= counter;
			System.out.println("Nilai " + counter + "!" + " adalah " + faktorial);
		}
	}
}
