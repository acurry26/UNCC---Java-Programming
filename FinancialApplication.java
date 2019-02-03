import java.util.Scanner;
import java.text.DecimalFormat;

public class FinancialApplication {
	public static void main(String[] args) {
	
		//declare variables
		double interest = 0, balance = 0, annualInterestRate = 0;
		
		//declare the scanner
		Scanner input = new Scanner(System.in);
			
		//Request input from user
		System.out.println("Enter a balance: ");
		balance = input.nextDouble(); //captures the balance
		System.out.println("Enter an annual Interest Rate: ");
		annualInterestRate = input.nextDouble(); //captures the annual interest rate
		
		//formula for interest calculation
		interest = balance * (annualInterestRate/1200);
		
		//Limits the return for decimal format
		DecimalFormat numberFormat = new DecimalFormat("#.000");
		
		//declare lab id
		System.out.println("ID002");
		System.out.println("Your balance is: " + balance);
		System.out.println("Your annual interest rate is: " + annualInterestRate);
		System.out.println("Your interest is " + numberFormat.format(interest) + "%.");
		
	}//end main
}//end class