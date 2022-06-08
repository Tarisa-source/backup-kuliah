public class Tugas_No1{
	public static int pangkat (int A, int B){
		int hasil = 1;
		for(int i=1; i<=B; i++){
			hasil *= A;
		}
		return hasil;
	}
	public static void main (String [] args){
		System.out.println("Pangkat dari 3^2 = "+pangkat(3,2));
	}
}