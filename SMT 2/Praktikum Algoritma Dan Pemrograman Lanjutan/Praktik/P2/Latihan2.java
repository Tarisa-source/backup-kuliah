public class Latihan2{
	public static void main (String [] args){
		int j,i;
		System.out.println("Perulangan bersarang membentuk pola");
		for(i=1; i<=5;i++){
			for(j=1;j<=5;j++){
				if(i>=j){
					System.out.print(" ");
				}
			}
			for(j=5;j>=1;j--){
				if(i<=j){
					System.out.print("*");
				}
			}
			System.out.println("Akakom");
		}
	}
}