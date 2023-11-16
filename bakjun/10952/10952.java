import java.util.Scanner;

public class 10952 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while (true) {
			int firstNum = scan.nextInt();
			int secondNum = scan.nextInt();
			
			if ((firstNum + secondNum) == 0) {
				scan.close();
				break;
			}
			System.out.println(firstNum + secondNum);
		}

	}
}
