import java.util.Scanner;

public class 8393 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int endNum = scan.nextInt();
		int total=0;
		
		for(int i=1; i<=endNum; i++) {
			total+=i;
		}
		
		System.out.println(total);

		scan.close();
	}
}
