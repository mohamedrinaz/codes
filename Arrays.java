package Codes;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Array = used to store multiple values in a single variable
	
		
		
		// Method 1
		
	String[] cars = {"Camaro" ,"Corvette" , "Tesla"};
	
	cars[0] = "Mustang";             // how to replace array in a list 
	
	System.out.println(cars[0]);
	
	  // Method 2 
	
	String [] carr = new String[3];
	
	carr[0] = "Camaro";
	carr[1] = "Corvette";
	carr[2] = "Tesla";
	
	System.out.println(carr[2]);
	
	// For Loop IN Array
	
	for(int i=0; i<carr.length; i++) {
		System.out.println(carr[i]);
	}
			
			

}
}
