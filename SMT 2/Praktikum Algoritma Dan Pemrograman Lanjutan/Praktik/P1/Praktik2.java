import java.util.Scanner;
public class Praktik2{
	public static void main (String [] args){
		Scanner in = new Scanner(System.in);
		int nilai;
		System.out.print("Masukan angka dari bulat dari (0-100) : ");
		nilai = in.nextInt();
		if (nilai>=60){
			if (nilai>=80){
				System.out.println("Nilaimu bagus sekali ");
			}else{
				System.out.println("Nilaimu bagus");
			}
		}else{
			if(nilai >= 30){
				System.out.println("Nilaimu kurang");
			}else{
				System.out.println("Nilaimu jelek");
			}

		}
	}
}