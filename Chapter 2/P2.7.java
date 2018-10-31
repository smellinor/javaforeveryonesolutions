import java.util.Scanner;

/*
 * Write a program that prompts the user for a radius and then prints
 * the area and circumference of a circle with that radius, the volume
 * and surface area of a sphere with that radius.
 *
 */

public class P2.7{

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a radius: ");
		double rad = in.nextDouble();
		in.close();
		
		double area = Math.PI*rad*rad;
		double circumference = 2.*Math.PI*rad;
		System.out.println();
		System.out.printf("Area: %.2f , circumference: %.2f", area, circumference 

		double volume = (4./3.)*Math.PI*rad*rad*rad;
		double surfacearea = 4.*Math.PI*rad*rad;
		System.out.println();
		System.out.printf("Volume: %.2f , surface area: %.2f", volume, surfacearea);		
	}
}
