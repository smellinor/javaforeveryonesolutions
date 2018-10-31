import java.util.Scanner;


/*
 * Write a program that reads an integer and prints
 * whether it is negative, zero or positive.
 *
 */

public class P3.1 {

	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		
		int inputInt = in.nextInt();
		
		in.close();

		
		
		ifinputInt > 0) {
			
			System.out.println("The integer is positive");
		
		} else if inputInt < 0) {
			
			System.out.println("The integer is negative");
		
		} else {
			
			System.out.println("The integer is 0");
		
		}

	}


}