import java.util.Scanner;

public class 27866 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		int num = scan.nextInt();
		scan.close();
		System.out.println(word.charAt(num-1));

	}
}
