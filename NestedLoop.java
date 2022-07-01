package Codes;
import java.util.Scanner;


public class NestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Nested Loop = a loop inside of a loop
		
		try (Scanner scanner = new Scanner(System.in)) {
			int rows;
			int columns;
			String symbol ="";
			
			System.out.println("Enter # of rows : ");
			rows = scanner.nextInt();
			
			System.out.println("Enter # of columns : ");
			columns = scanner.nextInt();
			
			System.out.println("Enter The Symbol");
			symbol =scanner.next();
			
			for (int i=1; i<=rows; i++) {
				System.out.println();
				for(int j=1; j<=columns; j++) {
					System.out.print(symbol);
				}
			}
		}
			
		
		
	}

}
