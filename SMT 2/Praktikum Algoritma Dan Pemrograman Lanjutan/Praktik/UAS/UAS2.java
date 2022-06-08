import java.util.Scanner;
public class UAS2{
	public static void main (String [] args){
		Scanner masuk = new Scanner(System.in);
		int batas;
		//int a = 2;
		System.out.println("Menghitung bilangan prima.");
		System.out.println("Masukan batas bilangan prima : ");
		batas = masuk.nextInt();
		System.out.println("______________________________");
		for (int i=2; i<=batas; i++){
			int bil=0;
			for (int j=1;j<=i;j++){
				if (i%j==0){
					bil=bil+1;
				}
			}
		    if (bil==2){
				System.out.println(i);
			}
        }
	}
}