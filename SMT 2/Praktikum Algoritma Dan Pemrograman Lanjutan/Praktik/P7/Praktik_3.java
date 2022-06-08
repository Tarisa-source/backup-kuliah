public class Praktik_3{
	public static void main (String [] args){
		int i;
		for(i=1;i<=10;i++){
			if(i%2==0){
				System.out.println("Bilangan genap  : "+i);
			}else{
				if(i%3!=0)
					System.out.println("Bilangan ganjil : "+i);
			}
		}
	}
}