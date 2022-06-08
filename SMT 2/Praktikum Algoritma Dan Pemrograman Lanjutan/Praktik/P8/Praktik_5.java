public class Praktik_5{
	public static int jumlah(){
			int a = 8, b=10;
			return (a+b);
	}
	public static void main(String[]args){
		Praktik_5 obyek = new Praktik_5();
		System.out.println("Hasil pemanggilan method jumlah");
		System.out.println(obyek.jumlah());
	}
}