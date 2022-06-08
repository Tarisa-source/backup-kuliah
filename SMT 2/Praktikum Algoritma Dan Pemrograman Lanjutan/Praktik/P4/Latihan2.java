import java.util.Scanner;
public class Latihan2{
	public static void main (String [] args){
		Scanner input = new Scanner(System.in);
		int mhs,jml, banyakTes = 3, nilai[][], ntt[], ntr[];
		float rata[], jumlah[], rtt, rtr;
		System.out.print("Masukkan Jumlah Mahasiswa : ");
		mhs = input.nextInt();
		nilai = new int[mhs][banyakTes];
		jumlah = new float[mhs];
		rata = new float[mhs];
		ntt = new int[banyakTes];
		ntr = new int[banyakTes];
		String nama[] = new String[mhs];
		int nim [] = new int[mhs];
		System.out.println();
		for(int h=0;h<mhs;h++){
			System.out.println("Mahasiswa " + (h+1));
			System.out.print("Masukan NIM : ");
			nim[h] = input.nextInt();
			System.out.print("Masukan Nama : ");
			nama[h] = input.next();
			for(int i=0;i<banyakTes;i++){
				System.out.print("Nilai Tes " + (i+1) + " : ");
				nilai[h][i] = input.nextInt();
				jumlah[h] = jumlah[h] + nilai[h][i];
			}
			rata[h] = jumlah[h]/banyakTes;
			System.out.println();
		}
		for(int i=0;i<banyakTes;i++){
			ntt[i] = nilai[0][i];
			ntr[i] = nilai[0][i];
		}
		rtt = rata[0];
		rtr = rata[0];
		for(int i=0;i<banyakTes;i++){
			for(int j=0;j<mhs;j++){
				if(ntt[i] < nilai[j][i]){
					ntt[i] = nilai[j][i];
				}
				if(ntr[i] > nilai[j][i]){
					ntr[i] = nilai[j][i];
				}
			}
		}
		for(int i=0;i<mhs;i++){
			if(rtt < rata[i]){
				rtt = rata[i];
			}
			if(rtr > rata[i]){
				rtr = rata[i];
			}
		}
		System.out.println("---------------------------");
		System.out.println("Daftar Nilai Mahasiswa : ");
		System.out.println("---------------------------");
		System.out.println();
		System.out.println("\t\tNIM\t\tNama\tTest 1\tTest 2\tTest 3\tRata-rata");
		for(int j=0;j<mhs;j++){
			System.out.print("Mahasiswa " + (j+1));
			System.out.print("\t"+nim[j]);
			System.out.print("\t"+nama[j]);
			for(int k=0;k<banyakTes;k++){
				System.out.print("\t" + nilai[j][k]);
			}
			System.out.print("\t" + rata[j]);
			System.out.println();
		}
		System.out.println();
		System.out.print("Nilai Tertinggi\t");
		for(int j=0;j<banyakTes;j++){
			System.out.print(ntt[j] + "\t");
		}
		System.out.print(rtt);
		System.out.println();
		System.out.print("Nilai Teredah\t");
		for(int j=0;j<banyakTes;j++){
			System.out.print(ntr[j] + "\t");
		}
		System.out.print(rtr);
		System.out.println();
	}
}