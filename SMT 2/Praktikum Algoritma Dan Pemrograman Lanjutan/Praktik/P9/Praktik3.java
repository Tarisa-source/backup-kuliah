public class Praktik3{
	String nim;
	String nama;
	String prodi;
	public void setMhs(String nim, String nama, String prodi){
		this.nim = nim;
		this.nama = nama;
		this.prodi = prodi;
	}
	public void tampil(){
		System.out.println("Judul buku : "+nim);
		System.out.println("Harga buku : "+nama);
		System.out.println("Jumlah buku : "+prodi);
	}
	public static void main (String [] args){
		Praktik3 mhs = new Praktik3 ();
		mhs.setMhs("145410012","Nisa","Informatika");
		mhs.tampil();
	}
}