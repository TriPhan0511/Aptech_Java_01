import java.util.Arrays;

/**
 * Exercise 01: Finds largest number in an array of integers.
 */
public class Exercise01 
{
	public void doExercise01()
	{
//		Introduction
		System.out.println("\n   ***** Exercise 01 *****\n"
				+ "Finds a largest number in an array of numbers.");
		
//		Creates an array of 10 random integer in range from 1 to 100
		int[] numbers = Utilities.getRandomNumbers(10, 1, 100);
//		Print out the array to the console.
		System.out.println("\nContents of an integer array:");
		Utilities.printIntegerArray(numbers);
//		Find the largest element in the numbers array
		System.out.printf("\nThe largest element in the array: %d", 
				getLargestNumber(numbers));
//		Find the largest element in the numbers array (solution 2)
		System.out.printf("\n\nThe largest element in the array (solution 2): %d", 
				getLargestNumber2(numbers));
	}
	
	/**
	 * Exercise 01: (solution 01)
	 * Gets the largest element in an array of integers.
	 * @param numbers An array of integers.
	 * @return The largest element.
	 */
	public int getLargestNumber(int[] numbers)
	{
		int max = numbers[0];
		for (int num :  numbers)
		{
			if (num > max)
			{
				max = num;
			}
		}
		return max;
	}
	
	/**
	 * Exercise 01 : (solution 02)
	 * Gets the largest element in an array of integers.
	 * Solution 2: First, sort the array in ascending order,
	 * 	then get the last element which is the largest element in the sorted array.
	 * @param numbers An array of integers.
	 * @return The largest element.
	 */
	public int getLargestNumber2(int[] numbers)
	{
//		First, uses the sort method of the Arrays to sort the integer array
		Arrays.sort(numbers);
//		Then get the last element which is the largest element in the array.
		return numbers[numbers.length - 1];
	}
}
