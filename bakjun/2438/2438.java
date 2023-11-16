import java.util.Scanner;

public class 2438 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int wantedRow = scan.nextInt();	
		scan.close();
		for(int i=1; i<=wantedRow; i++) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
