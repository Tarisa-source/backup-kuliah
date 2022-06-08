public class Praktik2{
	public static void main (String [] args){
		String cats [][] = {
					{"Terry", "Brown"}, {"Tobby", "Gray"}, {"Fido", "Black"}
		};
		for(int i = 0; i<cats.length;i++){
			for(int j = 0; j<cats[i].length;j++){
				System.out.print(cats[i][j]);
				System.out.print("\t");
			}
			System.out.println(" ");
		}
	}
}