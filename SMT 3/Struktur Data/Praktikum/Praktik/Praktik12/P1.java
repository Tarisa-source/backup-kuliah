import java.util.LinkedList;
public class P1{
	LinkedList daftarMhs = new LinkedList();
	P1(){
		if (daftarMhs.isEmpty()==true){
			System.out.println("Linkedlist kosong");
		}
		else{
			System.out.println("Linkedlist isi");
		}
	}
	public static void main(String args[]){
		new P1();
	}
}
