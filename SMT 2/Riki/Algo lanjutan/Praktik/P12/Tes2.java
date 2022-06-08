public class Tes2 {
    //rekursif
    public static String stringReverse(String kata) {
        if (kata.isEmpty()) {
            return kata;
        }
        return stringReverse(kata.substring(1)) + kata.charAt(0);
    }
    public static void main(String[] args) {
        String kata = "Riki";
        System.out.println("Setelah dibalik: " + stringReverse(kata));
    }
}