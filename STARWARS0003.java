import java.util.Scanner;
//NAMA : ISMAIL UMAR
//NIM  : D0217308
//KELAS: INFORMATIKA. A 2017
public class STARWARS0003 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("INPUT");
		int a = sc.nextInt();
		System.out.println("OUTPUT");
		for (int i = 1; i <= a; i++) {
			System.out.print(i+ " ");
		}
		for (int i = 1; i > a; i++) {
			System.out.println("UNDEFINED");
			break;
		}
	}
}
