import java.util.Scanner;

public class 25314 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int neededByte = scan.nextInt();
		scan.close();
		
		for(int i=0; i<(neededByte / 4); i++) {
			System.out.print("long ");
		}
		System.out.println("int");

	}
}
