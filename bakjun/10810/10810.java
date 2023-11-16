import java.util.Scanner;

public class 10810 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int bagCnt = scan.nextInt();
		int bagArr[] = new int[bagCnt];
		int actionCnt = scan.nextInt();

		for (int a = 0; a < actionCnt; a++) {
			int i = scan.nextInt();
			int j = scan.nextInt();
			int k = scan.nextInt();
			for (int b = (i + 1); b < (j - 1); b++) {
				bagArr[b] = k;
			}
		}
		scan.close();
		
		for(int i=0; i<bagCnt; i++) {
			System.out.print(bagArr[i]+" ");
		}

	}
}
