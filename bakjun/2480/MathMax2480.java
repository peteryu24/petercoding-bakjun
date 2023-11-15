package bakjun;

import java.util.Scanner;

public class MathMax2480 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int firstDice = scan.nextInt();
		int secondDice = scan.nextInt();
		int thirdDice = scan.nextInt();
		scan.close();

		int prize = 0;

		if (firstDice == secondDice) {
			if (firstDice == thirdDice) {
				prize = (firstDice * 1000) + 10000;
			} else {
				prize = (firstDice * 100) + 1000;
			}
		} else if (firstDice == thirdDice) {
			prize = (firstDice * 100) + 1000;

		} else if (secondDice == thirdDice) {
			prize = (secondDice * 100) + 1000;
		} else {
			
			int max = Math.max(firstDice, secondDice);
			max = Math.max(max, thirdDice);
			prize = max * 100;
		}

		System.out.println(prize);

	}
}
