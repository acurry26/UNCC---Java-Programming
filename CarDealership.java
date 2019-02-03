import java.util.Scanner; //Allows input from user
import java.text.DecimalFormat; //Limits the decimal 

public class CarDealership {
	public static void main(String[] args) {
	
		//declare variables
		double cost, salesTax, afterTax, discount, commissionResult, finalCost;
		String model;
		
		//declare the scanner
		Scanner input = new Scanner(System.in);
		
		//Limits the return for decimal format
		DecimalFormat numberFormat = new DecimalFormat("#.00");
			
		//Request input from user
		System.out.println("Enter a car model: ");
		model = input.nextLine(); //captures the car model
		System.out.println("Enter car Initial Cost: ");
		cost = input.nextDouble(); //captures the initial cost of car
		
		//formula for sales tax, discount and commission
		salesTax = cost * 0.036;
		afterTax = cost + salesTax;
		
		discount = afterTax * .15;
		finalCost = afterTax - discount;
		
		final double commission = 0.10;
		commissionResult = finalCost * commission;

		//declare lab id and output the final ammounts from the calculation area
		System.out.println("ID003");
		System.out.println("Your car model is: " + model);
		System.out.println("The initial cost is: $" + cost);
		System.out.println("The sales tax is $" + numberFormat.format(salesTax));
		System.out.println("The discount is $" + numberFormat.format(discount));
		System.out.println("The Final Price is $" + numberFormat.format(finalCost));
		System.out.println("Your commission is $" + numberFormat.format(commissionResult));
	} //end main
} //end class