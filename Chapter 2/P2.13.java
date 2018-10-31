import java.util.Scanner;

/*
 * Write a program that reads a number between 1,000 and 999,999 from the user,
 * where the user enters a comma in the input. Then print the number without a comma.
 *
 */

public class P2.13 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("Enter an integer between 1,000 and 999,999: ");
		int x = in.nextInt();
		int y = in.nextInt();
		in.close();
		
		System.out.println(x*1000+y);
	}
}