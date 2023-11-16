import java.util.Arrays;
import java.util.Scanner;

public class Array1037 {
	public static void main(String[] args) { 

		Scanner scan = new Scanner(System.in);
		int cnt = scan.nextInt();
		int arr[] = new int[cnt];
		int answer = 0;
		for (int i = 0; i < cnt; i++) {
			int num = scan.nextInt();
			arr[i] = num;
		}
		scan.close();

		Arrays.sort(arr);
		answer = arr[0] * arr[cnt - 1];

		System.out.println(answer);
	}
}
