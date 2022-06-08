public class Latihan3 {
    // method rekursif
    public static int rekrusifMin(int[] arr, int n) {
        if (n != 0) {
            if (arr[n] <= rekrusifMin(arr, n - 1)) {
                return arr[n];
            } else {
                return rekrusifMin(arr, n - 1);
            }
        } else {
            return arr[0];
        }

    }
    public static void main(String[] args) {
        int array[] = { 55, 89, 45, 74, 34, 56, 78, 32, 34, 33, 92 };
        int n = 11;
        System.out.println("Nilai Paling Kecil = " + rekrusifMin(array, n - 1));
    }
}