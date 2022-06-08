public class Lat1_P9{
	public static void main (String [] args){
		int a = 20 ;

		double total;
		System.out.println("Konfersi celcius ke farenheit dari 20 derajat celcius");
		do {
			total = (a*1.8) + 32;
			System.out.println(+a+"derajat celcius : "+total);

			//System.out.println(total);//
			a++;
		}while(a<=30);
	}
}