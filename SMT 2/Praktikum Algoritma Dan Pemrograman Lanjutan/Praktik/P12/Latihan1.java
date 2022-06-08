public class Latihan1 {
    // method rekursif
    public static void printArray(int[] arr, int n) {
        if(n != -1){
			printArray(arr, n-1);
			System.out.println(arr[n]);
		}
    }

    public static void main(String[] args) {
        int array[] = { 55, 89, 45, 74, 34, 56, 78, 32, 34, 33, 92 };
        printArray(array, array.length - 1);

    }
}