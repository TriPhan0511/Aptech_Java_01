import java.util.Scanner;

/**
 * Exercise 01: Sums of two numbers.
 * @version 1.0 2021-11-26
 * @author Tri Phan
 */
public class Exercise01 
{
	private Scanner sc = new Scanner(System.in);
	
	public void doExercise01()
	{
//		Introduction
		System.out.println("\n   ***** Exercise 01 *****\n"
				+ "Sums of two numbers.\n");
		
		System.out.printf("%.1f", sumOfTwoNumbers(sc));
	}
	
	/**
	 * Sums of two numbers
	 * @param firstNumber
	 * @param secondNumber
	 * @return A sum of two numbers.
	 */
	private double sumOfTwoNumbers(double firstNumber, double secondNumber)
	{
		return firstNumber + secondNumber;
	}
	
	/**
	 * Gets two numbers from the user input from the console,
	 * then sums of that two numbers.
	 * @param sc An Scanner object which used to get data from the console.
	 * @return A sum of two numbers.
	 */
	private double sumOfTwoNumbers(Scanner sc)
	{
		double firstNumber = Console.getDouble(sc, "Enter first number: ");
		double secondNumber = Console.getDouble(sc, "Enter second number: ");
		System.out.printf("\n%.1f + %.1f = ",
				firstNumber, secondNumber);
		return sumOfTwoNumbers(firstNumber, secondNumber);
	}
}






































