public class Latihan2 {
    // method rekursif
    public static String stringReverse(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return stringReverse(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        String str = "Semangatya";
        System.out.println("Setelah dibalik: " + stringReverse(str));

    }
}