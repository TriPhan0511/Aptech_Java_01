import java.util.Scanner;

/**
 * Exercise 07: Calculates sum of all of values in an array of integers.
 */
public class Exercise07 
{
	private Scanner sc = new Scanner(System.in);
	public void doExercise07()
	{
//		Introduction
		System.out.println("\n   ***** Exercise 07 *****\n"
				+ "Calculates sum of all of values\n"
				+ "in an array of integers.\n");
		System.out.printf("\nSum of values in the array: %d", getSum(sc));
	}
	
	/**
	 * Gets size of an integer array, 
	 * 	and its contents from user input from the console.
	 * 	Next, calculate sum of the contents.
	 *  Then, returns the sum.
	 * @param sc A Scanner object which is uses to get user input from the console.
	 * @return An integer.
	 */
	public int getSum(Scanner sc)
	{
		int[] numbers = Console.getAnArrayOfIntegers(sc);
		return getSum(numbers);
	}
	
	/**
	 * Calculates sum of all of values in an array of integers.
	 * @param numbers An array of integers.
	 * @return A integer.
	 */
	public int getSum(int[] numbers)
	{
		int output = 0;
		for (int num : numbers)
		{
			output += num;
		}
		return output;
	}
}
