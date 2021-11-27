import java.util.Scanner;

/**
 * Exercise 07: Calculates average of the range from 1 to n (n is enter from the keyboard).
 * @version 1.0 2021-11-26
 * @author Tri Phan
 */
public class Exercise07 
{
	private Scanner sc = new Scanner(System.in);
	
	public void doExercise07()
	{
//		Introduction
		System.out.println("\n   ***** Exercise 07 *****\n"
				+ "Calculates average of the range from 1 to n\n"
				+ "(n is enter from the keyboard).\n"
				+ "If n = 10 then average = (1+2+3+4+5+6+7+8+9+10) / 10\n");

		System.out.printf("\nAverage: %.1f", calcAverage(sc));
	}
	
	/**
	 * Gets an integer from the user,
	 * then calculates average of the range from 1 to that integer.
	 * @param sc A Scanner object which used to get data 
	 * from the user from the console.
	 * @return A double represents the average of 
	 * 	the range from 1 to n.
	 */
	private double calcAverage(Scanner sc)
	{
		int n;
		while (true)
		{
			n = Console.getInteger(sc, "Enter n: ");
			if (n < 1)
			{
				System.out.println("You should enter an integer is\n"
						+ "greater than or equal to 1.");
				continue;
			}
			return calcAverage(n);
		}
	}
	
	/**
	 * Calculates average of the range from 1 to n.
	 * @param n An integer which entered by the user.
	 * @return A double represents the average of 
	 * 	the range from 1 to n.
	 */
	private double calcAverage(int n)
	{
		double sum = 0.0;
		for (int i = 1; i <= n; i++)
		{
			sum += i;
		}
		return sum / n;
	}
}
