import java.util.Scanner;

/**
 * Exercise 01: Removes all of white spaces in a string.
 * @version 1.0 2021-11-24
 * @author Tri Phan
 */
public class Exercise01 
{
	private static Scanner sc = new Scanner(System.in);
	public void doExercise01()
	{
//		Introduction
		System.out.println("\n   ***** Exercise 01 *****\n"
				+ "Removes all unnecessary white spaces in a string.\n");
		
		System.out.println("\nAfter removing all unnecessary white spaces:\n" 
				+ removeWhiteSpaces(sc));
	}

	/**
	 * First, remove all leading and trailing white spaces,
	 * then remove white spaces in the middle of the string.
	 * Finally, returns a copy of the string with all white
	 * spaces removed.
	 * @param s A string need to be modified.
	 * @return A new String object.
	 */
	private String removeWhiteSpaces(String s)
	{
		return s.strip().replaceAll("\\s+", " ");
	}
	
	/**
	 * First, gets a string from the user from the console.
	 * next, remove all leading and trailing white spaces,
	 * then remove white spaces in the middle of the string.
	 * Finally, returns a copy of the string with all white
	 * spaces removed.
	 * @param sc A Scanner object which used to get string from the console.
	 * @return A new string.
	 */
	private String removeWhiteSpaces(Scanner sc)
	{
		String s = Console.getString(sc, "Enter a string: ");
		return removeWhiteSpaces(s);
	}
	
}
