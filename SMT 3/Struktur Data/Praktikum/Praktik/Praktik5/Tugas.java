import java.util.Scanner;
public class Tugas{
	public static void main (String args [] ){
		int nomor[] = new int [1024];
		int menu=0, z=0, view, temp;
		Scanner masuk = new Scanner(System.in);
		while(menu!=4){
			System.out.println("1. Insert\n 2. View \n 3. Sort \n 4. exit \n");
			menu = masuk.nextInt();
			if(menu == 1){
				z++;
				System.out.print("Masukan nomor : ");
				nomor[z] = masuk.nextInt();
			}else if (menu == 2){
				if(z<1){
					System.out.println("Kosong");
				}else{
					System.out.println("Data sebelum diurutkan : ");
					for(int a = 1; a <= z; a++){
						System.out.print(nomor[a]+ " ");
						System.out.print(" " );
					}
				}
			}else if (menu == 3 ){
				if (z<1){
					System.out.println("Kosong");
				}else{
					for (int c=1;c<=z;c++){
						System.out.print(nomor[c]+" ");
						System.out.println(" ");
						for(int a=2; a<=z; a++){
							int b = a;
							while(b > 1 && nomor[b-1] > nomor[b]){
								temp = nomor[b];
								nomor [b] = nomor[b-1];
								nomor[b-1] = temp;
								b--;
								for(c =1; c <=z; c++){
									System.out.print(nomor[c]+" ");
									if(c == a){
										System.out.print("| ");
									}
									System.out.println(" ");
								}
							}
						}
						System.out.print("Data setelah di urutkan : ");
						for(int a=1; a<=z; a++){
							System.out.print(nomor[a]+" ");
							System.out.print(" ");
						}
					}
				}
			}else if(menu ==4){
					System.out.println("Keluar");
				}else{
					System.out.println("Salah");
					System.out.println(" ");
				}
		}
	}
}