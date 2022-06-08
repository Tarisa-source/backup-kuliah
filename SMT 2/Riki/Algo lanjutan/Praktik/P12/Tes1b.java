public class Tes1b {
    //iterasi
    public static void printArray(int[] arr) {
        int n = 0;
        for (int i : arr) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        int array[] = { 1,2,3,4,5,6,7,8,9,10};
        printArray(array);

    }
}