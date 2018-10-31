import java.util.Scanner;

/*
 * Write a program that prompts the user for two integers
 * and then prints, the sum, the difference, the product, the average
 * the distance, the maximum, the minimum. Enhanced according to P2.5.
 * 
 */

public class P2.4and2.5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int x = in.nextInt();
		System.out.print("Enter another integer: ");
		int y = in.nextInt();
		in.close();
		
		int sum = x+y;
		int diff = x-y;
		int prod = x*y;
		double average = (x+y)/2.;
		int abs = Math.abs(diff);
		int max = Math.max(x,y);
		int min = Math.min(x, y);
		
		System.out.printf("%nSum:%12d%n", sum);
		System.out.printf("Difference:%5d%n" , diff);
		System.out.printf("Product:%8d%n" , prod);
		System.out.printf("Average:%10.1f%n" , average);
		System.out.printf("Distance:%7d%n" , abs);
		System.out.printf("Maximum:%8d%n" , max);
		System.out.printf("Minimum:%8d%n" , min);
	}
}