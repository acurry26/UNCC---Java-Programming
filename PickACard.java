import java.util.Scanner; //Import the use of the scanner for the user.

/**
*Y/N <- user input
*
*IF(input = Y)
*	display face value and card suit
*else
*	display "No game to play. Scram man!"
*
*Switch + case for face value and card suit
*	define where Ace, Jack, Queen, King are
*
**/

public class Lab01 {
	public static void main(String[] args) {
		
		//Generate the integer between 1 and 13			
		int rank = (int)((Math.random() * (14 - 1)) + 1);
		
		//Generate a random integer between 1 and 4
		int suit = (int)(Math.random() * 4);
		
		//define the Scanner for user input
		Scanner initial = new Scanner(System.in);
		
		//define the Lab Number
		System.out.println("Lab001");
		System.out.println("Would you like to play a game? [Y/N]");
		String choice = initial.nextLine();
		
		if(choice.equals("Y")) {
		//Display what was received with Switch & case
		System.out.print("You got a.. ");
		switch(rank) //Shows the rank of the face value (1-13)
		{
			case 1: System.out.print("Ace");
				break;
			case 2: System.out.print(rank);
				break;
			case 3: System.out.print(rank);
				break;
			case 4: System.out.print(rank);
				break;
			case 5: System.out.print(rank);
				break;
			case 6: System.out.print(rank);
				break;
			case 7: System.out.print(rank);
				break;
			case 8: System.out.print(rank);
				break;
			case 9: System.out.print(rank);
				break;
			case 10: System.out.print(rank);
				break;
			case 11: System.out.print("Jack");
				break;
			case 12: System.out.print("Queen");
				break;
			case 13: System.out.print("King");
		}//end of switch(rank) - face value (1-13)
		System.out.print(" of ");
		switch(suit) //Shows the Suit Value of Card
		{
			case 0: System.out.println("Clubs.");
				break;
			case 1: System.out.println("Diamonds.");
				break;
			case 2: System.out.println("Hearts.");
				break;
			case 3: System.out.println("Spades.");
		}//end of switch(suit) - type of card class (1-4)
		}else {
			System.out.println("You decided to not play a game, oh well. See you next time!");
		}//end of IF/ELSE
	}//end main
}//end class
