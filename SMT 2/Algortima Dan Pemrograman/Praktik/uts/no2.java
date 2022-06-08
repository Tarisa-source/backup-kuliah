import java.util.Scanner;
public class no2{
	public static void main (String []args){
		Scanner masuk = new Scanner (System.in);
		int nilai;
		System.out.print("Masukan nilai (0-100): ");
		nilai = masuk.nextInt();
		if(nilai>=70 && nilai<=100){
			for(int i=1; i<=4;i++){
				System.out.println("Pintar....!!");
			}
		}else{
			for(int i=1; i<=4;i++){
				System.out.println("Usaha lagi ya ...");
			}
		}
	}
}