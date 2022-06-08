import java.util.Scanner;
public class Tugas1{
	public static void main (String [] args){
		Scanner masuk = new Scanner(System.in);
		int neptuHL,neptuPL , neptuHP, neptuPP,total, L, P;
		System.out.print("Masukan neptu hari laki-laki : ");
		neptuHL = neptuHL.nextInt();
		System.out.print("Masukan neptu pasaran laki-laki : ");
		neptuPL = neptuPL.nextInt();
		System.out.print("Masukan neptu hari Perempuan : ");
		neptuHP = neptuHP.nextInt();
		System.out.print("Masukan neptu pasaran Perempuan : ");
		neptuPP = neptuPP.nextInt();
		total = neptuHL + neptuPL + neptuHP +neptuPP;
		switch(total){
			case 1: case 9: case 10:case 18: case 19: case 27: case 28: case 36:
			System.out.print("Masalah yang akan ditemui oleh weton ini adalah PEGAT, kemudian hari mulai dari masalah ekonomi, kekuasaan, perselingkuhan yang bisa menyebabkan pasangan tersebut bercerai atau pegatan");
			break;

			case 2: case 11: case 20: case 29:
			System.out.print(" Pasangan weton ini bisa saling menerima segala kelebihan
			dan kekurangan masing-masing. Rumah tangga pasangan JODOH ini bisa rukun sampai tua.");
			break;

			case 4: case 13: case 22: case 31:
			System.out.print("pasangan weton ini (Topo) akan sering mengalami kesusahan
			di awal musim karena masih saling memahami tapi akan bahagia pada akhirnya");
			break;

			default:
			System.out.print("Weton belum ada");
			break
		}
	}
}