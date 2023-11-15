import java.util.Scanner;

public class enhanced2525 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
 
        int hour = scan.nextInt();
        int min = scan.nextInt();
        int neededTime = scan.nextInt();
        scan.close();
 
        int currnetTimeToMin = (60 * hour) + min;   
        currnetTimeToMin += neededTime;
 
        int estimatedHour = (currnetTimeToMin / 60) % 24;
        int estimatedMin = currnetTimeToMin % 60;
 
        System.out.println(estimatedHour + " " + estimatedMin);
 
    }
}
