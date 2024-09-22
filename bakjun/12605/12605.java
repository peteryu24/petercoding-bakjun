import java.util.Scanner;

public class 12605 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        scan.nextLine();

        for(int i=0; i<t; i++){
            String str = scan.nextLine();
            String[] arr = str.split(" ");

            System.out.print("Case #" + (i+1)+": ");
            for(int j= (arr.length-1); j>=0; j--){
                System.out.print(arr[j]+" ");
            }
            System.out.println();

        }
    }
}
