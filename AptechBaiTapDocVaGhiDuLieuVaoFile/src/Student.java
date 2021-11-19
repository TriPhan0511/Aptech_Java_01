
/**
 * Represents a student.
 * @version 1.0 2021-11-10
 * @author Tri Phan
 */
public class Student 
{
//	A private field.
	private String studRollNo;
	
	/**
	 * A parameterized constructor
	 * @param rollNumber A string which 
	 * 	is used as the value of the studRollNo field.
	 */
	public Student(String rollNumber) 
	{
		this.studRollNo = rollNumber;
	}
	
	/**
	 * Gets the value of the studRollNo field.
	 * @return A string which is the value of the studRollNo field.
	 */
	public String getRollNumber()
	{
		return this.studRollNo;
	}
	
	/**
	 * Sets value for the studRollNo field.
	 * @param rollNumber A string
	 */
	public void setRollNumber(String rollNumber) 	
	{
		this.studRollNo = rollNumber;
	}
	
	@Override
	public String toString()
	{
		return "RollNumber: " + this.studRollNo;
	}
}
