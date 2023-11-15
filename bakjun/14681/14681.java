import java.util.Scanner;

public class 14681 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int x = scan.nextInt();
		int y = scan.nextInt();
		scan.close();

		int quadrant = 1;

		if (x < 0) {
			if(y>0) {
				quadrant = 2;
			}else {
				quadrant = 3;
			}
		} else {
			if (y < 0) {
				quadrant = 4;
			}
		}
		
		System.out.println(quadrant);
	}
}
