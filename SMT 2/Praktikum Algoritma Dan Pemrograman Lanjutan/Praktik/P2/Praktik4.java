public class Praktik4{
	public static void main (String [] args){
		int x = 5;
		for(int i=1; i<=x ;i++){
			//System.out.println(i);
			for(int j = 4;j>=i;j--){
				System.out.print('Y');
			}
			for(int k =1; k<=i;k++){
				System.out.print("^");
			}
			for(int l = 1; l<=i-1;l++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}