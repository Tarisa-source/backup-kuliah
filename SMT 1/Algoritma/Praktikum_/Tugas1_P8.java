import java.util.Scanner;
public class Tugas1_P8{
	public static void main (String [] args){
		Scanner masuk = new Scanner (System.in);
		int total = 0,i=1, data, databaru;
		float rata=0;
		System.out.println("Menghitung jumlah dan rata rata dari suatu data");
		System.out.println("Masukan jumlah data : ");
		data = masuk.nextInt();
		while(i<=data){
			System.out.println("Data ke" +i+ ": ");
			databaru = masuk.nextInt();
			total = total + databaru;
			rata = total / data;
			i++;
			//data++;//
		}
		System.out.println("Rata rata : "+rata);
		System.out.println("Total : "+total);
	}
}
