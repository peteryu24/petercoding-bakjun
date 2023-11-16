import java.util.Scanner;

public class 11021 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int cnt = scan.nextInt();
		for (int i = 1; i <= cnt; i++) {
			int firstNum = scan.nextInt();
			int secondNum = scan.nextInt();

			System.out.println("Case #" + i +": "+ (firstNum + secondNum));
		}
		scan.close();

	}
}
