public class Tes3b {
    //Iterasi
    public static int iterasiMin(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int array[] = { 77, 88, 99, 11, 22, 33, 44, 55, 12, 45 };
        System.out.println("Nilai minimum adalah " + iterasiMin(array));
    }
}