import java.util.Scanner;
public class Praktik3 {
    public static void main(String[] args){
        int baris=3, kolom=2;
        String[][] cats=new String[baris][kolom];
        System.out.println("Masukan Nama dan Warna deangan format (Nama Warna):");
        for(int i=0;i<baris;i++){
            for(int j=0;j<kolom;j++){
                cats[i][j]=input();
            }
        }

        System.out.println("Nama\tWarna ");
        for(int i=0;i<baris;i++){
            for(int j=0;j<kolom;j++){
                System.out.print(cats[i][j]+" ");
            }
            System.out.println();
        }
    }

    static String input(){
        Scanner a=new Scanner(System.in);
        String b=a.next();
        return b;
    }
}