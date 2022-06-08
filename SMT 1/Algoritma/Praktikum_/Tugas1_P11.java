import java.util.Scanner;
public class Tugas1_P11{
 	public static void main (String [] args){
		Scanner input = new Scanner(System.in);

		for(int baris=1; baris<=5; baris++){
			System.out.println("");
			for(int s=1; s<=baris; s++){
				System.out.print(s);
			}
		}
		for(int br=4; br>=1; br--){
			System.out.println("");
			for(int t=1; t<=br; t++){
				System.out.print(t);
			}
		}

		System.out.println();
	}
}