import java.util.Scanner;


/*
 * Write a unit conversion program that asks the users from which
 * unit they want to convert and to which unit they want to convert.
 * Reject invalid units. Ask for the value to be converted and display the result.
 * 
 */

public class P3.24 {

	
	public static void main(String[] args) {
		
	Scanner in = new Scanner(System.in);
		
	System.out.print("Convert from (ml, l, g, kg, mm, cm , m): ");
		
	String from = in.nextLine();
		
	System.out.print("Convert to (fl. oz, gal, oz, lb, in, ft): ");
		
	String to = in.nextLine();
		
	System.out.print("Value: ");
		
	double valueBefore = in.nextDouble();
		
	in.close();

	
	
	final double mlToFloz = 0.0338140226;
		
	final double lToFloz = mlToFloz*1000.;
		
	final double mlToGal = 0.00026417205124156;
		
	final double lToGal = mlToGal*1000.;

		
	final double gToOz = 0.03968253968253968;
		
	final double kgToOz = gToOz*1000.;
		
	final double gToLb = 0.0022046226218488;
		
	final double kgToLb = gToLb*1000.;

		
	final double cmToIn = 0.39370078740157477;
		
	final double mToIn = cmToIn*100.;
		
	final double mmToIn = cmToIn/10.;
		
	final double cmToFt = 0.03280839895013123;
		
	final double mToFt = cmToFt*100.;
		
	final double mmToFt = cmToFt/10.;


		
	switch(from) {
		
		case "ml":
			
		if(to.equalsIgnoreCase("fl. oz")) {
				
			System.out.println(valueBefore*mlToFloz);
			
		} else if (to.equalsIgnoreCase("gal")) {
				
			System.out.println(valueBefore*mlToGal);
			
		} else {
				
			System.out.println("Cannot convert from " + from + " to " + to);
			
		}
			
		break;
		
		case "l":
			
		if(to.equalsIgnoreCase("fl. oz")) {
				
			System.out.println(valueBefore*lToFloz);
			
		} else if (to.equalsIgnoreCase("gal")) {
				
			System.out.println(valueBefore*lToGal);
			
		} else {
				
			System.out.println("Cannot convert from " + from + " to " + to);
			
		}
			
		break;
		
		case "g":
			
			if(to.equalsIgnoreCase("oz")) {
				
				System.out.println(valueBefore*gToOz);
			
			} else if (to.equalsIgnoreCase("lb")) {
				
				System.out.println(valueBefore*gToLb);
			
			} else {
				
				System.out.println("Cannot convert from " + from + " to " + to);
			
		}

			
		break;
		
		case "kg":
			
			if(to.equalsIgnoreCase("oz")) {
				
				System.out.println(valueBefore*kgToOz);
			
			} else if (to.equalsIgnoreCase("lb")) {
				
				System.out.println(valueBefore*kgToLb);
			
			} else {
				
				System.out.println("Cannot convert from " + from + " to " + to);
			
			}
			
		break;
		
		case "mm":
			
			if(to.equalsIgnoreCase("in")) {
				
				System.out.println(valueBefore*mmToIn);
			
			} else if (to.equalsIgnoreCase("ft")) {
				
				System.out.println(valueBefore*mmToFt);
			
			} else {
				
				System.out.println("Cannot convert from " + from + " to " + to);
					
			}
			
		break;
		
		case "cm":
			
			if(to.equalsIgnoreCase("in")) {
				
				System.out.println(valueBefore*cmToIn);
			
			} else if (to.equalsIgnoreCase("ft")) {
				
				System.out.println(valueBefore*cmToFt);
			
			} else {
				
				System.out.println("Cannot convert from " + from + " to " + to);
			
			}
			
		break;
		
		case "m":
			
			if(to.equalsIgnoreCase("in")) {
				
				System.out.println(valueBefore*mToIn);
			
			} else if (to.equalsIgnoreCase("ft")) {
				
				System.out.println(valueBefore*mToFt);
			
			} else {
				
				System.out.println("Cannot convert from " + from + " to " + to);
			
			}
			
		break;
		
		default: 
			
			System.out.println("Invalid unit");
		
		}

	
	}

}
