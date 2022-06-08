public class Praktik6{
	public static void main (String []args){
		int matrix[][] ={{12,23,32},{34,56,63},{78,89,97}};
		System.out.println("Matrik sebelum transpose");
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print(matrix[i][j] +" ");
			}
			System.out.println();
		}
		System.out.println("Matrik setelah transpose");
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print(matrix[j][i] +" ");
			}
			System.out.println();
		}
	}
}