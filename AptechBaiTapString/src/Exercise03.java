import java.util.Scanner;

/**
 * Exercise 03: Transforms a string to upper case form. 
 * @version 1.0 2021-11-24
 * @author Tri Phan
 */
public class Exercise03 
{
private static Scanner sc = new Scanner(System.in);
	
	public void doExercise03()
	{
//		Introduction
		System.out.println("\n   ***** Exercise 03 *****\n"
				+ "Transforms a string to upper case form.\n");
		
		System.out.println("\nResult:\n" + toUpperCaseAString(sc));
	}
	
	/**
	 * Transforms a string to upper case form. 
	 * @param s A string
	 * @return A new string
	 */
	private String toUpperCaseAString(String s)
	{
		char[] letters = s.toCharArray();
		for (int i = 0; i < letters.length; i++)
		{
			if (letters[i] >= 97 && letters[i] <= 122)
			{
				letters[i] = (char) (letters[i] - 32);
			}
		}
		return String.valueOf(letters);
	}
	
	/**
	 * Gets a string from the user from the console,
	 * then transforms a string to upper case form. 
	 * @param sc A Scanner object which used to get string from the console.
	 * @return A new string
	 */
	private String toUpperCaseAString(Scanner sc)
	{
		String s = Console.getString(sc, "Enter a string: ");
		return toUpperCaseAString(s);
	}
}























