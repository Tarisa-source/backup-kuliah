import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] data = new double[10];
        char[] keluar = new char[10];
        int i = 0;
        while (i < 10) {
            System.out.print("data ke-" + (i + 1) + ":");
            data[i] = scan.nextDouble();
            i++;
        }
        System.out.println("=====================");
        System.out.println("| Hasil Konversi |");
        System.out.println("=====================");
        keluar = konversiNilai(data);
        i = 0;
        while (i < 10) {
            System.out.println(data[i] + " " + keluar[i]);
            i++;
        }
    }

    public static char[] konversiNilai(double[] x) {
        int n = x.length;
        char hasil[] = new char[n];
        int i = 0;
        while (i < n) {
            int key = (int) x[i];
            switch (key) {
                case 100:
                case 99:
                case 98:
                case 97:
                case 96:
                case 95:
                case 94:case 93:case 92:case 91:
                case 90: case 89:case 88:case 87:
                case 86:case 85:case 84:
                case 83:case 82:case 81:
                    hasil[i] = 'A';
                    break;
                case 80:case 79:case 78:case 77:
                case 76:case 75:case 74:case 73:
                case 72:case 71:case 70:
                case 69:case 68:case 67:case 66:case 65:case 64:
                case 63:case 62:case 61:
                    hasil[i] = 'B';
                    break;
                case 60:case 59:case 58:case 57:
                case 56:case 55:case 54:case 53:
                case 52:case 51: case 50:case 49:case 48:case 47:case 46:case 45:
                case 44:case 43:case 42:case 41:
                    hasil[i] = 'C';
                    break;
                case 40:case 39:case 38:case 37:
                case 36:case 35:case 34:case 33:case 32:case 31:case 30:case 29:
                case 28:case 27:case 26:case 25:case 24:case 23:case 22:case 21:
                    hasil[i] = 'D';
                    break;
                case 20:case 19:case 18:case 17:
                case 16:case 15:case 14:case 13:case 12:case 11:case 10:case 9:
                case 8:case 7:case 6:case 5:
                case 4:case 3:case 2:case 1:
                    hasil[i] = 'E';
                    break;
            }
            i++;
        }
        return hasil;
    }
}