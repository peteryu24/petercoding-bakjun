import java.util.Scanner;

public class 10809 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] arr = new int[26];

		for (int i = 0; i < 26; i++) {
			arr[i] = -1;
		}

		String word = scan.nextLine();
		scan.close();

		for (int i = 0; i < word.length(); i++) {
			char letter = word.charAt(i);

			if (arr[letter - 'a'] == -1) { 
				arr[letter - 'a'] = i;
			}
		}

		for (int val : arr) { 
			System.out.print(val + " ");
		}
	}
}
