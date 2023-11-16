import java.util.Scanner;

public class Slow10818 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int numCnt = scan.nextInt();
		int mArr[] = new int[numCnt];

		for (int i = 0; i < numCnt; i++) {
			int num = scan.nextInt();
			mArr[i] = num;
		}
		scan.close();

		int max = mArr[0];
		int min = mArr[0];

		for (int i = 1; i < numCnt; i++) {
			if (max < mArr[i]) {
				max = mArr[i];
			}

			if (min > mArr[i]) {
				min = mArr[i];
			}
		}

		System.out.println(min + " " + max);

	}
}
