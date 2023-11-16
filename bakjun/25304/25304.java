import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int totalPrice = scan.nextInt();
		int totalItemCnt = scan.nextInt();
		int actualPrice =0;
		
		for(int i=0; i<totalItemCnt; i++) {
			int itemPrice = scan.nextInt();
			int itemCnt = scan.nextInt();
			
			actualPrice += (itemPrice * itemCnt);
		}
		scan.close();
		
		if(totalPrice == actualPrice) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}
}
