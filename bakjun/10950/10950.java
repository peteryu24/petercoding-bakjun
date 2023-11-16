import java.util.Scanner;

public class 10950 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int cnt = scan.nextInt();
		for (int i = 0; i < cnt; i++) {
			int firstNum = scan.nextInt();
			int secondNum = scan.nextInt();

			System.out.println(firstNum + secondNum);
		}
		scan.close();

	}
}
