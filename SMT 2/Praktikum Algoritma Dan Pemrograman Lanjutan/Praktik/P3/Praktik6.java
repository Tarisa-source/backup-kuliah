import java.util.Scanner;
public class Praktik6{
    public static void main(String args[]){
        Scanner masuk = new Scanner(System.in);
        float nilai[]= new float[5];
        float total,rata,max,min; // TAMBAHIN VARIABLE BUAT NAMPUNG MAX DAN MIN

        System.out.println("Masukan 5 buat data nilai");
        for (int i = 0; i < 5; i++){
            System.out.print("Data ke-" +(i + 1 )+" : ");
            nilai[i]=masuk.nextFloat();
        }

        System.out.println("Data nilai yang dimasukan");
        for (int i = 0; i < 5; i++){
            System.out.println(nilai[i]);
        }
        total = 0;
        max = 0; // DEFAULT MAX ADALAH NILAI TERKECIL
        min = 99999999; // DEFAULT MIN ADALAH NILAI TERBESAR

        for (int i = 0; i < 5; i++){
            total = total + nilai[i];
            // CEK APAKAH NILAI ADALAH YANG PALING BESAR
            if(max<nilai[i]){
                max = nilai[i];
            }
            // CEK APAKAH NILAI ADALAH YANG PALING KECIL
            if(min>nilai[i]){
                min = nilai[i];
            }
        }
        rata = total/5;

        System.out.println("Nilai terbesar = "+max);
        System.out.println("Nilai terkecil = "+min);
        System.out.println("Total data = "+total);
        System.out.println("Rata-rata = "+rata);
    }
}