import java.util.Scanner;

/*
 * Write a program that reads a number and displays the square,
 * cube and fourth power. Use the Math.pow method only for the fourth power.
 */
public class P2.3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int x = in.nextInt();
		in.close();
		
		System.out.println("Square: " + x*x);
		System.out.println("Cube: " + x*x*x);
		System.out.println("Fourth power: " + Math.pow(x,4));
		
	}
}
