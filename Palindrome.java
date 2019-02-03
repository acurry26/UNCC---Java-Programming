import java.util.Scanner; //Import the use of the scanner for the user.

/**
*num <- user input
*
*firstDigit <- num / 100
*num <- num % 10
*(num now represents the Last digit)
*
*if firstDigit equals num, then
*	display "This was a palindrome"
*else
*	display "This was not a palindrome"
**/

public class Lab01 {
	public static void main(String[] args) {
				
		//declare the Scanner
		Scanner user = new Scanner(System.in);
			
		System.out.println("Lab002");
		System.out.println("To determine a palindrome, please enter a number: ");
		int num = user.nextInt();
			
		//calculations are in order to break down the number
		int firstDigit = num / 100; //user input divided by 100 to bring it down to 2 digits
		num = num % 10; //user input split into 1 digit
			
		//defines for user whether the number inputed is correct or just wrong
		if(firstDigit == num) {
			System.out.println("This was a palindrome.");
		} else {
			System.out.println("This was not a palindrome.");
		}//end IF/ELSE
		
	}//end main
}//end class