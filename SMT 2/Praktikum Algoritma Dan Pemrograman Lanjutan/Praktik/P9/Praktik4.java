public class Praktik4{
	void sum(int a, int b){
		System.out.println(a+b);
	}
	void sum(int a, int b, int c){
		System.out.println(a+b+c);
	}
	public static void main(String [] args){
		Praktik4 demo = new Praktik4();
		demo.sum(1,6);
		demo.sum(4,2,3);
	}
}