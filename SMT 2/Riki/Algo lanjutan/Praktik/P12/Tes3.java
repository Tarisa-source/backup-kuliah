public class Tes3 {
    //rekursif
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
        int array[] = { 77, 88, 99, 11, 22, 33, 44, 55, 12, 45 };
        int n = 10;
        System.out.println("Nilai Paling Kecil = " + rekrusifMin(array, n - 1));
    }
}