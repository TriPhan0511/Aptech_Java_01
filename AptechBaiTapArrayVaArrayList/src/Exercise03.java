import java.util.ArrayList;

/**
 * Exercise 03: 
 *  Converts from an array list of Integers to an array of ints,
 * 	and reverse, converts from an array of ints to an array list of Integers.				
 */
public class Exercise03 
{
	public void doExercise03()
	{
//		Introduction
		System.out.println("\n   ***** Exercise 03 *****\n"
				+ "Converts from an array list of Integers\n"
				+ "to an array of ints, and vice versa,\n"
				+ "converts from an array of ints to\n"
				+ "an array list of Integers.");
		
		/* Part 01: Converts from an array list of Integers to an array of ints */
//		Initialize an array list of 5 random Integers.
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < 5; i++)
		{
			list.add(Utilities.getRandomInteger(1, 10));
		}
		
//		Convert from an array list of Integers to array of ints
		int[] array = convertFromArrayListToArray(list);
		
//		Prints out the result
		System.out.println("\nPart 01: Converts from an array list of Integers\n"
				+ "to an array of ints");
		System.out.println("\nContent of original array list:");
		Utilities.printIntergerArrayList(list);
		System.out.println("\nAfter converting from an array list of Integers\n"
				+ "to an array of ints, the content of the array:");
		Utilities.printIntegerArray(array);
		
		/* Part 02: Converts from an array of ints to an array list of Integers. */
//		Initialize an array of 7 random ints.
		int[] array2 = Utilities.getRandomNumbers(7, 1, 10);
		
//		Converts from an array of ints to an array list of Integers.
		ArrayList<Integer> list2 = convertFromArrayToArrayList(array2);
		
//		Prints out the result
		System.out.println("\n------------------------------------------------------");
		System.out.println("\nPart 02: Converts from an array of ints\n"
				+ "to an array list of Integers.");
		System.out.println("\nContent of original array:");
		Utilities.printIntegerArray(array2);
		System.out.println("\nAfter converting from an array of ints\n"
				+ "to an array list of Integers, the content\n"
				+ "of the array list:");
		Utilities.printIntergerArrayList(list2);
	}
	
	/**
	 * Converts from an array list of Integers 
	 * 	to an array of ints (primitive data type).
	 * @param list An array list of Integers.
	 * @return An array of ints (primitive data type).
	 */
	public int[] convertFromArrayListToArray(ArrayList<Integer> list)
	{
		int[] array = new int[list.size()];
		for (int i = 0; i < array.length; i++)
		{
			array[i] = list.get(i);
		}
		return array;
	}
	
	/**
	 * Converts from an array of ints (primitive data type) 
	 * 	to an array list of Integers.
	 * @param array An array of ints (primitive data type).
	 * @return An array list of Integers.
	 */
	public ArrayList<Integer> convertFromArrayToArrayList(int[] array)
	{
		ArrayList<Integer> list = new ArrayList<>();
		for (int i : array)
		{
			list.add(i);
		}
		return list;
	}
}



































