import java.util.Scanner;

public class 2562 {
	public static void main(String[] args) {
		int[] arr = new int[9];
		
		Scanner scan = new Scanner(System.in);
		for(int i=0; i<9; i++) {
			int num= scan.nextInt();
			arr[i]=num;
		}
		scan.close();
		
		int max = arr[0];
		int where = 0;
		for(int i=1; i<9; i++) {
			if(max<arr[i]) {
				max=arr[i];
				where=i;
			}
		}
		
		System.out.println(max);
		System.out.println(where+1);

	}
}
