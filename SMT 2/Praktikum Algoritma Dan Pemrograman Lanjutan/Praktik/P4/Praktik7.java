import java.util.Scanner;
public class Praktik7{
	public static void main (String []args){
		int b=3;
		int d=3;
		int e,f, jumlah=0;
		int [][] hasil = new int[b][d];
		//matrik 3 baris 3 kolom
		System.out.println("Masukan nilai matrix 1 :");
		int [][] matrix1 = new int[b][d];
		for(int i=0;i<b;i++){
			for(int j=0;j<d;j++){
				matrix1[i][j] = input();
			}
		}
		System.out.println("Masukan nilai matrix 2 :");
		int [][] matrix2 = new int[b][d];
		for(int i=0;i<b;i++){
			for(int j=0;j<d;j++){
				matrix2[i][j] = input();
			}
		}
		System.out.println("Matrix  1 :");
		for(int i=0;i<b;i++){
			for(int j=0;j<d;j++){
				System.out.print(matrix1[i][j] +" ");
			}
			System.out.println();
		}

		System.out.println("Matrix  2 :");
		for(int i=0;i<b;i++){
			for(int j=0;j<d;j++){
				System.out.print(matrix2[i][j] +" ");
			}
			System.out.println();
		}
		//proses perkalian
		for(int i=0;i<b;i++){
			for(int j=0;j<d;j++){
				for(int k=0;k<b;k++){
					jumlah = jumlah + matrix1[i][k] * matrix2[k][j];
				}
			hasil[i][j] = jumlah;
			jumlah = 0;
			}
		}
		//hasil perkalian
		System.out.println("Hasil perkalian ke-2 matrix : ");
		for(int i=0;i<b;i++){
			for(int j=0;j<d;j++){
				System.out.print(hasil[i][j] + "\t");
			}
			System.out.println();
		}
	}
	static int input(){
		Scanner a=new Scanner(System.in);
		int b=a.nextInt();
	    return b;
  	}
}