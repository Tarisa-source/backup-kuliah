import java.util.Scanner;
class formatBiodata{ //bagian deklarasi struktur record ---------------------------------
	String nama;
	String alamat;
	int umur;
	char jekel;
	String hobi[] = new String[3];
	float ipk;
}class Praktik3{
	public static int N=1;
	//--------------------------------------------------
	//--- Fungsi untuk mengentri data ke dalam Larik ---
	//--------------------------------------------------
	public static void ngentriData(formatBiodata biodataMahasiswa[]){
	//bagian entri data ke dalam struktur larik ----------------
	Scanner masukan = new Scanner(System.in);
	int bacaTombol=0;
	for (int i=0; i<=N-1; i++){
		System.out.print("Silakan masukkan nama anda : ");
		biodataMahasiswa[i].nama = masukan.next();
		System.out.print("Silakan masukkan alamat anda : ");
		biodataMahasiswa[i].alamat = masukan.next();
		System.out.print("Silakan masukkan umur anda : ");
		biodataMahasiswa[i].umur = masukan.nextInt();
		System.out.print("Silakan masukkan Jenis Kelamin anda : ");
		try{
			bacaTombol = System.in.read();
		}catch(java.io.IOException e){

		}
		biodataMahasiswa[i].jekel = (char)bacaTombol;
		System.out.println("Silakan masukkan hobi (maks 3) : ");
		System.out.print("hobi ke-0 : ");
		biodataMahasiswa[i].hobi[0] = masukan.next();
		System.out.print("hobi ke-1 : ");
		biodataMahasiswa[i].hobi[1] = masukan.next();
		System.out.print("hobi ke-2 : ");
		biodataMahasiswa[i].hobi[2] = masukan.next();
		System.out.print("Silakan masukkan IPK anda : ");
		biodataMahasiswa[i].ipk = masukan.nextFloat();
		System.out.println("");
		}
	}

	//Fungsi Untuk Menambah Data

	public static void tambahDataDiDepan(formatBiodata biodataMahasiswa[]){
		//bagian membuat record sementara untuk menampung data baru-------------
		formatBiodata biodataMahasiswaBaru = new formatBiodata();
		//bagian entri data baru ke penyimpan sementara-----------------------
		Scanner masukan = new Scanner(System.in);
		int bacaTombol=0;
		System.out.print("Silakan masukkan nama anda : ");
		biodataMahasiswaBaru.nama = masukan.next();
		System.out.print("Silakan masukkan alamat anda : ");
		biodataMahasiswaBaru.alamat = masukan.next();
		System.out.print("Silakan masukkan umur anda : ");
		biodataMahasiswaBaru.umur = masukan.nextInt();
		System.out.print("Silakan masukkan Jenis Kelamin anda : ");
		try{ bacaTombol = System.in.read();

		}catch(java.io.IOException e){
		}
		biodataMahasiswaBaru.jekel = (char)bacaTombol;
		System.out.println("Silakan masukkan hobi (maks 3) : ");
		System.out.print("hobi ke-0 : ");
		biodataMahasiswaBaru.hobi[0] = masukan.next();
		System.out.print("hobi ke-1 : ");
		biodataMahasiswaBaru.hobi[1] = masukan.next();
		System.out.print("hobi ke-2 : ");
		biodataMahasiswaBaru.hobi[2] = masukan.next();
		System.out.print("Silakan masukkan IPK anda : ");
		biodataMahasiswaBaru.ipk = masukan.nextFloat();
		//bagian menggeser isi larik mulai dari Belakang s/d 0 selangkah ke bawah
		for (int i=N-1; i>= 0; i--){
			biodataMahasiswa[i+1] = biodataMahasiswa[i];
		}
		//bagian memindahkan data baru ke larik ke-0-----------------------
		biodataMahasiswa[0] = biodataMahasiswaBaru;
		//memperbaharui banyaknya data (N), banyaknya data bertambah satu------
		N++;
	}
	//------------------------------------------------------
	//--- Fungsi untuk Mengurutkan Data (Insertion) ---
	//------------------------------------------------------
	public static void mengurutkanDataInsertion(formatBiodata biodataMahasiswa[]){
		formatBiodata biodataSementara = new formatBiodata();
		//untuk menentukan awal dari data sisi kanan (sisi yg masih berantakan)
		int awal;
		//untuk mencari posisi yg tepat pada sisi kiri (sisi yg sudah berurutan)
		int cari;
		awal = 1;
		while (awal <=N-1){
			biodataSementara = biodataMahasiswa[awal];
			cari = awal-1;
			//cari akan bergerak dari kanan (awal-1) ke kiri
			while ( cari >= 0){
				//( biodataMahasiswa[cari].nama > biodataSementara.nama )
				if (biodataMahasiswa[cari].nama.compareTo(biodataSementara.nama)>0){
				biodataMahasiswa[cari+1] = biodataMahasiswa[cari];
				biodataMahasiswa[cari] = biodataSementara;
				cari--; //cari digeser kekiri 1 langkah
				}else{
					biodataMahasiswa[cari+1] = biodataSementara;
					// perintah ini untuk keluar dari loop while
					cari=-1;
				}
			}
		awal++;
		}
	}
	//--------------------------------------------------
	//--- Fungsi untuk menampilkan data ---
	//--------------------------------------------------
	public static void tampilkanData(formatBiodata biodataMahasiswa[]){
		//bagian menampilkan isi struktur Larik --------------------------
		System.out.println("---------------------------------------------");
		System.out.println("NAMA ALAMAT UMUR JEKEL HOBI1 HOBI2 HOBI3 IPK");
		System.out.println("---------------------------------------------");
		for (int i=0; i<=N-1; i++){
			System.out.print(i + ".");
			System.out.print (biodataMahasiswa[i].nama + " ");
			System.out.print (biodataMahasiswa[i].alamat + " ");
			System.out.print (biodataMahasiswa[i].umur + " ");
			System.out.print (biodataMahasiswa[i].jekel + " ");
			System.out.print (biodataMahasiswa[i].hobi[0] + " ");
			System.out.print (biodataMahasiswa[i].hobi[1] + " ");
			System.out.print (biodataMahasiswa[i].hobi[2] + " ");
			System.out.println(biodataMahasiswa[i].ipk);
		}
			System.out.println("---------------------------------------------");
	}
		//--- Program Utama ---
		public static void main(String[] args) { // bagian deklarasi record berbasis LARIK -----------------------
		        Scanner input = new Scanner(System.in);
		        System.out.print("Silahkan Masukan Banyaknya Data = ");
		        N = input.nextInt();
		        formatBiodata biodataMahasiswa[] = new formatBiodata[(N + 1)];
		        for (int i = 0; i < N; i++) {
		            biodataMahasiswa[i] = new formatBiodata();
		        }
		        ngentriData(biodataMahasiswa);
		        tampilkanData(biodataMahasiswa);
		        String jawab = "Y";
		        while (jawab.equals("Y")) {
					mengurutkanDataInsertion(biodataMahasiswa);
		            System.out.println("Data yang telah diurutkan menggunakan Insertion");
		            tampilkanData(biodataMahasiswa);
		            System.out.print("Apakah anda ingin menambahkan data lagi? (Y/N)");
		            jawab = input.next();
		            System.out.println(" ");
		            tampilkanData(biodataMahasiswa);
        }
	 }
}