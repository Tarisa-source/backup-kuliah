public class Praktik9{
	public static void main (String [] args){
		int x = 5, i =1;
		do{
			for(int j = 4;j>=i;j--){
				System.out.print(' ');
			}
			for(int k =1; k<=i;k++){
				System.out.print("*");
			}
			for(int l = 1; l<=i-1;l++){
				System.out.print("*");
			}
			System.out.println();
			i++;
		}while(i<=x);
	}
}