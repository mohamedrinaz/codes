package Codes;
import java.util.Scanner;


public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// While loop = executes a block of code as long as its condition remains true
		
		try (Scanner scanner = new Scanner(System.in)) {
			String name = "";
			
		while(name.isEmpty()) {
			System.out.println("Enter Your Name :");
			name = scanner.nextLine();
		
				
			}
			System.out.println("Hello " +name);
			
			// Do Loop - Its a same variation of while loop
			
			
			do {
			
			System.out.println("Enter Your Name :");
				name = scanner.nextLine();
			} while(name.isEmpty());
		
			System.out.println("Hello " +name);
			
			}
		
	}

}
