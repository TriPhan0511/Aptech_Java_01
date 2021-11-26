import java.util.Scanner;

/**
 * Exercise 02: Check whether a number is even or odd.
 * @version 1.0 2021-11-26
 * @author Tri Phan
 */
public class Exercise02 
{
	private Scanner sc = new Scanner(System.in);
	
	public void doExercise02()
	{
//		Introduction
		System.out.println("\n   ***** Exercise 02 *****\n"
				+ "Check whether a number is even or odd.\n");
		
//		Gets a number from user input from the console,
//		next check whether it is an odd number or an even number,
//		then, display result to the console.
		if (isOdd(sc))
		{
			System.out.println("is an odd number.");
		}
		else
		{
			System.out.println("is an even number.");
		}
	}
	
	/**
	 * Check whether a number is even or odd.
	 * @param number An integer.
	 * @return true indicates that number is an even number,
	 * 	otherwise, that number is an odd number. 
	 */
	private boolean isOdd(int number)
	{
		if (number % 2 != 0) 
		{
			return true;
		}
		return false;
	}
	
	/**
	 * Gets a number from the user input from the console,
	 * then check whether that number is even or odd.
	 * @param number An integer.
	 * @return true indicates that number is an even number,
	 * 	otherwise, that number is an odd number. 
	 */
	private boolean isOdd(Scanner sc)
	{
		int number = Console.getInteger(sc, "Enter a number: ");
		System.out.printf("\n%d ", number);
		return isOdd(number);
	}
}
