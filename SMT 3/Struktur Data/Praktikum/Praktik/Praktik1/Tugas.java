import java.util.Scanner;
	public class Tugas{
		public static void main(String[] args){
			Scanner masukan = new Scanner(System.in);
			int mhs;
			System.out.print("Masukkan Jumlah Mahasiswa : ");
			mhs = masukan.nextInt();
			if(mhs >= 5){
				/*String nama, alamat;
				int umur, hobiku = 3;
				char jekel; //jenis kelamin
				float ipk;*/
				//String hobi[][];
				int bacaTombol=0;
				String nama[] = new String[mhs];
				String alamat[] = new String[mhs];
				int umur [] = new int[mhs];
				float ipk[] = new float [mhs];
				char jekel[] = new char[mhs];
				String hobi[][] = new String [mhs][3];
				System.out.println();
				for(int h=0;h<mhs;h++){
					System.out.println("Mahasiswa " + (h+1));
					System.out.print("Silakan masukkan nama anda : ");
					nama[h] = masukan.next();
					System.out.print("Silakan masukkan alamat anda : ");
					alamat[h] = masukan.next();
					System.out.print("Silakan masukkan umur anda : ");
					umur[h] = masukan.nextInt();
					System.out.print("Silakan masukkan Jenis Kelamin anda : "); // karena char jadi berupa huruf saja (P/L)
					try{
						bacaTombol = System.in.read();
					}catch(java.io.IOException e){

					}jekel[h] = (char)bacaTombol;
					for(int i=0;i<3;i++){
						System.out.print("Hobi " + (i+1) + " : ");
						hobi[h][i] = masukan.next();
					}
					System.out.print("Silakan masukkan IPK anda : ");
					ipk[h] = masukan.nextFloat();
				}

				System.out.println("---------------------------");
				System.out.println("Daftar Biodata Mahasiswa : ");
				System.out.println("---------------------------");
				System.out.println();
				System.out.println("\t\tNama\t\tAlamat\tJenis Kelamin\tHobi 1\tHobi 2\tHobi 3\tIPK");
				for(int j=0;j<mhs;j++){
					System.out.print("Mahasiswa " + (j+1));
					System.out.print("\t"+nama[j]);
					System.out.print("\t"+alamat[j]);
					System.out.print("\t"+jekel[j]);
					for(int k=0;k<3;k++){
						System.out.print("\t" + hobi[j][k]);
					}
					System.out.print("\t"+ipk[j]);
					System.out.println();
				}

			}else{
				System.out.println("Jumlah data mahasiswa yang dimasukan kurang");
			}
	}
}
