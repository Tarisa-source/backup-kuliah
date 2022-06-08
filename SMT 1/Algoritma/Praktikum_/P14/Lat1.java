public class Lat1{
	public static void main (String [] args){
	int x,y,z;
	for(x=5; x>=1 ;x--){
		for(y=5;y>x;y--){
			System.out.print(" ");
		}
		for(z=1;z<(x*2);z++){
			System.out.print("*");
		}
		System.out.println();
	}
}
}