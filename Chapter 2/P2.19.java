import java.util.Scanner;

/*
 * Write a program that transforms numbers into the corresponding
 * month names.
 *
 */

public class P2.19 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter an integer between 1 and 12: ");
		int monthNumber = in.nextInt();
		in.close();

		String months = "January  February March    April    May      June     July     August   SeptemberOctober  November December ";
		int start = (monthNumber-1)*9;
		int end = start + 9;
		String monthString = months.substring(start,end);
		
		System.out.println(monthString);
	}
}