import java.util.*;
class formatBiodata
{	// bagian deklarasi struktur record ----------------------------------
    String	nama;
    String	alamat;
    int		umur;
    char	jekel;
    String	hobi[] = new String[3];
    float	ipk;
}

class Latihan1 {
    public static int N = 0;
    // --------------------------------------------------
    // --- Fungsi untuk mengentri data ke dalam Larik ---
    // --------------------------------------------------
    public static void ngentriData(formatBiodata biodataMahasiswa[]) {
        Scanner masukan = new Scanner(System.in);
        int bacaTombol = 0;
        for (int i = 0; i <= N - 1; i++) {
            System.out.print("Silakan masukkan nama anda : ");
            biodataMahasiswa[i].nama = masukan.next();
            System.out.print("Silakan masukkan alamat anda : ");
            biodataMahasiswa[i].alamat = masukan.next();
            System.out.print("Silakan masukkan umur anda : ");
            biodataMahasiswa[i].umur = masukan.nextInt();
            System.out.print("Silakan masukkan Jenis Kelamin anda : ");
            try {
                bacaTombol = System.in.read();
            } catch (java.io.IOException e) {
            }
            biodataMahasiswa[i].jekel = (char) bacaTombol;
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
    // --------------------------------------------------
    // --- Fungsi untuk Menambah Data Di Depan ---
    // --------------------------------------------------
    public static void tambahDataDiDepan(formatBiodata biodataMahasiswa[]) {
        // bagian membuat record sementara untuk menampung data baru-------------
        formatBiodata biodataMahasiswaBaru = new formatBiodata();
        // bagian entri data baru ke penyimpan sementara-----------------------
        Scanner masukan = new Scanner(System.in);
        int bacaTombol = 0;
        System.out.print("Silakan masukkan nama anda : ");
        biodataMahasiswaBaru.nama = masukan.next();
        System.out.print("Silakan masukkan alamat anda : ");
        biodataMahasiswaBaru.alamat = masukan.next();
        System.out.print("Silakan masukkan umur anda : ");
        biodataMahasiswaBaru.umur = masukan.nextInt();
        System.out.print("Silakan masukkan Jenis Kelamin anda : ");
        try {
            bacaTombol = System.in.read();
        } catch (java.io.IOException e) {
        }
        biodataMahasiswaBaru.jekel = (char) bacaTombol;
        System.out.println("Silakan masukkan hobi (maks 3) : ");
        System.out.print("hobi ke-0 : ");
        biodataMahasiswaBaru.hobi[0] = masukan.next();
        System.out.print("hobi ke-1 : ");
        biodataMahasiswaBaru.hobi[1] = masukan.next();
        System.out.print("hobi ke-2 : ");
        biodataMahasiswaBaru.hobi[2] = masukan.next();
        System.out.print("Silakan masukkan IPK anda : ");
        biodataMahasiswaBaru.ipk = masukan.nextFloat();
        // bagian menggeser isi larik mulai dari Belakang s/d 0 selangkah ke bawah
        for (int i = N - 1; i >= 0; i--) {
            biodataMahasiswa[i + 1] = biodataMahasiswa[i];
        }
        // bagian memindahkan data baru ke larik ke-0-----------------------
        biodataMahasiswa[0] = biodataMahasiswaBaru;
        // memperbaharui banyaknya data (N), banyaknya data bertambah satu------
        N++;
    }
    // --------------------------------------------------
    // --- Fungsi untuk Menambah Data Di Tengah ---
    // --------------------------------------------------
    public static void tambahDataDiTengah(formatBiodata biodataMahasiswa[]) {
        // bagian membuat record sementara untuk menampung data baru-----------
        formatBiodata biodataMahasiswaBaru = new formatBiodata();
        // bagian entri data baru ke penyimpan sementara-----------------------
        Scanner masukan = new Scanner(System.in);
        int bacaTombol = 0;
        System.out.print("Silakan masukkan nama anda : ");
        biodataMahasiswaBaru.nama = masukan.next();
        System.out.print("Silakan masukkan alamat anda : ");
        biodataMahasiswaBaru.alamat = masukan.next();
        System.out.print("Silakan masukkan umur anda : ");
        biodataMahasiswaBaru.umur = masukan.nextInt();
        System.out.print("Silakan masukkan Jenis Kelamin anda : ");
        try {
            bacaTombol = System.in.read();
        } catch (java.io.IOException e) {
        }
        biodataMahasiswaBaru.jekel = (char) bacaTombol;
        System.out.println("Silakan masukkan hobi (maks 3) : ");
        System.out.print("hobi ke-0 : ");
        biodataMahasiswaBaru.hobi[0] = masukan.next();
        System.out.print("hobi ke-1 : ");
        biodataMahasiswaBaru.hobi[1] = masukan.next();
        System.out.print("hobi ke-2 : ");
        biodataMahasiswaBaru.hobi[2] = masukan.next();
        System.out.print("Silakan masukkan IPK anda : ");
        biodataMahasiswaBaru.ipk = masukan.nextFloat();
        // bagian menentukan posisi target T ----------------------------------
        int T;
        System.out.print("Pada posisi ke berapa data akan dimasukkan ? : ");
        T = masukan.nextInt();
        // bagian menggeser isi larik mulai dari Belakang s/d T selangkah ke belakang
        for (int i = N - 1; i >= T; i--) {
            biodataMahasiswa[i + 1] = biodataMahasiswa[i];
        }
        // bagian memindahkan data baru ke larik ke-T----------------------
        biodataMahasiswa[T] = biodataMahasiswaBaru;
        // memperbaharui banyaknya data (N), banyaknya data bertambah satu-------
        N++;
    }
    // --------------------------------------------------
    // --- Fungsi untuk Menambah Data Di Belakang ---
    // --------------------------------------------------
    public static void tambahDataDiBelakang(formatBiodata biodataMahasiswa[]) {
        // bagian membuat record sementara untuk menampung data baru-------------
        formatBiodata biodataMahasiswaBaru = new formatBiodata();
        // bagian entri data baru ke penyimpan sementara-----------------------
        Scanner masukan = new Scanner(System.in);
        int bacaTombol = 0;
        System.out.print("Silakan masukkan nama anda : ");
        biodataMahasiswaBaru.nama = masukan.next();
        System.out.print("Silakan masukkan alamat anda : ");
        biodataMahasiswaBaru.alamat = masukan.next();
        System.out.print("Silakan masukkan umur anda : ");
        biodataMahasiswaBaru.umur = masukan.nextInt();
        System.out.print("Silakan masukkan Jenis Kelamin anda : ");
        try {
            bacaTombol = System.in.read();
        } catch (java.io.IOException e) {
        }
        biodataMahasiswaBaru.jekel = (char) bacaTombol;
        System.out.println("Silakan masukkan hobi (maks 3) : ");
        System.out.print("hobi ke-0 : ");
        biodataMahasiswaBaru.hobi[0] = masukan.next();
        System.out.print("hobi ke-1 : ");
        biodataMahasiswaBaru.hobi[1] = masukan.next();
        System.out.print("hobi ke-2 : ");
        biodataMahasiswaBaru.hobi[2] = masukan.next();
        System.out.print("Silakan masukkan IPK anda : ");
        biodataMahasiswaBaru.ipk = masukan.nextFloat();
        // bagian memindahkan data baru ke larik ke-N-----------------------
        biodataMahasiswa[N] = biodataMahasiswaBaru;
        // memperbaharui banyaknya data (N), banyaknya data bertambah satu----
        N++;
    }
    // --------------------------------------------------
    // --- Fungsi untuk Menghapus Data Di Depan ---
    // --------------------------------------------------
    public static void hapusDataDiDepan(formatBiodata biodataMahasiswa[]) {
        // bagian menggeser isi larik mulai dari 0 - Belakang selangkah ke depan
        for (int i = 0; i <= N - 2; i++) {
            biodataMahasiswa[i] = biodataMahasiswa[i + 1];
        }
        System.out.println("Proses menghapus data ke-0 selesai.");
        // memperbaharui banyaknya data (N), banyaknya data berkurang satu-------
        N--;
    }
    // --------------------------------------------------
    // --- Fungsi untuk Menghapus Data Di Tengah ---
    // --------------------------------------------------
    public static void hapusDataDiTengah(formatBiodata biodataMahasiswa[]) {
        // bagian menentukan posisi target T --------------------------------------
        Scanner masukan = new Scanner(System.in);
        int T;
        System.out.print("Tuliskan posisi data yang akan dihapus : ");
        T = masukan.nextInt();
        // bagian menggeser isi larik mulai dari T - Belakang selangkah ke depan
        for (int i = T; i <= N - 2; i++) {
            biodataMahasiswa[i] = biodataMahasiswa[i + 1];
        }
        System.out.println("Proses menghapus data ke-" + T + " selesai.");
        // memperbaharui banyaknya data (N), banyaknya data berkurang satu-------
        N--;
    }
    // --------------------------------------------------
    // --- Fungsi untuk Menghapus Data Di Belakang ---
    // --------------------------------------------------
    public static void hapusDataDiBelakang(formatBiodata biodataMahasiswa[]) {
        System.out.println("Proses menghapus data paling akhir selesai.");
        // memperbaharui banyaknya data (N), banyaknya data berkurang satu-------
        N--;
    }
    // --------------------------------------------------
    // --- Fungsi untuk Menampilkan Data ---
    // --------------------------------------------------
    public static void tampilkanData(formatBiodata biodataMahasiswa[]) {
        // bagian menampilkan isi struktur Larik -------
        System.out.println("-------------------------------------------------------");
        System.out.println("NAMA\tALAMAT\tUMUR\tJEKEL\tHOBI1\tHOBI2\tHOBI3\tIPK");
        System.out.println("-------------------------------------------------------");
        for (int i = 0; i <= N - 1; i++) {
            System.out.print(i + ".");
            System.out.print(biodataMahasiswa[i].nama + "\t");
            System.out.print(biodataMahasiswa[i].alamat + "\t");
            System.out.print(biodataMahasiswa[i].umur + "\t");
            System.out.print(biodataMahasiswa[i].jekel + "\t");
            System.out.print(biodataMahasiswa[i].hobi[0] + "\t");
            System.out.print(biodataMahasiswa[i].hobi[1] + "\t");
            System.out.print(biodataMahasiswa[i].hobi[2] + "\t");
            System.out.println(biodataMahasiswa[i].ipk);
        }
        System.out.println("-------------------------------------------------------");
    }
    // --------------------------------------------------
    // --- Fungsi untuk Menukar Data ---
    // --------------------------------------------------
    public static void tukarData(formatBiodata biodataMahasiswa[]) {
        formatBiodata mhsBaru = new formatBiodata();
        Scanner input = new Scanner (System.in);
        int x,y;
        System.out.println("Masukan data");
        System.out.print("Data yang ingin ditukar : ");
        x = input.nextInt();
        System.out.print("Ditukar dengan Data : ");
        y = input.nextInt();
        mhsBaru = biodataMahasiswa[x];
        biodataMahasiswa[x] = biodataMahasiswa[y];
        biodataMahasiswa[y] = mhsBaru;
        System.out.println("Proses penukaran data ke- "+ x + " dan "+ y +" selesai.");
    }
	//--------------------------------------------------------------------------------------------------------
	//------------------------------------------ Program Utama -----------------------------------------------
	//--------------------------------------------------------------------------------------------------------
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
            System.out.println("--Pilihan untuk menambahkan data--");
            System.out.println("1. Menambahkan data di depan");
            System.out.println("2. Menambahkan data di tengah");
            System.out.println("3. Menambahkan data di belakang");
            System.out.println("--Pilihan untuk menghapus data--");
            System.out.println("4. Menghapus data di depan");
            System.out.println("5. Menghapus data di tengah");
            System.out.println("6. Menghapus data di belakang");
            System.out.println("--Pilihan untuk menukar data--");
            System.out.println("7. Menukarkan data");
            System.out.println("8. Keluar");
            System.out.print("Masukkan Pilihan : ");
            int tambah = input.nextInt();
            if (tambah == 1) {
                tambahDataDiDepan(biodataMahasiswa);
                System.out.println("Data baru yang telah di tambahkan");
                tampilkanData(biodataMahasiswa);
            } else if (tambah == 2) {
                tambahDataDiTengah(biodataMahasiswa);
                System.out.println("Data baru yang telah di tambahkan");
                tampilkanData(biodataMahasiswa);
            } else if (tambah == 3) {
                tambahDataDiBelakang(biodataMahasiswa);
                System.out.println("Data baru yang telah di tambahkan");
                tampilkanData(biodataMahasiswa);
            } else if (tambah == 4) {
                hapusDataDiDepan(biodataMahasiswa);
                System.out.println("Data baru");
                tampilkanData(biodataMahasiswa);
            } else if (tambah == 5) {
                hapusDataDiTengah(biodataMahasiswa);
                System.out.println("Data baru");
                tampilkanData(biodataMahasiswa);
            } else if (tambah == 6) {
                hapusDataDiBelakang(biodataMahasiswa);
                System.out.println("Data baru");
                tampilkanData(biodataMahasiswa);
            }else if (tambah == 7) {
                tukarData(biodataMahasiswa);
                System.out.println("Data baru");
                tampilkanData(biodataMahasiswa);
            }else if (tambah == 8 ){
				tampilkanData(biodataMahasiswa);
            }else {
                System.out.println("Salah masukan pilihan");
                System.out.println("Program selesai");
            }
            System.out.print("Apakah anda ingin menambahkan data lagi? (Y/N)");
            jawab = input.next();
            System.out.println(" ");
            tampilkanData(biodataMahasiswa);
        }
    }
}