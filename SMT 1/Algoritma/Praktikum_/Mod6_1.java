class Mod6_1 {
	public static void main (String [] args){
		int bill ;
		bill = 100;
		switch (bill%2){
			case 0:
				System.out.println("Bilangan genap");
				break;
			case 1:
				System.out.println("Bilangan ganjil");
				break;
			//default:
				//System.out.println("Bilangan salah ");
		}
	}
}