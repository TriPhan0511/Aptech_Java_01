import java.util.Scanner;

/**
 * Exercise 06: Prints out quotient and remainder of a division.
 * @version 1.0 2021-11-26
 * @author Tri Phan
 */
public class Exercise06 
{
	private Scanner sc = new Scanner(System.in);
	
	public void doExercise06()
	{
//		Introduction
		System.out.println("\n   ***** Exercise 06 *****\n"
				+ "Prints out quotient and remainder of a division.\n");

//		Calls the printResultOfADivision method
//		to gets dividend and divisor, then do calculation,
//		finally prints out the result to the console.
		printResultOfADivision(sc);
	}

	/**
	 * Gets dividend and divisor, then do calculation,
	 * finally prints out the result to the console.
	 * @param sc A Scanner object which used to get data 
	 * 	from the user input from the console.
	 */
	private void printResultOfADivision(Scanner sc)
	{
		int dividend = Console.getInteger(sc, "Enter a dividend: ");
		int divisor = Console.getInteger(sc, "Enter a divisor: ");
		int quotient = dividend / divisor;
		int remainder = dividend % divisor;
		System.out.printf("\nResult obtained by dividing %d by %d: ", 
				dividend, divisor);
		System.out.printf("\nQuotient: %d", quotient);
		System.out.printf("\nRemainder: %d", remainder);
		
	}
}
