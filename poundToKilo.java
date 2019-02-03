import java.util.Scanner;
 
public class poundToKilo {
   public static void main(String args[]) {
	  
		  System.out.println("ID001"); //Lab ID.
		  
			//declare the variables
		    double pound, totalResult; //declares width, length, area, perimeter variables
		    
			//declare the scanner
			Scanner input = new Scanner(System.in);
			
		    //Request input from user
		    System.out.println("Enter a number in pounds: ");
		    pound = input.nextDouble();
		    
			final double kilogram = 0.454;
			totalResult = kilogram * pound;
			
		    System.out.println("You stated you have " + pound + " pounds."); //Shows the user what they inputted
			System.out.println(pound + " pounds is equal to " + totalResult + " kilograms."); //displays the final output
	}//end main
}//end class