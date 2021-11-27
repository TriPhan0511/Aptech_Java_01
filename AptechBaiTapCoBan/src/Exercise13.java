import java.util.Scanner;

/**
 * Exercise 13: Checks whether a number is a prime number or not.
 * @version 1.0 2021-11-26
 * @author Tri Phan
 */
public class Exercise13 
{
	private Scanner sc = new Scanner(System.in);
	
	public void doExercise13()
	{
//		Introduction
		System.out.println("\n   ***** Exercise 13 *****\n"
				+ "Checks whether a number is a prime number or not.\n");

//		Call the isPrime method to gets a number 
//		from the user input from the console,
//		next check whether that number is a 
//		prime number or not.
//		Finally, prints out the result.
		if (isPrime(sc))
		{
			System.out.println("is a prime number.");
		}
		else
		{
			System.out.println("is not a prime number.");
		}
	}
	
	/**
	 * Gets a number from the user input from the console,
	 * then checks whether a number is a prime number or not.
	 * @param number An integer
	 * @param sc A Scanner object which used to get a number
	 * 	from the user input from the console.
	 * @return true indicates that number is a prime number,
	 * 	otherwise, returns false.
	 */
	private boolean isPrime(Scanner sc)
	{
		int number = Console.getInteger(sc, "Enter a integer: ");
		System.out.printf("%d ", number);
		return isPrime(number);
	}
	
	/**
	 * Checks whether a number is a prime number or not.
	 * @param number An integer
	 * @return true indicates that number is a prime number,
	 * 	otherwise, returns false.
	 */
	private boolean isPrime(int number)
	{
		if (number <= 1)
		{
			return false;
		}
		for (int i = 2; i < number; i++)
		{
			if (number % i == 0)
			{
				return false;
			}
		}
		return true;
	}
}












































