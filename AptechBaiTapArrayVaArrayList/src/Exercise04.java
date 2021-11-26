
/**
 * Exercise 04: Sorting content of integer array in 
 * 	ascending order and descending order.
 */
public class Exercise04 
{
	public void doExercise04()
	{
//		Introduction
		System.out.println("\n   ***** Exercise 04 *****\n"
				+ "Sorts an array in ascending order\n"
				+ "and in descending order.");
		
//		Initialize an array of 10 random integers.
		int[] numbers = Utilities.getRandomNumbers(10, 1, 100);
//		Prints out the content of the array
		System.out.println("\nBefore sorting:");
		Utilities.printIntegerArray(numbers);
//		Sorts array's content in ascending order
//		sort(numbers, true);
		System.out.println("\nAfter sorting in ascending order:");
		Utilities.printIntegerArray(numbers);
//		Sorts array's content in descending order
		sort(numbers, false);
		System.out.println("\nAfter sorting in descending order:");
		Utilities.printIntegerArray(numbers);
	}
	
	/**
	 * Implements the selection sort algorithm.
	 * Sorts content of an integer array in ascending order,
	 * 	or in descending order.
	 * @param numbers An array of integers.
	 * @param isAcs if true, indicates that sort the array's content in ascending order.
	 * 				if false, indicates that sort the array's content in descending order.
	 */
	public void sort(int[] numbers, boolean isAcs)
	{
		int size = numbers.length;
		for (int i = 0; i < size - 1; i++) 
		{
			int m_index = i;
			if (isAcs) // Sorting in ascending order
			{
//				Finds the index of the minimum element in unsorted array.
				for (int j = i + 1; j < size; j++) 
				{
					if (numbers[j] < numbers[m_index]) 
					{
						m_index = j;
					}
				}
			}
			else // Sorting in descending order
			{
//				Finds the index of the maximum element in unsorted array.
				for (int j = i + 1; j < size; j++) 
				{
					if (numbers[j] > numbers[m_index]) 
					{
						m_index = j;
					}
				}
			}
//			Swaps two numbers if the ith number is not the minimum element
//			(or maximum element in case of sorting in descending ordrer). 
			if (m_index != i) 
			{
				int temp =  numbers[i];
				numbers[i] = numbers[m_index];
				numbers[m_index] = temp;
			}
		}
	}
}































