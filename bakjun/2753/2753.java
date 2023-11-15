package bakjun;

import java.util.Scanner;

public class 2753 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int year = scan.nextInt();
		scan.close();

		int flag = 0;

		if ((year % 4) == 0) {
			if ((!((year % 100) == 0) || (year % 400) == 0)) {
				flag = 1;
			}
		}

		System.out.println(flag);
	}
}
