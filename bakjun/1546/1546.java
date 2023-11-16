import java.util.Arrays;
import java.util.Scanner;

public class 1546 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int cnt = scan.nextInt();
		float gradeArr[] = new float[cnt];
		for (int i = 0; i < cnt; i++) {
			float grade = scan.nextFloat();
			gradeArr[i] = grade;
		}
		scan.close();

		Arrays.sort(gradeArr);
		float total = 0;
		for (int i = 0; i < cnt; i++) {
			gradeArr[i] = (gradeArr[i] / gradeArr[cnt - 1]) * 100;
			total += gradeArr[i];
		}
		System.out.println(total / cnt);

	}
}
