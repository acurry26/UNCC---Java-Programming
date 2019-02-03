import java.util.Scanner; //Imports the scanner for user input
import java.text.DecimalFormat; //declare decimal format limiter
import java.util.Random; //imports the Random modifier

/**
*Intended as a 5 option program to allow:
*a user to easily enter the test averages and have a program calculate it.
*a user to receive a random number from a simulated Dice Roll
*a user to calculate for the area of a circle
*a user to compute distance from variables x1, x2, y1, y2 through some magical calculation process
*a user to quit out of the program and receive a holiday dismissal 
*
*opens class and main
*declare the variable for while and switch
*
*initialize the scanner for user input
*
*prompt the user to choose an option (1,2,3,4,5)
*
*Use the Switch & Case 1-5 to allow the user to choose what they want to interact with 
*each case holds the coding unique to each option
*
*declare variables, list the decimal, scanner options, add the user input and calculations
*output the result for the user
*break - allow it to stop
*
*Add Quit option and add a holiday dismissal (feliz navidad)
*
*Fix the Break...its not working.
**/

public class Option5Menu {
	public static void main(String[] args) {
		
		//declare the variables
		int choice = 0;
		
		//Declares the scanner
		Scanner initial = new Scanner(System.in);
		
		while (choice != 5) {
			
			System.out.println("Enter \"1\" for Lab Test Average Calculator, \"2\" for Dice Roll, \"3\" for Circle Area Calculator, \"4\" Compute Distance, or \"5\" for Quit + Holiday Dismissal");
			choice = initial.nextInt();
			
		switch (choice) {
			case 1:
				//Lab Test Average Calculator (L.T.A.C.) Variables
				double test1, test2, test3, testAvg;
				
				//Limits the return for decimal format
				DecimalFormat numberFormat = new DecimalFormat("#.00");
				
				//Declares the scanner
				Scanner input = new Scanner(System.in);
				
				//Declares the Lab Test Average Calculator
				System.out.print("Please enter the first Lab Test Grade: ");
				test1 = input.nextDouble();
				System.out.print("Please enter the second Lab Test Grade: ");
				test2 = input.nextDouble();
				System.out.print("Please enter the third Lab Test Grade: ");
				test3 = input.nextDouble();
				
				//Calculation area
				testAvg = (test1 + test2 + test3) / 3;
				
				System.out.print("The average of all 3 lab tests are: " + numberFormat.format(testAvg));
				System.out.println(" ");
				break; //end Case 1 - L.T.A.C.
		
			case 2:
				//Dice Roll
				Random dice = new Random();
				for (int i=0; i <= 0; i++) {
					int roll = dice.nextInt(6) + 1;
					System.out.println("Your random dice roll is: " + roll);
				}//end for statement
				System.out.println(" ");
				break; //end Case 2 - Dice Roll	
			
			case 3:
				//Circle Area Calculator
				final double pie = 3.14;
				double radius, circleArea;
				
				//Declares the scanner
				Scanner userRadius = new Scanner(System.in);
				
				System.out.println("Please enter the radius: ");
				radius = userRadius.nextDouble();
				
				circleArea = 2 * (pie * (radius * radius));
				System.out.println("The area of the circle is " + circleArea);
				System.out.println(" ");
				break; //end Case 3 - Circle Area Calculator			
			
			case 4:
				//Compute Distance
				double x1, x2, y1, y2, sqrRoot, a;
				
				//Limits the return for decimal format
				DecimalFormat circleFormat = new DecimalFormat("#.00");
				
				//Declares the scanner
				Scanner coordInput = new Scanner(System.in);
				
				System.out.println("Enter X1 and Y1: ");
				x1 = coordInput.nextDouble();
				y1 = coordInput.nextDouble();
				
				System.out.println("Enter X2 and Y2: ");
				x2 = coordInput.nextDouble();
				y2 = coordInput.nextDouble();
				
				a = Math.pow(x2 - x1,  2) + Math.pow(y2 - y1, 2);
				sqrRoot = Math.pow(a, 0.5);
				
				System.out.println("The distance between two points is: " + circleFormat.format(sqrRoot));
				System.out.println(" ");
				break; //end Case 4 - Compute Distance			
			
			case 5:
				//Quit Option
				System.out.println("You have quit the system. Feliz Navidad!");
				break; //end Case 5 - Quit Option
				
				}//end switch
			}//end while

		}//end main
}//end class