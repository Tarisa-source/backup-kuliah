public class No1{
	public static void main (String [] args){
		int i,j, k;
		for(i=1;i<=3;i++){
			for(j=1;j<=4;j++){
				for(k=1;k<=j;k++){
					int c = i+j+2;
					System.out.print(c+"");
				}
				System.out.println("");
			}
			System.out.println("");
		}
	}
}