public class Tes2b {
    //Iterasi
    public static String stringReverse(String kata) {
        char chr[] = kata.toCharArray();
        String hasil = "";
        for (int i = chr.length - 1; i >= 0; i--) {
            hasil += chr[i];
        }
        return hasil;
    }
    public static void main(String[] args) {
        String kata = "Lakesubun";
        System.out.println("Setelah dibalik: " + stringReverse(kata));

    }
}