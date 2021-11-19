import java.util.*;

/** 
 * Defines some utility methods.
 * @version 1.0 2021-11-04
 * @author Tri Phan
 */
public class Utilities 
{
	public static String getString(String msg, Scanner sc)
	{
		System.out.print(msg);
		return sc.nextLine();
	}
	
	/**
	 * Gets a string from user input from console,
	 *  then parse it to an integer.
	 * @param prompt A string which is used to ask user enter a valid integer.
	 * @param sc A Scanner object which is used to get user input from console.
	 * @return An integer.
	 */
	public static int getInteger(String prompt, Scanner sc)
	{
		while (true)
		{
			System.out.print(prompt);
			String s;
			int i;
			try
			{
				s = sc.nextLine();
				i = Integer.parseInt(s);
				return i;
			}
			catch(NumberFormatException e)
			{
				System.out.println("Invalid integer. Try again.");
			}
		}
		
	}
	
	/**
	 * Gets a string from user input from console,
	 * 	then parse it to a double.
	 * @param prompt A string which is used to ask user enter a valid double.
	 * @param sc A Scanner object which is used to het user input from console.
	 * @return A double.
	 */
	public static double getDouble(String prompt, Scanner sc)
	{
		while (true)
		{
			System.out.print(prompt);
			try
			{
				String s = sc.nextLine();
				double d = Double.parseDouble(s);
				return d;
			}
			catch (NumberFormatException e)
			{
				System.out.println("Invalid double. Try again.");
			}
		}
	}
}

























