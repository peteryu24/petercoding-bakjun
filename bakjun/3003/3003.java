import java.util.Scanner;

public class 3003 {
	public static void main(String[] args) {
		int[] defaultChessArr = new int[6];
		defaultChessArr[0] = 1;
		defaultChessArr[1] = 1;
		defaultChessArr[2] = 2;
		defaultChessArr[3] = 2;
		defaultChessArr[4] = 2;
		defaultChessArr[5] = 8;

		Scanner scan = new Scanner(System.in);
		int[] havingArr = new int[6];

		for (int i = 0; i < 6; i++) {
			havingArr[i] = scan.nextInt();
		}
		scan.close();
		
		for(int i=0; i<6; i++) {
			System.out.print((defaultChessArr[i]-havingArr[i])+" ");
		}
	}
}
