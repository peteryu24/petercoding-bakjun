import java.util.Scanner;

public class 3052 {

	public static void main(String[] args) {
		boolean arr[] = new boolean[42];

		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			int num = scan.nextInt();
			int result = (num % 42);

			if (arr[result] == false) {
				arr[result] = true;
			}
		}
		scan.close();
		int cnt =0;
		for(int i=0; i<42; i++) {
			if(arr[i] == true) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
