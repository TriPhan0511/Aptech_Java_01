import java.util.Scanner;

/**
 * Exercise 06: Counts characters in a string.
 * @version 1.0 2021-11-25
 * @author Tri Phan
 */
public class Exercise06 
{
	private static Scanner sc = new Scanner(System.in);
	private static final char[] ALPHABET = {
			'a', 'b', 'c', 'd', 
			'e', 'f', 'g', 'h',
			'i', 'j', 'k', 'l',
			'm', 'n', 'o', 'p',
			'q', 'r', 's', 't',
			'u', 'v', 'w', 'x',
			'y', 'z'
	};
	
	public void doExercise06()
	{
//		Introduction
		System.out.println("\n   ***** Exercise 04 *****\n"
				+ "Counts characters in a string.\n");

//		String s = "Hello, world!";
//		countCharacters(s, ALPHABET);
		countCharacters(sc, ALPHABET);
	}
	
	private void countCharacters(Scanner sc, char[] alphabet)
	{
		String s = Console.getString(sc, "Enter a string: ");
		countCharacters(s, alphabet);
	}
	
	private void countCharacters(String s, char[] alphabet)
	{
		int[] counts = new int[26];
		s = s.toLowerCase();
		for (int i = 0; i < s.length(); i++)
		{
			char c = s.charAt(i);
			int indexOfChar = indexOf(c, alphabet);
			if (indexOfChar != -1)
			{
				counts[indexOfChar]++;
			}
		}
		
		for (int i = 0; i < counts.length; i++)
		{
			if (counts[i] > 0)
			{
				System.out.println(alphabet[i] + ": " + counts[i]);
			}
		}
	}
	
	private int indexOf(char c, char[] alphabet)
	{
//		char[] alphabet = {
//				'a', 'b', 'c', 'd', 
//				'e', 'f', 'g', 'h',
//				'i', 'j', 'k', 'l',
//				'm', 'n', 'o', 'p',
//				'q', 'r', 's', 't',
//				'u', 'v', 'w', 'x',
//				'y', 'z'
//		};
		for (int i = 0; i < alphabet.length; i++)
		{
			if (c == alphabet[i])
			{
				return i;
			}
		}
		return -1;
	}
	
//	private int indexOf(char c)
//	{
//		char[] alphabet = {
//				'a', 'b', 'c', 'd', 
//				'e', 'f', 'g', 'h',
//				'i', 'j', 'k', 'l',
//				'm', 'n', 'o', 'p',
//				'q', 'r', 's', 't',
//				'u', 'v', 'w', 'x',
//				'y', 'z'
//		};
//		for (int i = 0; i < alphabet.length; i++)
//		{
//			if (c == alphabet[i])
//			{
//				return i;
//			}
//		}
//		return -1;
//	}
}
