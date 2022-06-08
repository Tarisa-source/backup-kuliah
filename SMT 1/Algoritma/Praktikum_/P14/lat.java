import java.util.Scanner;
import java.lang.Math;

class lat {
    public static void main(String[ ] args) {
        double a=44, b=55, c=60, d, x1 ,x2;
        d = (b*b) - (4*a*b);
        if(d<0){
            // Jika kurang dari 0 maka x1 = x2 adalah bilangan komples
            System.out.println("Maka x1 = x2 adalah bilangan kompleks");
        }else if(d==0){
            // Jika diskriminan 0 maka x1 = x2
            x1 = -b /(2 * a);
            System.out.println("Maka x1 = x2 = " + x1);
        }else{
            x1 = (-b + Math.sqrt(d)) / (2 * a);
            x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("Maka x1 = " + x1 + " dan x2 = " + x2);
        }
    }
}