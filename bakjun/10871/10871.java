import java.util.Scanner;

public class 10871 {	 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int X = scan.nextInt();
        
		StringBuilder strBuilder = new StringBuilder();
 
		for(int i = 0 ; i < N ; i++) {
			
			int value = scan.nextInt();
			
			
			if(value < X) {
				strBuilder.append(value+" ");
			}
		}
		scan.close();
		System.out.println(strBuilder);	
	}
}
