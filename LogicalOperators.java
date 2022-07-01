package Codes;
import java.util.Scanner;


public class LogicalOperators {

	private static Scanner scanner;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// logical operators = used to connect two or more expressions
		
		//  &&   = ( AND ) both conditions must be true
		//  ||   = ( OR ) either conditions must be true
		//   !   = ( NOT ) reverses boolean value to a condition
		
		
		//  (&&) Example
		
		{int temp = 19;
		
		
		if(temp>30) {
			System.out.println("It is Hot outside");
		}
		else if (temp>=20 && temp<=30) {
			System.out.println("It is Warm outside");
		}
		else {System.out.println("It is cold outside");
		}
		
		
		
		//   ( || ) Example
		
		scanner = new Scanner(System.in);
		System.out.println("You are playing a game! Press q or Q to Quit");
		String response = scanner.next();
		
		if(response.equals("q") || response.equals("Q")) {
			System.out.println("You quit the game");
		}
			else { 
				System.out.println("You are still playing the game -_-");
			}
			
		System.out.println("----------------------------------------\n");
		
		//  ( ! ) Example
		
		
		System.out.println("You are playing a game! Press q or Q to Quit");
		String responsee = scanner.next();
		
		if(!responsee.equals("q") && !responsee.equals("Q")) {
			System.out.println("You are still playing the game -_-");
		}
			else { 
				System.out.println("You quit the game");
			}
			
		}
		
		
		
	}
	}


