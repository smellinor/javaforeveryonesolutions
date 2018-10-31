import java.util.Scanner;


/*
 * Write a program that reads in three integers and prints 
 * "in order" if they are sorted in ascending or descending order,
 * or "not in order" otherwise. 
 *
 */

public class P3.7 {

	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter three integers: ");
		
		int number1 = in.nextInt();
		
		int number2 = in.nextInt();
		
		int number3 = in.nextInt();
		
		in.close();
		
		
		if (number1 < number2 && number2 < number3) {
			
			System.out.printf("%d %d %d in order", number1, number2, number3);
		
		} else if (number1 > number2 && number2 > number3) {
			
			System.out.printf("%d %d %d in order", number1, number2, number3);
		
		} else {
			
			System.out.printf("%d %d %d not in order", number1, number2, number3);
		
		}
	
	}


}