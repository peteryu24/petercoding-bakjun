import java.util.Scanner;

public class 10951 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while(scan.hasNextInt()){
			
			int firstNum=scan.nextInt();
			int secondNum=scan.nextInt();
			System.out.println(firstNum+secondNum);
		
		}	
		scan.close();
	}
}
