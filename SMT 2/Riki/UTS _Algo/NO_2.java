import java.util.Scanner;
public class NO_2{
	public static void main (String []args){
		Scanner input = new Scanner (System.in);
		int nilai;
		System.out.print("Masukan nilai (0-100): ");
		nilai = input.nextInt();
		if(nilai>=70 && nilai<=100)
		{
			for(int i=1; i<=4;i++){
				System.out.println("Pintar..!!!");
			}
		}else
		{
			for(int i=1; i<=4;i++){
				System.out.println("Usaha lagi ya ...");
			}
		}
}}