import java.util.*;
class formatbiodata
{	//bagian deklarasi struktur record ----------------------------------
	String	nama;
	String	alamat;
	int		umur;
	char	jekel;
	String	hobi[] = new String [3];
	float	ipk;

}
class Latihan{
	public static int N=3;
	//--------------------------------------------------
	//--- Fungsi untuk mengentri data ke dalam Larik ---
	//--------------------------------------------------
	public static void ngentriData(formatbiodata biodataMahasiswa[]){
		//bagian entri data ke dalam struktur larik ----------------
		Scanner masuk = new Scanner(System.in);
		int bacaTombol=0;
		for(int i=0; i<=N-1; i++){
			System.out.print("Silahkan masukan nama anda : ");
			biodataMahasiswa[i].nama = masuk.next();
			System.out.print("Silahkan masukan alamat anda : ");
			biodataMahasiswa[i].alamat = masuk.next();
			System.out.print("Silahkan masukan umur anda : ");
			biodataMahasiswa[i].umur = masuk.nextInt();
			System.out.print("Silahkan masukan jenis kelamin anda : ");
			try
			{	bacaTombol = System.in.read();
			}
			catch(java.io.IOException e){
			}
			biodataMahasiswa[i].jekel =
			(char)bacaTombol;
			System.out.println("Silahkan masukan hobi (maks 3) anda :");
			System.out.print("hobi ke-0 :");biodataMahasiswa[i].hobi[0] = masuk.next();
			System.out.print("hobi ke-1 :");biodataMahasiswa[i].hobi[1] = masuk.next();
			System.out.print("hobi ke-2 :");biodataMahasiswa[i].hobi[2] = masuk.next();
			System.out.print("Silahkan masukan IPK anda : ");
			biodataMahasiswa[i].ipk = masuk.nextFloat();
			System.out.println("");
			}}
			//--------------------------------------------------------------------
			//--- Fungsi untuk Mencari Data Secara Linear Search (Loop:For)---
			//--------------------------------------------------------------------
			public static void mencariDataLinear(formatbiodata
			biodataMahasiswa[]){
				char katakunci;
				int lokasi = -1;
				boolean statusketemu = false;
				//masukan kata kunci
				Scanner masuk = new Scanner(System.in);
				System.out.println("MENCARI DATA");
				System.out.println("-------------------------------------------");
				System.out.print("Masukan kata kunci berupaJenisKelamin L/P : ");
				katakunci = masuk.next().charAt(0);
				System.out.println("-------------------------------------------");
				//bagian mencari data satu persatu urut larik terdepan
				for(int i=0; i<=N-1; i++){
					//mencocokan biodataMahasiswa[i].jekel ==katakunci
					if(biodataMahasiswa[i].jekel==katakunci){
						System.out.print(i+" ");
						System.out.print(biodataMahasiswa[i].nama+" ");
						System.out.print(biodataMahasiswa[i].alamat+" ");
						System.out.print(biodataMahasiswa[i].umur+" ");
						System.out.print(biodataMahasiswa[i].jekel+" ");
						System.out.print(biodataMahasiswa[i].hobi[0]+" ");
						System.out.print(biodataMahasiswa[i].hobi[1]+" ");
						System.out.print(biodataMahasiswa[i].hobi[2]+" ");
						System.out.println(biodataMahasiswa[i].ipk+" ");
						statusketemu = true;
						lokasi = i;
						}}
						if(statusketemu == true){
							System.out.println("Jumlah data ditemukan : "+lokasi);
							}else{
								System.out.println("Data tidak ditemukan ");
								}
								System.out.println("-------------------------------------------");
								}
								//--------------------------------------------------
								//--- Fungsi untuk Menampilkan Data ---
								//--------------------------------------------------
								public static void tampilkanData(formatbiodata biodataMahasiswa[]){
									System.out.println("-------------------------------------------");
									System.out.println("NO NAMA ALAMAT UMUR JEKEL HOBI1 HOBI2 HOBI3 IPK");
									System.out.println("-------------------------------------------");
									for(int i=0; i<=N-1; i++){
										System.out.print(i+" ");
										System.out.print(biodataMahasiswa[i].nama+" ");
										System.out.print(biodataMahasiswa[i].alamat+" ");
										System.out.print(biodataMahasiswa[i].umur+" ");
										System.out.print(biodataMahasiswa[i].jekel+" ");
										System.out.print(biodataMahasiswa[i].hobi[0]+" ");
										System.out.print(biodataMahasiswa[i].hobi[1]+" ");
										System.out.print(biodataMahasiswa[i].hobi[2]+" ");
										System.out.println(biodataMahasiswa[i].ipk+" ");
										}
										System.out.println("-------------------------------------------");
										}
										//--------------------------------------------------
										//------ Fungsi untuk Menampilkan Data -------------
										//--------------------------------------------------
										public static void main(String args[]){
											//deklarsi record berbasis larik
											formatbiodata biodataMahasiswa [] = new
											formatbiodata[10];
											biodataMahasiswa[0] = new formatbiodata();
											biodataMahasiswa[1] = new formatbiodata();
											biodataMahasiswa[2] = new formatbiodata();
											biodataMahasiswa[3] = new formatbiodata();
											biodataMahasiswa[4] = new formatbiodata();
											ngentriData(biodataMahasiswa);
											tampilkanData(biodataMahasiswa);
											mencariDataLinear(biodataMahasiswa);
											}}