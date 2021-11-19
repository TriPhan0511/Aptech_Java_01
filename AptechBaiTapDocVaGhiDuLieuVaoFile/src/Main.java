import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Read data from a text file,
 * next, validate the data,
 * then, write that data to some other text files.
 * @version 1.0 2021-11-10
 * @author Tri Phan
 */
public class Main 
{
//	The file path of a text file.
	private static final String FILE_PATH = "src/students.txt";
//	A pattern of student's roll number.
	private static final String ROLL_NUMBER_PATTERN = "[CTN]\\d{4}[G-M]V?\\d{4}"; 
//	An array list which is used to contain valid roll numbers.
	private static ArrayList<Student> validRollNumbers = new ArrayList<>();
//	An array list which is used to contain invalid roll numbers.
	private static ArrayList<String> invalidRollNumbers = new ArrayList<>();
	
	public static void main(String[] args)
	{
		BufferedReader reader = getFile(FILE_PATH);
		if (reader == null)
		{
			System.out.println("Something goes wrong.");
		}
		else
		{
			handleRollNumber(reader);
		}
	}
	
	/**
	 * Reads line by line from a text file,
	 * gets the student roll number,
	 * Then check that roll number, if it is valid, 
	 * write it to a separate text file whose name is that roll number.
	 * Otherwise, if that roll number is invalid, 
	 * write it to another text file whose name is invalid. 
	 * @param reader An instance of BufferedReader.
	 */
	private static void handleRollNumber(BufferedReader reader)
	{
		String line;
		try 
		{
			while ((line = reader.readLine()) != null && line.length() != 0)
			{
				if (isValidRollNo(ROLL_NUMBER_PATTERN, line))
				{
					Student s = new Student(line);
					validRollNumbers.add(s);
					Student savedStudent = validRollNumbers.get(validRollNumbers.size() - 1);
					String savedRollNumber =savedStudent.getRollNumber(); 
					System.out.printf("Welcome student has roll number : %s\n", 
							savedRollNumber);
					System.out.printf("Valid collection has length: %d\n", validRollNumbers.size());
					String path = "src/" + savedRollNumber + ".txt";
					writeToFile(path, savedStudent.toString(), false);
				}
				else
				{
					invalidRollNumbers.add(line);
					String s = invalidRollNumbers.get(invalidRollNumbers.size() - 1);
					System.out.printf("Invalid roll number: %s\n", s);
					String path = "src/invalid.txt";
					writeToFile(path, s, true);
				}
			}
		} 
		catch (IOException e) 
		{
			System.out.println("Cannot read from the file.");
		}
	}
	
	/**
	 * Check whether a roll number is valid or invalid.
	 * @param regex A pattern of a valid roll number.
	 * @param rollNumber A roll number will be validate.
	 * @return true if the roll number is valid, 
	 * 	otherwise, returns false. 
	 */
	private static boolean isValidRollNo( String regex, String rollNumber) 
	{
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(rollNumber);
		return matcher.matches();
	}
	
	/**
	 * Gets a BufferedReader instance.
	 * @param path The path of a file.
	 * @return A BufferedReader instance.
	 */
	private static BufferedReader getFile(String path)
	{
		BufferedReader reader = null;
		try 
		{
			
			 reader = new BufferedReader(new FileReader(path));
		}
		catch (FileNotFoundException e)
		{
			System.out.println("Cannot open the file.");
			System.out.println(e.getMessage());
		}
		return reader;
	}
	
	/**
	 * Write data to a file.
	 * @param path The path of a text file.
	 * @param content The data will be written to the file.
	 * @param append A boolean parameter, 
	 * 	if true, create a new file,
	 * 	if false, append new data to the current content in the file.
	 */
	private static void writeToFile(String path, String content, boolean append)
	{
		try
		{
			BufferedWriter writer = new BufferedWriter(new FileWriter(path, append));
			writer.write(content);
			writer.write(System.lineSeparator());
			writer.close();
		}
		catch (IOException e)
		{
			System.out.println("Cannot write to file " + path);
		}
	}
}
