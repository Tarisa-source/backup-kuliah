import java.util.Scanner;
public class Tugas1{
	public static void main (String [] args){
		Scanner masuk = new Scanner (System.in);
		int pill, i, deret, hasil;
		int lama = 0;
		int baru = 1;
		System.out.println("Menu pilihan ");
		System.out.println("1. Fibonaci");
		System.out.println("2. Faktorial");
		System.out.print("Masukan pilihan anda : ");
		pill = masuk.nextInt();
		if(pill == 1 ){
			System.out.print("Masukan jumlah deret : ");
			deret = masuk.nextInt();
			System.out.print(1);
			for(i=0; i<=deret-2; i++){
				hasil = lama + baru;
				lama = baru;
				baru = hasil;
				System.out.print(hasil);

			}

		}else{
			if(pill==2){
				int faktor, z;
				//int awal=1, akhir=1;
				int total = 1;
				System.out.print("Masukan bilagan yang ingin difaktorkan : ");
				faktor = masuk.nextInt();
				for(z = faktor; z>=1; z--){
					total = total * z;

				}
				System.out.println(total);

			}else{
				System.out.print("Pilihan yang anda masukan salah. ");
			}
		}
	}
}