import java.util.Scanner;
import java.time.LocalDate;

/**
 * Exercise 04: Check whether a year is a leap year or not.
 * @version 1.0 2021-11-26
 * @author Tri Phan
 */
public class Exercise04 
{
	private Scanner sc = new Scanner(System.in);
	
	public void doExercise04()
	{
//		Introduction
		System.out.println("\n   ***** Exercise 04 *****\n"
				+ "Check whether a year is a leap year or not.\n"
				+ "(A leap year is\n"
				+ " _ a year can be divisible by 400, or\n"
				+ " _ a year can be divisible by 44,\n"
				+ "    but it can not be divisible by 100.)");
		
		if (isLeapYear(sc))
		{
			System.out.println("is a leap year.");
		}
		else
		{
			System.out.println("is not a leap year.");
		}
	}
	
	/**
	 * Check whether a year or a leap year or not.
	 * Solution 2: Uses LocalDate class in java.time package.
	 * @param year An integer
	 * @return true indicates that year is a leap year,
	 * 	otherwise that year is not a leap year.
	 */
	private boolean isLeapYear2(int year)
	{
		LocalDate date = LocalDate.of(year, 1, 1);
		return date.isLeapYear();
	}
	
	/**
	 * Check whether a year or a leap year or not.
	 * Solution 1: A leap year is 
	 * _ a year can be divisible by 400, or
	 * _ a year can be divisible by 4, but it can not be divisible by 100. 
	 * @param year An integer
	 * @return true indicates that year is a leap year,
	 * 	otherwise that year is not a leap year.
	 */
	private boolean isLeapYear(int year)
	{
		if (year % 400 == 0)
		{
			return true;
		}
		if ((year % 4 == 0) && (year % 100 != 0))
		{
			return true;
		}
		return false;
	}
	
	/**
	 * Gets a year from the user input from the console,
	 * next whether a year or a leap year or not,
	 * then prints out result to the console.
	 * @param sc A Scanner object which used to get a year 
	 * 	from the user input from the console.
	 * @return true indicates that year is a leap year,
	 * 	otherwise that year is not a leap year.
	 */
	private boolean isLeapYear(Scanner sc)
	{
		int year = Console.getInteger(sc, "\nEnter a year: ");
		System.out.printf("\n%d ", year);
		return isLeapYear(year);
	}
}

































