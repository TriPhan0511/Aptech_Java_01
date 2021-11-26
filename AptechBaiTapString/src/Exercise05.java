import java.util.Arrays;
import java.util.Scanner;

/**
 * Exercise 05: Converts from char to String, and vice versa. 
 * @version 1.0 2021-11-24
 * @author Tri Phan
 */
public class Exercise05 
{
private static Scanner sc = new Scanner(System.in);
	
	public void doExercise05()
	{
//		Introduction
		System.out.println("\n   ***** Exercise 05 *****\n"
				+ "Converts from an array of chars to a String objet,\nand vice versa.\n"
				+ "(Use the valueOf and toCharArray methods\nin the String class.)");
		
		char[] letters = { 
				'h', 'e', 'l', 'l', 'o', ' ', 
				'w', 'o', 'r', 'l', 'd', '!' 
				};
		System.out.println("\nA sample array of chars:\n" 
				+ Arrays.toString(letters));
		System.out.println("\nAfter converting to a string:\n" 
				+ String.valueOf(letters));
		
		String s = "Good morning!";
		System.out.println("\nA sample string:\n" + s);
		System.out.println("\nAfter converting to an array of chars:\n"
				+ Arrays.toString(s.toCharArray()));
	}
}
