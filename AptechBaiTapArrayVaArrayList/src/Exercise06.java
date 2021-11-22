import java.util.Scanner;

/**
 * Exercise 06: Calculates average of values in array of integers.
 */
public class Exercise06 
{
	private Scanner sc = new Scanner(System.in);
	public void doExercise06()
	{
//		Introduction
		System.out.println("\n   ***** Exercise 06 *****\n"
				+ "Calculates average of values\n"
				+ "in array of integers.\n");
		
//		Do calculation and prints out the result
		System.out.printf("\nAverage: %.2f", calcAverage(sc));
	}
	
	/**
	 * Gets size of an array of integers, its values from user input 
	 * 	from console. Next, calculate average of that values. Then,
	 * 	returns the average.
	 * @param sc A Scanner object which used to get data from the console.
	 * @return A double.
	 */
	public double calcAverage(Scanner sc)
	{
		int[] numbers = Console.getAnArrayOfIntegers(sc);
		return calcAverage(numbers);
	}
	
	/**
	 * Calculates average of values in array of integers.
	 * @param numbers An array of integers.
	 * @return A double.
	 */
	public double calcAverage(int[] numbers)
	{
		int count = 0;
		int sum = 0;
		for (int num : numbers)
		{
			sum += num;
			count++;
		}
		return (double) sum / count;
	}
}
