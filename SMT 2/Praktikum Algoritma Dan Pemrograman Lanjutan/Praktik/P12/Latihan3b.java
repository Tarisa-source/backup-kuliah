public class Latihan3b {
    // method iterasi
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
        int array[] = { 55, 89, 45, 74, 34, 56, 78, 15, 34, 33, 92 };
        System.out.println("Nilai Paling Kecil = " + iterasiMin(array));
    }
}