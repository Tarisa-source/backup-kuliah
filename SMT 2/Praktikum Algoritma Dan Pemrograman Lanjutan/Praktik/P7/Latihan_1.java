public class Latihan_1{
	public static void main (String [] args){
		int i =1;
		while(i<=10){
			if(i%2==0){
				System.out.println("Bilangan genap  : "+i);
			}else{
				if(i%3!=0)
				System.out.println("Bilangan ganjil : "+i);
			}
			i++;
		}
	}
}