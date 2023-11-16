import java.util.Scanner;

public class 5597 {
	public static void main(String[] args) {

		int studentArr[] = new int[30];
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < 28; i++) {
			int goodStudent = scan.nextInt();
			studentArr[goodStudent - 1] = 1;
		}
		scan.close();
		
		for(int i=0; i<30; i++) {
			if(studentArr[i] != 1) {
				System.out.println(i+1);
			}
		}
	}
}
