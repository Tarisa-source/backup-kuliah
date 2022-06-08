import java.util.Scanner;
public class Praktik4{
	public static void main (String [] args){
		int bilangan [] = new int [4];
		Scanner input = new Scanner(System.in);
		int j, i;
		for(i = 0; i<=3 ;i++){
			System.out.print("Silahkan masukan bilangan : ");
			bilangan[i] = input.nextInt();
		}
		// untuk menampilkan array
		for(j=0;j<=3;j++){
			System.out.println("Bilangan yang anda masukan" + " " + bilangan[j]);
		}
	}
}