import java.util.Scanner;

public class 10807 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int arrSize= scan.nextInt();
		int[] intArr = new int[arrSize];
		
		for(int i=0; i<arrSize; i++) {
			int inputNum=scan.nextInt();
			intArr[i]=inputNum;
		}
		
		int numToFind = scan.nextInt();
		scan.close();
		
		int cnt=0;
		for(int i=0; i<arrSize; i++) {
			if(intArr[i]==numToFind) {
				cnt +=1;
			}
		}
		
		System.out.println(cnt);
	}
}
