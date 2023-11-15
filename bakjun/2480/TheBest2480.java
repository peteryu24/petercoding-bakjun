package bakjun;

import java.util.Scanner;

public class TheBest2480 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int firstDice = scan.nextInt();
		int secondDice = scan.nextInt();
		int thirdDice = scan.nextInt();
		scan.close();

		int prize = 0;
		if (firstDice != secondDice && secondDice != thirdDice && firstDice != thirdDice) {

			int max = Math.max(firstDice, secondDice);
			max = Math.max(max, thirdDice);
			prize = max * 100;

		} else {

			if (firstDice == secondDice && firstDice == thirdDice) {

				prize = (firstDice * 1000) + 10000;

			} else {

				if (firstDice == secondDice || firstDice == thirdDice) {

					prize = (firstDice * 100) + 1000;

				} else { // secondDice == thirdDice

					prize = (secondDice * 100) + 1000;
				}

			}
		}

		System.out.println(prize);

	}
}
