import java.util.Scanner;
public class Lat1{
	public static void main (String [] args){
		Scanner masuk = new Scanner(System.in);
		String pwd = "AKAKOM";
		String masukan;
		System.out.print("Masukan pasword anda : ");
		masukan = masuk.next();
		if(pwd.equals(masukan)){
			System.out.println("Password anda benar");
		}else{
			System.out.println("Pasword yang anda masukan salah");
		}
	}
}