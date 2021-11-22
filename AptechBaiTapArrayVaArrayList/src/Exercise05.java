import java.util.Scanner;

/**
 * Exercise 05: Enters size of an integer array, that array's elements' values,
 * 				and a value which you want to check whether it is contained in the array 
 * 				or not.
 */
public class Exercise05 
{
	private static Scanner sc = new Scanner(System.in);
	public void doExercise05()
	{
//		Introduction
		System.out.println("\n   ***** Exercise 05 *****\n"
				+ "Checks whether a number is contained in\n"
				+ "an array of integers or not.\n");
		
//		Gets size of an array of integers, 
//		and its values from user input from the console.
//		Then, asks user which number he/she want to search.
//		Finally, prints out the result of searching.
		int[] numbers = Console.getAnArrayOfIntegers(sc);
		while (true)
		{
			int number = Console.getInteger(sc, "\nEnter a number which you want to search: ");
			if (isContained(numbers, number))
			{
				System.out.println("Found it!");
			}
			else
			{
				System.out.println("Not found.");
			}
			if (!Console.askForKeepDoing(sc, "Another searching?"))
			{
				break;
			}
		}
	}
	
	/**
	 * Checks whether a number is contained in an array of integers or not.
	 * @param numbers An array of integer.
	 * @param number A integer need to be checked.
	 * @return true indicates the number is contained in the array,
	 * 			otherwise, returns false. 
	 */
	public boolean isContained(int[] numbers, int number)
	{
		for (int i : numbers)
		{
			if (i == number)
			{
				return true;
			}
		}
		return false;
	}
}
