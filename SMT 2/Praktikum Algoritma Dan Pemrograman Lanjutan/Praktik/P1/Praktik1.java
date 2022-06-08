import java.util.Scanner;
public class Praktik1{
	public static void main (String [] args){
		Scanner in = new Scanner(System.in);
		int nilai;
		System.out.print("Masukan angka dari bulat dari (0-100) : ");
		nilai = in.nextInt();
		if (nilai>=80){
			System.out.println("Nilaimu bagus sekali ");
		}else if(nilai >=60 ){
			System.out.println("Nilaimu bagus ");
		}else{
			System.out.println("Nilaimu kurang");
		}
	}
}