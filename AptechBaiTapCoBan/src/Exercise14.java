import java.util.Scanner;

/**
 * Exercise 14: Prints out the first prime numbers.
 * @version 1.0 2021-11-26
 * @author Tri Phan
 */
public class Exercise14 
{
	private Scanner sc = new Scanner(System.in);
	
	public void doExercise14()
	{
//		Introduction
		System.out.println("\n   ***** Exercise 14 *****\n"
				+ "Prints out the first prime numbers.\n");

//		Call the printPrimeNumbers method
		printPrimeNumbers(sc);
	}
	
	/**
	 * Asks the user how many first prime numbers he/she want to print out,
	 * then prints the prime numbers he/she want.
	 * @param sc
	 */
	private void printPrimeNumbers(Scanner sc)
	{
		int n = Console.getInteger(sc, "How many first prime numbers\n"
				+ "do you want do printed out? ");
		int[] primes = new int[n];
		int count = 0;
		int i = 2;
		while (count < primes.length)
		{
			if (isPrime(i))
			{
				primes[count] = i;
				count++;
			}
			i++;
		}
		
		System.out.printf("\nThe first %d prime numbers are:\n", primes.length);
		printNumbers(primes);
		
	}
	
	/**
	 * Prints out an array of integers
	 * @param numbers An array of integers.
	 */
	private void printNumbers(int[] numbers)
	{
		for (int i = 0; i < numbers.length; i++)
		{
			System.out.printf("%d ", numbers[i]);
			if ((i + 1) % 5 == 0)
			{
				System.out.println();
			}
		}
	}
	
	/**
	 * Checks whether a number is a prime number or not.
	 * @param number An integer
	 * @return true indicates that number is a prime number,
	 * 	otherwise, returns false.
	 */
	private boolean isPrime(int number)
	{
		if (number <= 1)
		{
			return false;
		}
		for (int i = 2; i < number; i++)
		{
			if (number % i == 0)
			{
				return false;
			}
		}
		return true;
	}
}
