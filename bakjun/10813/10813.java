import java.util.Scanner;

public class 10813 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int bagCnt = scan.nextInt();
		int bagArr[] = new int[bagCnt];
		int actionCnt = scan.nextInt();

		for (int i = 0; i < bagCnt; i++) {
			bagArr[i] = (i + 1);
		}

		for (int a = 0; a < actionCnt; a++) {
			int i = scan.nextInt();
			int j = scan.nextInt();

			int storage = bagArr[j-1];

			bagArr[j-1] = bagArr[i-1];
			bagArr[i-1] = storage;

		}
		scan.close();

		for (int i = 0; i < bagCnt; i++) {
			System.out.print(bagArr[i] + " ");
		}

	}
}
