import java.util.Scanner;


/*
 * Write a program that reads in two floating point numbers
 * and tests whether they are the same up to two decimal places.
 * 
 */

public class P3.19 {

	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter two floating-point numbers: ");
		
		double firstFloat = in.nextDouble();
			
		double secondFloat = in.nextDouble();
		
		in.close();

		
		
		double epsilon = 1E-2;
		
		
		if(Math.abs(firstFloat-secondFloat) < epsilon) {
			
			System.out.println("They are the same up to two decimal places.");
		
		} else {
			
			System.out.println("They are different.");
		
		}
		
	
	}


}