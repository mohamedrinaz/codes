package Codes;
import java.util.Random;

public class RandomValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random random = new Random();
		
		int x = random.nextInt();// To limit the number enter number inside the bracket (any No (6));
		                         // to have 6 included (6)+1
		
		double y = random.nextDouble();
		
		boolean z = random.nextBoolean();
		
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}

}
