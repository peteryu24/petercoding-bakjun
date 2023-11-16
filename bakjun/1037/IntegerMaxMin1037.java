import java.util.Scanner;

public class IntegerMaxMin1037 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int cnt = scan.nextInt();
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		while (cnt-- > 0) {
			int num = scan.nextInt();

			if (num > max) {
				max = num;
			}

			if (num < min) {
				min = num;
			}
		}
		scan.close();
		System.out.println(max * min);

	}
}
