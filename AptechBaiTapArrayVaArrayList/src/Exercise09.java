import java.util.Scanner;

/**
 * Exercise 09: Sorts an array in ascending order.
 */
public class Exercise09 
{
	private static Scanner sc = new Scanner(System.in);
	
	public void doExercise09()
	{
//		Introduction
		System.out.println("\n   ***** Exercise 09 *****\n"
				+ "Sorts an array in ascending order\n");
		
//		Sorts an array which is entered from the console,
//		then prints out the result.
		bubbleSort(sc);
	}
	
	/**
	 * Gets size of an integer array, 
	 * 	and its content from user input from the console.
	 * 	Next, sorts the array in ascending order.
	 *  Then, prints out the sorted array to the console.
	 * @param sc
	 */
	public void bubbleSort(Scanner sc)
	{
//		Gets an array of integers which is entered from the console.
		int[] numbers = Console.getAnArrayOfIntegers(sc);
		
//		Prints out the content of original array:
		System.out.println("\nOriginal array: ");
		Utilities.printIntegerArray(numbers);
		
//		Sorts the array in ascending order.
		bubbleSort(numbers);
		
//		Prints out the content of the array after sorting 
		System.out.println("\nAfter sorting in ascending order:");
		Utilities.printIntegerArray(numbers);
	}
	
	/**
	 * Implements the bubble sorting algorithm.
	 * @param numbers An array of integers
	 */
	public void bubbleSort(int[] numbers) 
	{
		int size = numbers.length;
		for (int i = 0; i < size - 1; i++) 
		{
			for (int j = 0; j < size - 1 -i; j++) 
			{
				if (numbers[j] > numbers[j+1]) 
				{
					int temp = numbers[j];
					numbers[j] = numbers[j+1];
					numbers[j+1] = temp;
				}
			}
		}
	}
}
