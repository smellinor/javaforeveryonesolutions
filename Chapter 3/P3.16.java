import java.util.Scanner;


/* 
 * Write a program that reads in three strings and sorts
 * them lexicographically.
 *
 */

public class P3.16 {

	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		
		String firstString = in.nextLine();
		
		System.out.print("Enter another string: ");
		
		String secondString = in.nextLine();
		
		System.out.print("Enter another string: ");
		
		String thirdString = in.nextLine();
		
		in.close();

			
		
		
		if (secondString.compareTo(firstString) >= 0 && 
				
			thirdString.compareTo(firstString) >=0) {
			
			System.out.println(firstString);
			
			if (secondString.compareTo(thirdString) >= 0) {
				
				System.out.println(thirdString);
				
				System.out.println(secondString);
			
			} else {
				
				System.out.println(secondString);
				
				System.out.println(thirdString);
			
			}
		
		} else if (firstString.compareTo(secondString) >= 0 &&
				
			thirdString.compareTo(secondString) >= 0) {
			
			System.out.println(secondString);
			
			if (firstString.compareTo(thirdString) >= 0) {
				
				System.out.println(thirdString);
				
				System.out.println(firstString);
			
			} else {
				
				System.out.println(firstString);
				
				System.out.println(thirdString);
			
			}
		
		} else {
			
			System.out.println(thirdString);
			
			if (secondString.compareTo(firstString) >= 0) {
				
				System.out.println(firstString);
				
				System.out.println(secondString);
			
			} else {
				
				System.out.println(secondString);
				
				System.out.println(firstString);
			
			}
		
		}		
		
	
	}


}