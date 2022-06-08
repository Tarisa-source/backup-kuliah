public class Praktik1{
	public static int jumlah(int a ){ // disebut sebagai parameter formal
		return a;
	}
	public static void main (String [] args){
		System.out.println("Hasil pemanggilan method ");
		System.out.println(jumlah(5)); // disebut paramater aktual
	}
}