package Codes;

public class ArrayTwoD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		                            // 2D Array = an array of arrays
		
		String [][] cars = new String[3][3];
		
		cars[0][0] = "Camaro";
		cars[0][1] = "Corvette";
		cars[0][2] = "Silverado";
		cars[1][0] = "Mustang";
		cars[1][1] = "Ranger";
		cars[1][2] = "F-150";
		cars[2][0] = "Ferrari";
		cars[2][1] = "Lambo";
		cars[2][2] = "Tesla";
		
		                              // Nested Loop In Arrays 
		
		for(int i=0; i<cars.length; i++) {
			System.out.println();
			for(int j=0; j<cars[i].length; j++) {
				System.out.print(cars[i][j]+ " ");
			}
			
			// Other Way to write the array
				
	//		String [][] carr = {
	//				            {"Camaro","Corvette","Silverado"},
	//				            {"Mustang", "Ranger","F-150"},
	//				            {"Ferrari", "Lambo","Tesla"}	
		//			            	};
					            	
						
       //    	            for(int q=0; q<carr.length; q++) {
		//		      	System.out.println();
		//			    	for(int w=0; w<carr[q].length; w++) {
		//			      	System.out.print(carr[q][w]+ " ");
	//				        			}
           	            }
		
	}

}