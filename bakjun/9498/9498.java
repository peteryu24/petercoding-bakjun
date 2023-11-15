import java.util.Scanner;

public class 9498 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int score, num;
		char grade;

		score = scan.nextInt();
		scan.close();

		num = score / 10; // Easier for cases

		switch (num) {
		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		default:
			grade = 'F';
			break;
		}

		System.out.println(grade);
	}

}
