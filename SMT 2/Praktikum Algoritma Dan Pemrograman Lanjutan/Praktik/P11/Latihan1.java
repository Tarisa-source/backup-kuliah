public class Latihan1{
	public static int pangkat (int A, int B){
		if(B == 0){
			return 1;
		}else{
			return A * pangkat(A, B-1);
		}
	}

	public static void main (String [] args){
		System.out.println("Pangkat dari 5^4 = "+pangkat(5,4));
	}
}