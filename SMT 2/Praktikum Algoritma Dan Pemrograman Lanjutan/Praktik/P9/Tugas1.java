public class Tugas1{
	// mencari sisi miring
	static double pitagoras(double a, double b){
		// method sqrt() : untuk mencari akar
		// method pow() : untuk mencari pangkat
		double c = Math.sqrt( Math.pow(a,2) + Math.pow(b,2) );
	    return c;
    }
    public static void main (String [] args){
		double a = 8.0;
        double b = 6.0;
        double c = pitagoras(a, b);
		System.out.println("Sisi miring  = " + c);
	}
}