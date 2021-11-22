import java.util.Scanner;

/**
 * Exercise 08: Reverse order of elements in an array of integers.
 */
public class Exercise08 
{
	private Scanner sc = new Scanner(System.in);
	public void doExercise08()
	{
//		Introduction
		System.out.println("\n   ***** Exercise 08 *****\n"
				+ "Reverse order of elements in an array of integers.\n");
		
//		Reverse the content of the array
//		and prints out the result.
		reverseOrderOfElements(sc);
	}
	
	/**
	 * Gets size of an integer array, 
	 * 	and its contents from user input from the console.
	 * 	Next, calculate sum of the contents.
	 *  Then, returns the sum.
	 * @param sc A Scanner object which is uses to get user input from the console.
	 * @return An integer.
	 */

	/**
	 * Gets size of an integer array, 
	 * 	and its contents from user input from the console.
	 *  Next, prints out the contents of the array to the console. 
	 *  Then, reverses the order of elements in the array.
	 *  Finally, prints out the contents which just reversed.
	 * @param sc A Scanner object which used to get user input from the console.
	 */
	public void reverseOrderOfElements(Scanner sc)
	{
//		Gets user input from the console and 
//		creates an array of integers.
		int[] numbers = Console.getAnArrayOfIntegers(sc);
		
//		Prints out the contents of the array which just entered.
		System.out.println("\nOriginal array:");
		Utilities.printIntegerArray(numbers);
		
//		Reverse the order of the array
		reverseOrderOfElements(numbers);
		
//		Prints out the contents of the array which just reversed
		System.out.println("\nAfter reversing:");
		Utilities.printIntegerArray(numbers);
	}
	
	/**
	 * Reverse order of elements in an array of integers.
	 * @param numbers An array of integers.
	 * @return Another array of integers.
	 */
	public void reverseOrderOfElements(int[] numbers)
	{
//		Copies elements in the original array to a temporary array 
//		in the bottom-to-top direction.
		int[] tempArray = new int[numbers.length];
		int tempArrayIndex = 0;
		for (int i = numbers.length - 1; i >= 0; i--)
		{
			tempArray[tempArrayIndex] = numbers[i];
			tempArrayIndex++;
		}
		
//		Then, reassigns values of elements in the original array.
		for (int i = 0; i < numbers.length; i++)
		{
			numbers[i] = tempArray[i];
		}
	}
}


























