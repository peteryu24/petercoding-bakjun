import java.util.Scanner;

public class 2675 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int tryCnt = scan.nextInt();
		for (int i = 0; i < tryCnt; i++) {
			int times = scan.nextInt();
			String word = scan.next();
			int wordLength = word.length();
			for (int j = 0; j < wordLength; j++) {
				for (int k = 0; k < times; k++) {
					System.out.print(word.charAt(j));
				}
			}
			System.out.println();
		}
		scan.close();

	}
}
