import java.util.Scanner;

/**
 * Exercise 02: Capitalizes first letter of a string.
 * @version 1.0 2021-11-24
 * @author Tri Phan
 */
public class Exercise02 
{
	private static Scanner sc = new Scanner(System.in);
	
	public void doExercise02()
	{
//		Introduction
		System.out.println("\n   ***** Exercise 02 *****\n"
				+ "Capitalizes first letter of a string.\n");
		
		System.out.println("\nResult:\n" + capitalizeFirstLetter(sc));
	}
	
	/**
	 * Capitalizes first letter of a string.
	 * @param s A string
	 * @return A new string which has first capitalized letter.
	 */
	private String capitalizeFirstLetter(String s)
	{
		String firstLetter = s.substring(0, 1).toUpperCase();
		return firstLetter + s.substring(1);
	}
	
	/**
	 * Gets a string from the user from the console,
	 * then capitalizes first letter of a string.
	 * @param sc A Scanner object which used to get string from the console.
	 * @return A new string which has first capitalized letter.
	 */
	private String capitalizeFirstLetter(Scanner sc)
	{
		String s = Console.getString(sc, "Enter a string: ");
		return capitalizeFirstLetter(s);
	}
}
