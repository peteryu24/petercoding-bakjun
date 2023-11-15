import java.util.Scanner;

public class 2525 { 

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int hour = scan.nextInt();
		int min = scan.nextInt();
		int neededTime = scan.nextInt();
		scan.close();

		int neededHour = 0;
		int neededMin;

		if (neededTime >= 60) {
			neededHour = (neededTime / 60);
			neededMin = (neededTime % 60);
		} else {
			neededMin = neededTime;
		}

		if ((hour + neededHour) > 23) {
			hour = (hour + neededHour) - 24;
		} else {
			hour += neededHour;
		}

		if ((min + neededMin) > 59) {
			hour += 1;
			if (hour == 24) {
				hour = 0;
			}
			min = (min + neededMin) - 60;
		} else {
			min += neededMin;
		}

		System.out.println(hour + " " + min);
	}
}
