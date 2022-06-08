public class Praktik3{
	public static void main (String [] args){
		// array 1 dimensi
		String[] nama = {"Jono", "Joni", "Jini", "Jeni", "Juni"};
		int [] umur = {25, 30, 55, 35, 40};
		System.out.println("Nama\tUmur");

		//menampilkan dengan foreach
		for (int i=0; i<nama.length; i++){
			System.out.println(nama[i]+"\t " +umur[i]);
		}
	}
}