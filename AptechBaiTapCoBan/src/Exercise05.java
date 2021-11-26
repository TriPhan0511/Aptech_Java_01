import java.util.Scanner;

/**
 * Exercise 05: Check a character is a vowel or a consonant.
 * @version 1.0 2021-11-26
 * @author Tri Phan
 */
public class Exercise05 
{
	private Scanner sc = new Scanner(System.in);
	
	public void doExercise05()
	{
//		Introduction
		System.out.println("\n   ***** Exercise 05 *****\n"
				+ "Check a character is a vowel or a consonant.\n");
		
//		Calls the checkACharacter method to get a character
//		from the user input from the console, then check
//		that character and prints out result to the console.
		checkACharacter(sc);
	}
	
	/**
	 * Check a character is a vowel or not.
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
	
	/**
	 * Check a character is a consonant or not.
	 * @param c A char
	 * @return true indicates that character is a consonant,
	 * 	otherwise, returns false.
	 */
	private boolean isConsonant(char c)
	{
		if ((c >= 65 && c <= 90) || (c >= 97 && c <= 122))
		{
			if (!isVowel(c))
			{
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Gets a character from the user input from the console.
	 * Check a character is a vowel or a consonant.
	 * @param c A char
	 * @return true indicates that character is a vowel
	 */
	private void checkACharacter(Scanner sc)
	{
		char c = Console.getChar(sc, "Enter a character: ");
		if (isVowel(c))
		{
			System.out.printf("\n%c is a vowel.", c);
		}
		else if (isConsonant(c))
		{
			System.out.printf("\n%c is a consonant.", c);
		}
		else
		{
			System.out.printf("\n%c is neither a vowel nor a consonant.", c);
		}
	}
	
	
}






















