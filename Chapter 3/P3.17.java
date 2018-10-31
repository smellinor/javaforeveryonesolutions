import java.util.Scanner;


/*
 * When two points in time are compared, each given as hours
 * (in military time) and minutes, the following pseudocode (in book)
 * determines which comes first. Write a program that prompts the
 * user for two points in time and prints the time that comes first,
 * then the other time.
 * 
 */

public class P3.17 {

	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter two times: ");
		
		int firstTime = in.nextInt();
		
		int secondTime = in.nextInt();
		
		in.close();
	
	
		
		int firstHour = firstTime/100;
		
		int secondHour = secondTime/100;
		
		int firstMinute = firstTime%100;
		
		int secondMinute = secondTime%100;

		
		
		if(firstHour < secondHour) {
			
			System.out.println(firstTime + " " + secondTime);
		
		} else if(firstHour == secondHour) {
			
			if (firstMinute < secondMinute) {
				
				System.out.println(firstTime + " " + secondTime);
			
			} else if (firstMinute == secondMinute) {
				
				System.out.println("The times are the same.");
			
			} else {
				
				System.out.println(secondTime + " " + firstTime);
			
			}
		
		} else {
			
			System.out.println(secondTime + " " + firstTime);
		
		}
		
		
	
	}


}