public class Tes1 {
    //rekursif
    public static void printArray(int[] array, int n) {
        if(n != -1){
			printArray(array, n-1);
			System.out.print(array[n]+",");
		}
	}
    public static void main(String[] args) {
        int array[] = { 1,2,3,4,5,6,7,8,9,10};
        printArray(array, array.length - 1);
    }
}