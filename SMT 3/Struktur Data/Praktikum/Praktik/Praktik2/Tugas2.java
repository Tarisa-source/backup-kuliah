import java.util.Scanner;
class formatBiodata{
	String nama;
	int noMhs;
	int UTS, UAS;
}
class Tugas2 {
	public static int n = 1, pilih;
	public static void inData(formatBiodata biodataMahasiswa[]){
	Scanner masuk = new Scanner(System.in);
		for(int i=0;i<n;i++){
			System.out.print("masukkan nama anda : ");
			biodataMahasiswa[i].nama = masuk.next();
			System.out.print("masukkan No.Mhs anda : ");
			biodataMahasiswa[i].noMhs = masuk.nextInt();
			System.out.print("masukkan Nilai UTS anda : ");
			biodataMahasiswa[i].UTS = masuk.nextInt();
			System.out.print("masukkan Nilai UAS anda : ");
			biodataMahasiswa[i].UAS = masuk.nextInt();
			System.out.println();
		}
	}
	public static void tampilData(formatBiodata biodataMahasiswa[]){
		for(int i=0; i<=n-1; i++){
			System.out.println("nama : " +biodataMahasiswa[i].nama + " ");
			System.out.println("Nim : " +biodataMahasiswa[i].noMhs + " ");
			System.out.println("Nilai UTS : " +biodataMahasiswa[i].UTS + " ");
			System.out.println("Nilai UAS : " +biodataMahasiswa[i].UAS + "\n");
		}
 	}
	public static void tambahData(formatBiodata biodataMahasiswa[]){
	formatBiodata biodataMahasiswaBaru = new formatBiodata();
	Scanner masukan = new Scanner(System.in);
	System.out.print(" ");
	System.out.print("masukkan nama anda : ");
	biodataMahasiswaBaru.nama=masukan.next();
	System.out.print("masukkan No.Mhs anda : ");
	biodataMahasiswaBaru.noMhs=masukan.nextInt();
	System.out.print("masukkan Nilai UTS anda : ");
	biodataMahasiswaBaru.UTS=masukan.nextInt();
	System.out.print("masukkan Nilai UAS anda : ");
	biodataMahasiswaBaru.UAS=masukan.nextInt();
	n++;
	System.out.println("");
 }
 public static void main(String[] args) {
 	int j = 0;
	Scanner in = new Scanner (System.in);
	formatBiodata biodataMahasiswa[]=new formatBiodata[n+1];
	for (int i = 0; i < (n+ 1); i++) {
		biodataMahasiswa[i] = new formatBiodata();
	}do{
		System.out.println();
	  	System.out.println("--------MENU PILIHAN------");
	  	System.out.println("1. Input\n2. view\n3. exit\n");
	  	System.out.print("pilih :");
	  	pilih = in.nextInt();
	  	System.out.println();
	  	if(pilih==1){
			System.out.print("Silahkan masukan banyaknya data : ");
		  	n=in.nextInt();
		  	inData(biodataMahasiswa);
  		}else if(pilih==2){
		 	System.out.println("----hasil------");
		 	tampilData(biodataMahasiswa);
		  	System.out.println("---------------");
		  	break;
  		}else if(pilih==3){
  			System.out.println("=====program selesai=======");
  		}else{
 			System.out.println("Tidak ada pilihan");
 		}
  	}while ( pilih != 3 );
  }
}