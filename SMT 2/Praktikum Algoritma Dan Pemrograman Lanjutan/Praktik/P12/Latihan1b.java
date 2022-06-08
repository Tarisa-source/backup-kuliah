public class Latihan1b {
    // method iterasi
    public static void printArray(int[] arr) {
        int n = 0;
        System.out.println("Isi dari Array adalah seperti berikut: ");
        for (int i : arr) {
            System.out.println("Index ke " + (n++) + " = " + i);
        }
    }

    public static void main(String[] args) {
        int array[] = { 55, 89, 45, 74, 34, 56, 78, 32, 34, 33, 92 };
        printArray(array);

    }
}