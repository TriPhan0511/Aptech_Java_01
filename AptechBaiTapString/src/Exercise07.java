import java.util.Scanner;

/**
 * Exercise 07: Counts vowels and consonants in a string. 
 * @version 1.0 2021-11-24
 * @author Tri Phan
 */
public class Exercise07 
{
private static Scanner sc = new Scanner(System.in);
	
	public void doExercise07()
	{
//		Introduction
		System.out.println("\n   ***** Exercise 07 *****\n"
				+ "Counts vowels and consonants in a string.\n");
		
//		Calls the countVowelsAndConsonants method to 
//		get a string, counts vowels and consonant in that sting,
//		then prints out result to the console.
		countVowelsAndConsonants(sc);
	}
	
	/**
	 * Gets a string from the user input from the console,
	 * then counts vowels and consonant in that string,
	 * finally, prints out result to the console.
	 * @param sc
	 */
	private void countVowelsAndConsonants(Scanner sc)
	{
		String s = Console.getString(sc, "Enter a string: ");
		countVowelsAndConsonants(s);
	}
	
	/**
	 * Counts vowels and consonants in a string,
	 * then prints out result to the console.
	 * @param s A string.
	 */
	private void countVowelsAndConsonants(String s)
	{
		int vowelCount = 0;
		int consonantCount = 0;
		for (int i = 0; i < s.length(); i++)
		{
			char c = s.charAt(i);
			if ((c >= 65 && c <= 90) || (c >= 97 && c <= 122))
			{
				if (isVowel(c))
				{
					vowelCount++;
				}
				else
				{
					consonantCount++;
				}
			}
		}
		System.out.println("The string contains " + vowelCount + " vowel(s),\nand "
				+ consonantCount + " consonant(s).");
	}
	
	/**
	 * Check whether a character is a vowel or not.
	 * @param c A char
	 * @return true indicates that character is a vowel,
	 * 	otherwise, returns false.
	 */
	private boolean isVowel(char c)
	{
		switch (c)
		{
		case 'a':
		case 'A':
		case 'e':
		case 'E':
		case 'i':
		case 'I':
		case 'o':
		case 'O':
		case 'u':
		case 'U':
			return true;
		default:
			return false;
		}
	}
}





























