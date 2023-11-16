import java.util.Scanner;

public class 2439 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int wantedRow = scan.nextInt();	
		scan.close();

		for (int i = 1; i <= wantedRow; i++) {
			for (int j = 1; j <= wantedRow - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
