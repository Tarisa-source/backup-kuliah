public class Latihan2b {
    // method iterasi
    public static String stringReverse(String str) {
        char chr[] = str.toCharArray();
        String hasil = "";
        for (int i = chr.length - 1; i >= 0; i--) {
            hasil += chr[i];
        }
        return hasil;
    }

    public static void main(String[] args) {
        String str = "Semangatya";
        System.out.println("Setelah dibalik: " + stringReverse(str));

    }
}