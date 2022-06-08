import java.util.Scanner;
public class Latihan2{
	public static int FBB (int X, int Y){
		if(Y == 0){
			return X;
		}else{
			return FBB (Y, X % Y);
		}
	}

	public static void main (String [] args){
		Scanner masuk = new Scanner(System.in);
		System.out.println("Masukan bilangan pertama : ");
		int X = masuk.nextInt();
		System.out.println("Masukan bilangan kedua : ");
		int Y = masuk.nextInt();
		int hasil = FBB(X,Y);
		System.out.println("Hasil dari FBB "+X+" dan "+Y+" adalah "+hasil);
	}
}