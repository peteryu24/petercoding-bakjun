import java.util.Scanner;

public class 2884 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int hour = scan.nextInt();
		int min = scan.nextInt();
		scan.close();

		if (min >= 45) {
			min -= 45;
		} else {

			if (hour == 0) {
				hour = 23;
			} else {
				hour -= 1;
			}
			
			min = 60 - (45 - min);
		}

		System.out.println(hour + " " + min);
	}
}
