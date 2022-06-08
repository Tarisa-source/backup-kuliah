import java.util.Scanner;
import java.lang.Math;
public class Tugas{
	public static void main (String [] args){
		Scanner masuk = new Scanner(System.in);
		double a,b,c;
		double x1,x2;
		double D;
		double x;
		System.out.println("Menghitung akar akar persamaan kuadrat ax2+bx+c=0");
		System.out.print("Masukan a : ");
		a = masuk.nextInt();
		System.out.print("Masukan b : ");
		b = masuk.nextInt();
		System.out.print("Masukan c : ");
		c = masuk.nextInt();
		System.out.println("Persamaan kuadrat anda "+a+"x^2+"+b+"x+"+c+"=0");
		D = (b*b) - (4*a*c);
		//x = Math.sqrt(D);
		/*x1 = (-b + x)/(2*a);
		System.out.println("Nilai X1 : "+x1);
		x2 = (-b - x)/(2*a);
		System.out.println("Nilai X2 : "+x2);*/
		if(D>=0){
			System.out.println("Deskriminan untuk persamaan kuadrat anda : "+D+" bilangan real");
			x1 = (-b + Math.sqrt(D)) / (2 * a);
			x2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.println("Maka x1 = " + x1 + " dan x2 = " + x2);
		}else {
			if(D==0){
				System.out.println("Deskriminan untuk persamaan kuadrat anda : "+D+" bilangan kembar");
				System.out.println("Maka X1 = 0 dan X2=0");
			}else{
				if(D<0){
				x1 = (-b + Math.sqrt(D)) / (2 * a);
				x2 = (-b - Math.sqrt(D)) / (2 * a);
				System.out.println("Deskriminan untuk persamaan kuadrat anda : "+D+" bilangan kompleks");
				System.out.println("Maka X1 = "+x1+" dan X2 = "+x2);
				}
			}
		}


	}
}