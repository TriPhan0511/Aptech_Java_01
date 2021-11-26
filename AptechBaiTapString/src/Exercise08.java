import java.util.Arrays;
import java.util.Scanner;

/**
 * Exercise 08: Reverse order of letters in a string. 
 * @version 1.0 2021-11-24
 * @author Tri Phan
 */
public class Exercise08 
{
private static Scanner sc = new Scanner(System.in);
	
	public void doExercise08()
	{
//		Introduction
		System.out.println("\n   ***** Exercise 08 *****\n"
				+ "Reverse order of letters in a string.\n");
		
//		Calls the reverseString to gets a string from the user input 
//		from the console, then reverses order of letters in each word in a string,
//		finally, prints out result to the console.
		System.out.println("\nAfter reversing order of letters in each word:\n" + reverseString(sc));
	}
	
	/**
	 * Gets a string from the user input from the console,
	 * then reverses order of letters in each word in a string. 
	 * @param sc A Scanner object which used to get a string 
	 * 	from user input from the console.
	 * @return A reversed string.
	 */
	private String reverseString(Scanner sc)
	{
		String s = Console.getString(sc, "Enter a string: ");
		return reverseString(s);
	}
	
	/**
	 * Reverses order of letters in each word in a string.
	 * @param s A string.
	 * @return A reversed string.
	 */
	private String reverseString(String s)
	{
		String[] words = s.split("\\s");
		for (int i = 0; i < words.length; i++)
		{
			words[i] = reverseLetters(words[i]);
		}
		return String.join(" ", words);
	}
	
	/**
	 * Reverses order of all of letters in a string (solution 1).
	 * @param s A string
	 * @return a reversed string.
	 */
	private String reverseLetters(String s)
	{
		return new StringBuilder(s).reverse().toString();
	}
	
	/**
	 * Reverses order of all of letters in a string (solution 2).
	 * @param s A string
	 * @return a reversed string.
	 */
	private String reverseLetters2(String s)
	{
		char[] letters = s.toCharArray();
		char[] reversed = new char[letters.length];
		int reversedIndex = 0;
		for (int i = letters.length - 1; i >= 0; i--)
		{
			reversed[reversedIndex] = letters[i];
			reversedIndex++;
		}
		return String.valueOf(reversed);
	}
}
