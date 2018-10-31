import java.util.Scanner;


/* 
 * Write a program that converts a positive integer into
 * the Roman number system. Only numbers up to 3999 are represented.
 * 
 */

public class P3.26 {

	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter an integer between 1 and 3999: ");
		
		int regularInt = in.nextInt();
		
		in.close();
		
		
		String romanInt = "";
		
		
		int ones = regularInt%10;
		
		int tens = (regularInt%100)/10;
		
		int hundreds = (regularInt%1000)/100;
		
		int thousands = (regularInt%10000)/1000;
		
		
		switch(thousands) {
		
			case 1:
			
				romanInt = romanInt + "M";
			
				break;
		
			case 2:
			
				romanInt = romanInt + "MM";
			
				break;
		
			case 3:
			
				romanInt = romanInt + "MMM";
			
				break;
		
			default:
	
				break;	
		} 
	
	
		
		switch(hundreds) {
		
			case 1:
			
				romanInt = romanInt + "C";
			
				break;
		
			case 2:
			
				romanInt = romanInt + "CC";
			
				break;
		
			case 3: 
			
				romanInt = romanInt + "CCC";
			
				break;
		
			case 4:
			
				romanInt = romanInt + "CD";
			
				break;
		
			case 5:
			
				romanInt = romanInt + "D";
			
				break;
		
			case 6:
			
				romanInt = romanInt + "DC";
			
				break;
		
			case 7:
			
				romanInt = romanInt + "DCC";
			
				break;
		
			case 8:
			
				romanInt = romanInt + "DCCC";
			
				break;
		
			case 9:
			
				romanInt = romanInt + "CM";
			
				break;
		
		}

		 
		
		switch(tens) {
		
			case 1:
			
				romanInt = romanInt + "X";
			
				break;
		
			case 2:
			
				romanInt = romanInt + "XX";
			
				break;
		
			case 3:
			
				romanInt = romanInt + "XXX";
			
				break;
		
			case 4:
			
				romanInt = romanInt + "XL";
			
				break;
		
			case 5:
			
				romanInt = romanInt + "L";			
			
				break;
		
			case 6:
			
				romanInt = romanInt + "LX";
			
				break;
		
			case 7:
			
				romanInt = romanInt + "LXX";
			
				break;
		
			case 8:
			
				romanInt = romanInt + "LXXX";
			
				break;
		
			case 9:
			
				romanInt = romanInt + "XC";
			
				break;
		
		}
		
		
		switch(ones) {
		
			case 1:
			
				romanInt = romanInt + "I";
			
				break;
		
			case 2:
			
				romanInt = romanInt + "II";
			
				break;
		
			case 3:
			
				romanInt = romanInt + "III";
			
				break;
		
			case 4:
			
				romanInt = romanInt + "IV";
			
				break;
		
			case 5:
			
				romanInt = romanInt + "V";
			
				break;
		
			case 6:
			
				romanInt = romanInt + "VI";		
			
				break;
		
			case 7:
			
				romanInt = romanInt + "VII";
			
				break;
		
			case 8:
			
				romanInt = romanInt + "VIII";
			
				break;
		
			case 9:
			
				romanInt = romanInt + "IX";
			
				break;
		
		} 
		
		
		System.out.print(romanInt);
		
	
	}


}