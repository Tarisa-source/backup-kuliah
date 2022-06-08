import java.util.*;
class formatBiodata
{	//bagian deklarasi struktur record ----------------------------------
	String	nama;
	String	alamat;
	int		umur;
	char 	jekel;
	String 	hobi[] = new String[3];
	float 	ipk;
}
class Tugas{
	public static int N=3;
	public static int lokasi = -1;
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
			try
			{	bacaTombol = System.in.read();
			}
			catch(java.io.IOException e){
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
			}}
			//------------------------------------------------------
			//--- Fungsi untuk Mencari Data Secara Linear Search ---
			//------------------------------------------------------
			public static void mencariDataLinear(formatBiodata biodataMahasiswa[]){
				String kataKunci;
				boolean statusKetemu = false;
				Scanner masukan= new Scanner(System.in);
				System.out.print("Masukkan Kata Kunci Pencarian : ");
				kataKunci = masukan.next(); for (int i=0; i<=N-1; i++){
					if (biodataMahasiswa[i].nama.equals(kataKunci)){
						statusKetemu=true;
						lokasi=i;
						break;
						}}
						if (statusKetemu==true){
							System.out.println("Data Yang Anda cari ketemu di larik ke - " +lokasi);
							} else {
								System.out.println("Maaf Data Yang Anda Cari Tidak Ditemukan...");
								}}
								//------------------------------------------------------
								//--- Fungsi untuk Menghapus data ditengah ---
								//------------------------------------------------------
								public static void hapusDataDiTengah(formatBiodata
								biodataMahasiswa[]){
									Scanner masukan = new Scanner(System.in);
									for (int i=lokasi; i<=N-1; i++){
										biodataMahasiswa[i] = biodataMahasiswa[i+1];
										}
										System.out.println("Proses menghapus data ke-" +lokasi + " selesai. ");
										N--;
										}
										//--------------------------------------------------
										//--- Fungsi untuk Menampilkan Data ---
										//--------------------------------------------------
										public static void tampilkanData(formatBiodata
										biodataMahasiswa[]){
											System.out.println("hasil eksekusi");
											System.out.println("--------------------------------------------------");
											System.out.println("NAMA\t\tALAMAT\t\tUMUR\tJEKEL\tHOBI[0]\tHOBI[1]\tHOBI[2]\tIPK");
											System.out.println("---------------------------------------------------");
											int nl, al;
											for (int i = 0; i <= (N - 1); i++){
												nl = biodataMahasiswa[i].nama.length();
												al = biodataMahasiswa[i].alamat.length();
												System.out.print(i + ". ");
												if (nl < 5){
													System.out.print(biodataMahasiswa[i].nama + "\t\t");
													} else {
														System.out.print(biodataMahasiswa[i].nama + "\t");
														}
														if (al < 8) {
															System.out.print(biodataMahasiswa[i].alamat + "\t\t");
															} else {
																System.out.print(biodataMahasiswa[i].alamat + "\t");
																}
																System.out.print(biodataMahasiswa[i].umur + "\t");
																System.out.print(biodataMahasiswa[i].jekel + "\t");
																System.out.print(biodataMahasiswa[i].hobi[0] + "\t");
																System.out.print(biodataMahasiswa[i].hobi[1] + "\t");
																System.out.print(biodataMahasiswa[i].hobi[2] + "\t");
																System.out.println(biodataMahasiswa[i].ipk); }
																System.out.println("--------------------------------------------- "); }
																//--------------------------------------------------
																//----------------- Program Utama ------------------
																//--------------------------------------------------
																public static void main(String[] args){
																	formatBiodata biodataMahasiswa[] = new
																	formatBiodata[5];
																	for (int i=0; i<5; i++){
																		biodataMahasiswa[i] = new formatBiodata();
																		}
																		ngentriData(biodataMahasiswa);
																		tampilkanData(biodataMahasiswa);
																		mencariDataLinear(biodataMahasiswa);
																		hapusDataDiTengah(biodataMahasiswa);
																		tampilkanData(biodataMahasiswa);
																		}}