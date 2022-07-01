package Codes;
import java.util.Scanner;

public class MathClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			double x =3.14;
		double y =-10;
		
		double a = Math.max(x, y);  // To Find Larger Number
		System.out.println(a);
		
		double b = Math.min(x, y);  // To Find Lower  Number 
		System.out.println(b);
		
		double c = Math.abs(y);  // To find the  absolute  value
		System.out.println(c);
		
		double d = Math.sqrt(x);  // To Find square root
		System.out.println(d);
		
		double e = Math.round(x);  // To round off the number
		System.out.println(e);
		
		double f = Math.ceil(x);  // To round off the number up
		System.out.println(f);
		
		double g = Math.round(x);  // To round off the number lowest
		System.out.println(g);
		
		
	}
		{
			// How To Make Question and Find a Solution in Maths
			
		double xx;
		double yy;
		double zz;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the Side of XX : ");
		xx = scanner.nextDouble();
		
		System.out.println("Enter the Side of YY : ");
		yy = scanner.nextDouble();
		
		zz = Math.sqrt((xx*xx)+(yy*yy));
		
		System.out.println("The hypotenuse is : " + zz);
		
		scanner.close();  
		}
		
		
		
	}
	}

