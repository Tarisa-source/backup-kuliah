public class Tugas_1{
	public static void main (String [] args){
		int a = 10;
		int i = 0, b=0;
		for(int x=1;x<=a;x++){
			i++;
			b+=x;
			System.out.print(x);
			if (i==2){
			    System.out.print(b);
				i=0;
			    b=0;
            }
		}
	}
}