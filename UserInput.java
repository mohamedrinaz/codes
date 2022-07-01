package Codes;
import java.util.Scanner;



public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	try (Scanner scanner = new Scanner(System.in)) {
		System.out.println("What is your name?");
		String name = scanner.nextLine();
		System.out.println("What is your Age:");
		int age = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Whats is your favourite Food");
		String food =scanner.nextLine();
		
		
		System.out.println("Hello " +name);
		System.out.println("You are " +age+ " years old");
		System.out.println("Your Favourite Food is " +food );
	}
	

	}

}
