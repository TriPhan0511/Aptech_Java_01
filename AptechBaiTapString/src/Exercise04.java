import java.util.Scanner;

/**
 * Exercise 04: Transforms a string to lower case form. 
 * @version 1.0 2021-11-24
 * @author Tri Phan
 */
public class Exercise04 
{
	private static Scanner sc = new Scanner(System.in);
	
	public void doExercise04()
	{
//		Introduction
		System.out.println("\n   ***** Exercise 04 *****\n"
				+ "Transforms a string to lower case form.\n");
		
		System.out.println("\nResult:\n" + toLowerCaseAString(sc));
	}
	
	/**
	 * Transforms a string to lower case form. 
	 * @param s A string
	 * @return A new string
	 */
	private String toLowerCaseAString(String s)
	{
		char[] letters = s.toCharArray();
		for (int i = 0; i < letters.length; i++)
		{
			if (letters[i] >= 65 && letters[i] <= 90)
			{
				letters[i] = (char) (letters[i] + 32);
			}
		}
		return String.valueOf(letters);
	}
	
	/**
	 * Gets a string from the user from the console,
	 * then transforms a string to lower case form. 
	 * @param sc A Scanner object which used to get string from the console.
	 * @return A new string
	 */
	private String toLowerCaseAString(Scanner sc)
	{
		String s = Console.getString(sc, "Enter a string: ");
		return toLowerCaseAString(s);
	}
}























