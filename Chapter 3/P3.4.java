import java.util.Scanner;


/*
 * Write a program that reads three numbers and prints
 * "all the same" if they are all the same, "all different"
 * if they are all different, and "neither" otherwise.
 * 
 */

public class P3.4 {

	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter three numbers: ");
		
		double number1 = in.nextDouble();
		
		double number2 = in.nextDouble();
		
		double number3 = in.nextDouble();
		
		in.close();
	
	
		
		if (number1 == number2 && number2 == number3) {
			
			System.out.println("All the same.");
		
		} else if (number1 != number2 && number2 != number3 && number1 != number3) {
		
			System.out.println("All different.");
		
		} else {
			
			System.out.println("Neither.");
		
		}
	
	}


}