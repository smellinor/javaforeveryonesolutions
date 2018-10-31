import java.util.Scanner;


/*
 * According to the Coulom force law, the electric force between two
 * charged particles of charge Q1 and Q2 Coulombs, that are a distance r meters
 * apart, is F = Q1*Q2/(4*PI*epsilon*r*r) Newtons, where epsilon = 8.854*10^(-12)
 * Farads/meter. Write a program that calculates the force on a pair of charged
 * particles, based on user input of Q1 Coulombs, Q2 Coulombs, and r meters,
 * and then computes and displays the electric force.
 *
 */

public class P2.33 { 

	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter charge of first particle: ");
		
		double q1 = in.nextDouble();
		
		System.out.print("Please enter charge of second particle: ");
		
		double q2 = in.nextDouble();
		
		System.out.print("Please enter distance (in meter) between particles: ");
		
		double r = in.nextDouble();
		
		in.close();

	
		double epsilon = 8.854*Math.pow(10., -12.);
		
		double force = (q1*q2)/(4.*Math.PI*epsilon*r*r);
		
		
		System.out.printf("The electric force is: %.4f Newton", force);
	
	}
}