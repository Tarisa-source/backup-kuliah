public class Praktik7{
	public static void main (String [] args){
		int x = 5;
		int i =1;
		while(i<=x){
			for(int j = 4;j>=i;j--){
				System.out.print(' ');
			}
			for(int k =1; k<=i;k++){
				System.out.print(k);
			}
			for(int l = 1; l<=i-1;l++){
				System.out.print(i);
			}
			System.out.println();
			i++;
		}
	}
}