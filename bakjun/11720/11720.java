
import java.util.Scanner;

public class 11720 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int cnt = scan.nextInt();
		String num = scan.next();
		scan.close();
		int total = 0;
		for(int i=0; i<cnt; i++){
			total += num.charAt(i) - '0';
		}

		System.out.println(total);

	}
}
