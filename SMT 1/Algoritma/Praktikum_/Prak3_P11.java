import java.util.Scanner;
public class Prak3_P11{
 	public static void main (String [] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Masukan jumlah baris : ");
		int j_baris = input.nextInt();//Menentukan jumlah baris
		for(int baris = 1; baris<=j_baris; baris++){
			for(int s = 1; s<=baris; s++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
