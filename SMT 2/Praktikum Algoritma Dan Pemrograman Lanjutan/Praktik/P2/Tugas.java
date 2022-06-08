public class Tugas{
	public static void main (String [] args){
		int j,i=1,h=4,l;
		System.out.println("Perulangan bersarang membentuk pola");
		while(i<=5){
			for(j=1;j<=5;j++){
				if(i>=j){
					System.out.print(j);
				}
			}
			System.out.println(" ");
			i++;
		}
		while(h>=1){
			for(l=1;l<=4;l++){
				if(h>=l){
					System.out.print(l);
				}
			}
			System.out.println(" ");
			h--;
		}
	}
}