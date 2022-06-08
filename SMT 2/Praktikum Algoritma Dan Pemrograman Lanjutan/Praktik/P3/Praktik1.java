public class Praktik1{
	public static void main (String [] args){
		//array 1 dimensi
		String[] nama = new String [5];
		nama[0] = "Jono";
		nama[1] = "Joni";
		nama[2] = "Jini";
		nama[3] = "Juni";
		nama[4] = "Jeni";

		//menampilkan array menggunkan for
		for (int i=0; i<nama.length; i++){
			System.out.println(nama[i]);
		}
	}
}