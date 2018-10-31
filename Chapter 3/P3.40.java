import java.util.Scanner;


/*
 * The electric circuit shown is designed to measure the temperature of the 
 * gas in a chamber. The resistor R represents a temperature sensor enclosed 
 * in the chamber. The resistance R, in omega, is related to the temperature T, 
 * in °C, by the equation R = R_0 + kT. In this device, assume R0 = 100 1 
 * and k = 0.5. The voltmeter displays the value of the voltage, Vm , across the 
 * sensor. This voltage Vm indicates the temperature, T, of the gas according to 
 * the equation T = R/k - R0/k = (R_s/k)*(V_m/(V_s-V_m)-R_0/k. Suppose the 
 * voltmeter voltage is constrained to the range Vmin = 12 volts <= Vm <= Vmax = 18 volts. 
 * Write a program that accepts a value of Vm and checks that it’s between 12 
 * and 18. The program should return the gas temperature in degrees Celsius when 
 * Vm is between 12 and 18 and an error message when it isn’t.
 * 
 */

public class P3.40 {

	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a value of Volt: ");
		
		double V_m = in.nextDouble();
		
		in.close();

		
		
		final double R_0 = 100.;
		
		final double k = 0.5;
				
		
		final double V_MIN = 12.;
		
		final double V_MAX = 18.;
		
		
		final double R_s = 75.;
		
		final double V_s = 20.;
		
		
		
		double T = (R_s/k)*(V_m/(V_s - V_m)) - R_0/k;
	
	
		
		if(V_MIN <= V_m && V_m <= V_MAX) {
			
			System.out.println(T + " degrees Celsius");
		
		} else {
			
			System.out.println("Volt is too large or too small");
		
		}
		
	
	}


}
