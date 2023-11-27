import java.util.Scanner;

public class 3003 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int king = 1;
		int queen = 1;
		int rook = 2;
		int bishop = 2;
		int knight = 2;
		int pawn = 8;
 
		king = king - scan.nextInt();
		queen = queen - scan.nextInt();
		rook = rook - scan.nextInt();
		bishop = bishop - scan.nextInt();
		knight = knight - scan.nextInt();
		pawn = pawn - scan.nextInt();
		
		scan.close();

		System.out.print(king + " ");
		System.out.print(queen + " ");
		System.out.print(rook + " ");
		System.out.print(bishop + " ");
		System.out.print(knight + " ");
		System.out.print(pawn);		
	}
}
