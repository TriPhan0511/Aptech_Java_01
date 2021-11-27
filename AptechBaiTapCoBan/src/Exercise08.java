import java.util.Scanner;

/**
 * Exercise 08: Swaps two numbers.
 * @version 1.0 2021-11-26
 * @author Tri Phan
 */
public class Exercise08 
{
	private Scanner sc = new Scanner(System.in);
	
	public void doExercise08()
	{
//		Introduction
		System.out.println("\n   ***** Exercise 08 *****\n"
				+ "Swaps two numbers.\n"
				+ "(Solution 1: Uses a temporary variable.\n"
				+ "Solution 2: Does not use a temporary variable.)\n");

		int firstNumber = Console.getInteger(sc, "Enter a number: ");
		int secondNumber = Console.getInteger(sc, "Enter another number: ");
//		Solution 1:
		swap(firstNumber, secondNumber); 
//		Solution 2:
		swap2(firstNumber, secondNumber);
	}
	
	/**
	 * Swaps two numbers.
	 * Solution 1: Uses a temporary variable.
	 * @param firstNumber 
	 * @param secondNumber
	 */
	private void swap(int firstNumber, int secondNumber)
	{
		System.out.println("\nSolution 1: Uses a temporary variable.");
		System.out.println("\nBefore swapping:");
		System.out.printf("First number = %d", firstNumber);
		System.out.printf("\nSecond number = %d", secondNumber);
		
//		Swaps two numbers
		int temp = firstNumber;
		firstNumber = secondNumber;
		secondNumber = temp;
		
		System.out.println("\n\nAfter swapping:");
		System.out.printf("First number = %d", firstNumber);
		System.out.printf("\nSecond number = %d", secondNumber);
	}
	
	/**
	 * Swaps two numbers.
	 * Solution 2: Does not use a temporary variable.
	 * @param firstNumber 
	 * @param secondNumber
	 */
	private void swap2(int firstNumber, int secondNumber)
	{
		System.out.println("\n\nSolution 2: Does not use a temporary variable.");
		System.out.println("\nBefore swapping:");
		System.out.printf("First number = %d", firstNumber);
		System.out.printf("\nSecond number = %d", secondNumber);
		
//		Swaps two numbers
		firstNumber = firstNumber + secondNumber;
		secondNumber = firstNumber - secondNumber;
		firstNumber = firstNumber - secondNumber;
		
		System.out.println("\n\nAfter swapping:");
		System.out.printf("First number = %d", firstNumber);
		System.out.printf("\nSecond number = %d", secondNumber);
	}
}

























