import java.util.Scanner;

public class 9086 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int cnt = scan.nextInt();
		String arr[] = new String[cnt];
		for (int i = 0; i < cnt; i++) {
			String word = scan.next();
			int length = word.length();
			arr[i]=(word.charAt(0) + "" + word.charAt(length - 1));

		}
		scan.close();
		for(int i=0; i<cnt; i++) {
			System.out.println(arr[i]);
		}

	}
}
