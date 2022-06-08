import java.util.Scanner;
public class Teori_8{
	public static void main (String [] args){
		Scanner masuk = new Scanner (System.in);
		int kode;
		System.out.println("Masukan kode 1(Mobil)/2(Motor) :");
		kode = masuk.nextInt();
		switch(kode){
			case 1 :
				int mobil;
				System.out.println("Pilih merek mobil 1(Honda)/ 2(Suzuki): ");
				mobil = masuk.nextInt();
				switch(mobil){
					case 1 :
						int jenis ;
						System.out.println("Anda memilih merk honda");
						System.out.println("Pilih jenis mobil 1(jazz)/ 2(Brio)/ 3(Mobilio): ");
						jenis = masuk.nextInt();
						switch(jenis){
							case 1 :
								System.out.println("Harga mobil Honda Jazz : Rp. 170.000.000");
								break;
							case 2 :
								System.out.println("Harga mobil Honda Brio : Rp. 120.000.000 ");
								break;
							case 3 :
								System.out.println("Harga mobil Honda Mobilio  :Rp. 170.000.000 ");
								break;
							default :
								System.out.println("Kode yang anda masukan salah ");
								break;
						}
						break;
					case 2 :
						//int jenis ;//
						System.out.println("Anda memilih merk Suzuki ");
						System.out.println("Pilih jenis mobil 1(APV)/ 2(Swift)/ 3(Ertiga): ");
						jenis = masuk.nextInt();
						switch(jenis){
							case 1 :
								System.out.println("Harga mobil Suzuki APV : Rp. 180.000.000");
								break;
							case 2 :
								System.out.println("Harga mobil Suzuki Swift: Rp. 155.000.000 ");
								break;
							case 3 :
								System.out.println("Harga mobil Suzuki Ertiga  :Rp. 160.000.000 ");
								break;
							default :
								System.out.println("Kode yang anda masukan salah ");
								break;
						}
						break;
				}
				break;
				case 2 :
					int motor;
					System.out.println("Pilih merek motor 1(Honda)/ 2(Yamaha): ");
					motor = masuk.nextInt();
					switch(motor){
						case 1 :
							int jenis ;
							System.out.println("Anda memilih merk Honda");
							System.out.println("Pilih jenis mobil 1(Vario)/ 2(Supra): ");
							jenis = masuk.nextInt();
							switch(jenis){
								case 1 :
									System.out.println("Harga motor Honda Vario : Rp. 15.000.000");
									break;
								case 2 :
									System.out.println("Harga motro Honda Supra : Rp. 12.000.000 ");
									break;
								default :
									System.out.println("Kode yang anda masukan salah ");
									break;
							}
							break;
						case 2 :
							//int jenis ;//
							System.out.println("Anda memilih merk Yamaha ");
							System.out.println("Pilih jenis mobil 1(Mio)/ 2(Vixion): ");
							jenis = masuk.nextInt();
							switch(jenis){
								case 1 :
									System.out.println("Harga motro Yamaha Mio : Rp. 14.000.000");
									break;
								case 2 :
									System.out.println("Harga motor Yamaha Vixion: Rp. 40.000.000 ");
									break;
								default :
									System.out.println("Kode yang anda masukan salah ");
									break;
							}
							break;
					}
					break;
				default :
					System.out.println("Kode yang anda masukan salah ");
					break;
		}
	}
}