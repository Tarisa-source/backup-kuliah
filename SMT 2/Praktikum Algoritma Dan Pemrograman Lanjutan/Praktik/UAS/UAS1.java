import java.util.Scanner;
public class UAS1{
	public static void main (String [] args){
		int mhs, nila;
		Scanner masuk = new Scanner(System.in);
		System.out.print("Masukan jumlah mahasiswa : ");
		mhs = masuk.nextInt();
		String nama[] = new String[mhs];
		int nilai[] = new int [mhs];
		String grade[] = new String [mhs];
		for(int i=0;i<mhs;i++){
			System.out.println("Mahasiswa ke-"+(i+1));
			System.out.println("Masukan nama : ");
			nama[i] = masuk.next();
			System.out.println("Masukan nilai : ");
			nilai[i] = masuk.nextInt();
			if(nilai[i] >= 45  && nilai[i] <= 100){
				grade[i] = "Lulus";
			}else{
				grade[i] = "Tidak Lulus";
			}
		}
			System.out.println("    DAFTAR NILAI MAHASISWA");
			System.out.println("================================");
			System.out.println("No \t Nama \t Nilai \t Grade");
				for(int j=0; j<mhs;j++){
					System.out.print(j+1);
					System.out.print("\t"+nama[j]);
					System.out.print("\t"+nilai[j]);
					System.out.println("\t"+grade[j]);
				}
		}
}
