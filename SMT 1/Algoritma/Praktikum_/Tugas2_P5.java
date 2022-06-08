import java.util.Scanner ;
public class Tugas2_P5{
	public static void main (String [] args){
		Scanner masuk = new Scanner (System.in);
		int sisi1, sisi2, sisi3 ;
		System.out.println("Masukan sisi A : ");
		sisi1 = masuk.nextInt();
		System.out.println("Masukan sisi B : ");
		sisi2 = masuk.nextInt();
		System.out.println("Masukan sisi C : ");
		sisi3 = masuk.nextInt();
		if (sisi1 == sisi2 && sisi2 == sisi3 ){
			System.out.println("Segitiga Sama Sisi");
		}else {
			if(sisi1==sisi2 || sisi2==sisi3 || sisi3==sisi1){
				System.out.println("Segitiga Sama Kaki");
			}else {
				System.out.println("Segitia Sembarang");
			}

		}
	}
}