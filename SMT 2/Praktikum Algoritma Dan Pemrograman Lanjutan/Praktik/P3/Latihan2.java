import java.util.Scanner;
public class Latihan2{
	public static void main (String [] args){
		Scanner masuk = new Scanner(System.in);
		String nama, jurusan, nama_matkul, def="Masukan ", grade;
		int  jml_matkul, nim;
		float uts, uas, rata;
		System.out.println("================================");
		System.out.println("  Menghitung Nilai Mahasiswa ");
		System.out.println("================================");
		System.out.print("Masukan Jumlah Mata Kuliah : ");
		jml_matkul = masuk.nextInt();
		System.out.println("================================");
		System.out.println(" ");
		//input
		System.out.print(def + "Nama \t\t: " );
		nama = masuk.next();
		System.out.print(def + "NIM \t\t: " );
		nim  = masuk.nextInt();
		System.out.print(def +"Jurusan \t: ");
		jurusan = masuk.next();
		System.out.println("================================");

		//for
		for(int i = 0; i < jml_matkul; i++){
			System.out.print("Mata kuliah ke-"+(i+1)+" = ");
			nama_matkul = masuk.next();
			System.out.print("UTS \t\t : ");
			uts = masuk.nextFloat();
			System.out.print("UAS \t\t : ");
			uas = masuk.nextFloat();

			//rata rata
			rata = (uts + uas) / 2;
			if(rata==90 || rata <=100){
				grade = "A";
			}else if(rata>= 75 || rata<=89){
				grade = "B";
			}else{
				if(rata >= 60 || rata<=74){
					grade = "C";
				}else{
					grade = "D";
				}
			}
			System.out.println("================================");
			System.out.println("Nama : "+nama+ " NIM : " +nim);
			System.out.println("================================");
			System.out.println("Mata Kuliah \t Nilai \t Grade ");
			System.out.println(nama_matkul+"\t\t"+rata+"\t\t"+grade);
		}

		// Data outpu



	}
}