import java.util.Scanner;

/*
 * Write a program that reads the resistances of the three
 * resistors and computes the total resistance, using Ohm's law.
 *
 */

public class P2.28 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter value of R1 resistance: ");
		double r1 = in.nextDouble();
		System.out.print("Enter value of R2 resistance: ");
		double r2 = in.nextDouble();
		System.out.print("Enter value of R3 resistance: ");
		double r3 = in.nextDouble();
		in.close();

		double totalResistance = r1 + 1/(1/r2 + 1/r3);

		System.out.printf("The total resistance is: %.2f", totalResistance);
	}
}