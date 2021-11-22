
public class Exercise02 
{
	/**
	 * Exercise 02: Concatenate two integer arrays.
	 */
	public void doExercise02()
	{
//		Introduction
		System.out.println("\n   ***** Exercise 02 *****\n"
				+ "Concatenates two integer arrays.");
		
//		Initializes an array which contains 3 elements of random numbers.
		int[] numbers1 = Utilities.getRandomNumbers(3, 1, 10);
//		Initializes another array which contains 4 elements of random numbers.
		int[] numbers2 = Utilities.getRandomNumbers(4, 1, 10);
//		Concatenates those two arrays.
		int[] output = concatTwoIntegerArrays(numbers1, numbers2);
		
//		Prints out the result to the console.
		System.out.println("\nFirst Array:");
		Utilities.printIntegerArray(numbers1);
		System.out.println("\nSecond Array:");
		Utilities.printIntegerArray(numbers2);
		System.out.println("\nAfter concatenation:");
		Utilities.printIntegerArray(output);
	}
	
	/**
	 * Concatenates two integer arrays. 
	 * @param firstArray First array of integers.
	 * @param secondArray Second array of integers.
	 * @return An integer array which contains those two arrays' elements.
	 */
	public int[] concatTwoIntegerArrays(int[] firstArray, int[] secondArray)
	{
		int size1 = firstArray.length;
		int size2 = secondArray.length;
		int size3 = size1 + size2;
		int[] output = new int[size3];
		int index = 0;
		int index2 = 0;
		
//		First, assigns values of elements in the first array to the "output" array,
//		begin at the first index of the "output" array.
		while (index < size1)
		{
			output[index] = firstArray[index];
			index++;
		}
		
//		Next, assigns values of elements in the second array to the "output" array,
//		begin at the size1th index of the "output" array.
		while (index2 < size2)
		{
			output[index] = secondArray[index2];
			index++;
			index2++;
		}
		return output;
	}
}
