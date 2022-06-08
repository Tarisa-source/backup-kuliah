import java.util.Scanner;

public class Tugas1 {
    private static Boolean polindrome(String kata) {
        // buat variabel untuk nampung kata baru
        String balik = "";
        // perulangan untuk buat kata baru tapi hurufnya diambil dari belakang
        // misal katanya adalah "uang"
        // maka setelah lewat ini variabel balik berisi "gnau"
        for (int i = kata.length(); i > 0; i--) {
            String a = kata.substring(i - 1, i);
            balik += a;
        }
        // cek apakah balik sama dengan kata
        // kalo sama berarti polindrome
        if (kata.equals(balik)) {
            return true;
        }
        // kalo engga berarti false
        return false;

    }

    public static void main(String[] args) {
        // deklarasi variabel yang diperlukan
        String kata;
        Scanner scan = new Scanner(System.in);

        // proses input user | memasukkan kata yang akan dicek
        System.out.print("Masukkan kata : ");
        kata = scan.nextLine();

        // menampilkan hasil
        System.out.println(polindrome(kata));
    }
}