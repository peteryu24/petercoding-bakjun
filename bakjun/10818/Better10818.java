import java.util.Arrays;
import java.util.Scanner;

public class Better10818 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int numCnt = scan.nextInt();
		int mArr[] = new int[numCnt];

		for (int i = 0; i < numCnt; i++) {
			int num = scan.nextInt();
			mArr[i] = num;
		}
		scan.close();

		Arrays.sort(mArr);

		System.out.println(mArr[0] + " " + mArr[numCnt-1]);

	}
}
