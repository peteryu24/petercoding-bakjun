import java.util.Scanner;

public class 2908 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int firstNum = scan.nextInt();
		int secondNum = scan.nextInt();
        
		scan.close();
        
		firstNum = Integer.parseInt(new StringBuilder().append(firstNum).reverse().toString());
		secondNum = Integer.parseInt(new StringBuilder().append(secondNum).reverse().toString());
		
		System.out.print(firstNum > secondNum ? firstNum : secondNum);
		
	}
}
