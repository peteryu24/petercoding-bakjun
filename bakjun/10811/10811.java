import java.util.Scanner;

public class 10811 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int bagCnt = scan.nextInt();
        int[] bag = new int[bagCnt];
        for (int i = 0; i < bagCnt; i++) {
            bag[i] = i + 1; 
        }
        int tryCnt = scan.nextInt();
        for (int i = 0; i < tryCnt; i++) {
            int reverseStart = scan.nextInt() - 1; 
            int reverseEnd = scan.nextInt() - 1;

            while (reverseStart < reverseEnd) {
                int temp = bag[reverseStart];
                bag[reverseStart] = bag[reverseEnd];
                bag[reverseEnd] = temp;
                reverseStart++;
                reverseEnd--;
            }
        }
        scan.close();

        for (int i = 0; i < bagCnt; i++) {
            System.out.print(bag[i] + " ");
        }
    }
}



