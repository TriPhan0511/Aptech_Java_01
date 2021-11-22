import java.util.Scanner;

public class Main 
{
	static Scanner sc =  new Scanner(System.in);
	
	public static void main(String[] args)
	{
		int firstExercise = 1;
		int lastExercise = 10;
		System.out.println("\nLet's test my exercises.");
		while (true)
		{
			testOneExercise(firstExercise, lastExercise);
			if (!Console.askForKeepDoing(sc, 
					"Do you want to keep testing other exercises?"))
			{
				break;
			}
		}
		System.out.println("\nThank you for testing my exercises!");
	}
	
	/**
	 * Gets an exercise number then run the corresponding exercise.
	 * @param firstExercise The first exercise number.
	 * @param lastExercise The last exercise number.
	 */
	public static void testOneExercise(int firstExercise, int lastExercise)
	{
		int choice = getExerciseNumber(firstExercise, lastExercise);
		switch (choice)
		{
			case 1:
				new Exercise01().doExercise01();
				break;
				
			case 2:
				new Exercise02().doExercise02();
				break;
				
			case 3:
				new Exercise03().doExercise03();
				break;
			
			case 4:
				new Exercise04().doExercise04();
				break;

			case 5:
				new Exercise05().doExercise05();
				break;
				
			case 6:
				new Exercise06().doExercise06();
				break;
				
			case 7:
				new Exercise07().doExercise07();
				break;
				
			case 8:
				new Exercise08().doExercise08();
				break;
				
			case 9:
				new Exercise09().doExercise09();
				break;
				
			case 10:
				new Exercise10().doExercise10();
				break;
				
			default:
				System.out.printf("Wrong choice!\n"
						+ "You should enter a number between %d and %d.", 
						firstExercise, 
						lastExercise);
				break;
		}
	}
	
	/**
	 * Gets an exercise number.
	 * @param firstExercise The first exercise number.
	 * @param lastExercise The second exercise number.
	 * @return An exercise number.
	 */
	public static int getExerciseNumber(int firstExercise, int lastExercise)
	{
		int number;
		while (true)
		{
			number = Console.getInteger(sc, 
					"\nEnter a exercise number (" + firstExercise + "-" + lastExercise + "): ");
			if ((number < firstExercise) || (number > lastExercise))
			{
				System.out.printf("You should enter a number between %d and %d.\nTry again.\n", 
						firstExercise, 
						lastExercise);
			}
			else
			{
				return number;
			}
		}
	}
}
