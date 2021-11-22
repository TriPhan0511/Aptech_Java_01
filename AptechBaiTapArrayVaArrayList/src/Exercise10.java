import java.util.Arrays;

/**
 * Exercise 10: 
 *  Converts from an array of chars to a String.
 *  Solution 1: Use the valueOf method in the String class.
 *  Solution 2: Via passes the array as an argument to 
 */
public class Exercise10 
{
	public void doExercise10()
	{
//		Introduction
		System.out.println("\n\t***** Exercise 10 *****\n"
				+ "Converts from an array of chars to a String object.");
		
//		Gets an array of 5 random characters
		char[] characters = 
			Utilities.getRandomCharacters(5, 65, 90); // 65 = 'A', 90 = 'Z'
		
//		Prints out the content of the array of characters
		System.out.println("\nThe content of the array of characters:");
		System.out.println(Arrays.toString(characters));
		
//		Converts from an array of characters to a String
//		Use the valueOf method in the String class.
		String s1 = convertFromAnArrayOfCharsToAString(characters);
//		Prints out the string
		System.out.printf("\nResult of first solution: %s", s1);
		
//		Converts from an array of characters to a String
//		Use the String class constructor.
		String s2 = convertFromAnArrayOfCharsToAString2(characters);
//		Prints out the string
		System.out.printf("\nResult of second solution: %s", s1);
	}
	
	/**
	 * Solution 2:
	 * Converts from an array of chars to a String,
	 * via passes the array as an argument to 
	 * the String class constructor.
	 * @param characters An array of chars.
	 * @return A String object.
	 */
	public String convertFromAnArrayOfCharsToAString2(char[] characters)
	{
		String s = new String(characters);
		return s;
	}
	
	/**
	 * Solution 1:
	 * Converts from an array of chars to a String,
	 * use the valueOf method in the String class.
	 * @param characters An array of chars.
	 * @return A String object.
	 */
	public String convertFromAnArrayOfCharsToAString(char[] characters)
	{
		String s = String.valueOf(characters);
		return s;
	}
}
