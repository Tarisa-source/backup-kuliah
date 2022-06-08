import java.util.Scanner;
public class Tugas1{
	public static void main (String []args){
		Scanner masuk = new Scanner(System.in);
		String jenjang, matkul;
		int sks, total = 0 ;
		System.out.print("Masukan jenjang (D3/S1) : ");
		jenjang = masuk.next();
		if(jenjang.equalsIgnoreCase("D3")){
			System.out.println("Program D3 hanya bisa memasukan 3 matakuliah saja ");
			for(int i = 1;i<=3;i++){
				System.out.print("Masukan matakuliah : ");
				matkul = masuk.next();
				System.out.print("Masukan SKS : ");
				sks = masuk.nextInt();
				total = sks + total;
			}
			System.out.println("Total SKS : "+total);
		}else if(jenjang.equalsIgnoreCase("S1")){
			System.out.println("Program S1 hanya bisa memasukan 5 matakuliah saja ");
			for(int i = 1;i<=5;i++){
				System.out.print("Masukan matakuliah : ");
				matkul = masuk.next();
				System.out.print("Masukan SKS : ");
				sks = masuk.nextInt();
				total = sks + total;
			}
			System.out.println("Total SKS : "+total);
		}else{
			System.out.print("Salah memeasukan jenjang");
		}
	}
}