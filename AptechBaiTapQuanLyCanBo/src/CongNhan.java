import java.util.Scanner;

/** 
 * Represents a worker.
 * This is the subclass of the CanBo class.
 * @version 1.0 2021-11-04
 * @author Tri Phan
 */
public class CongNhan extends CanBo 
{
//	A private instance field
	private int bac;
	
	/**
	 * A default constructor.
	 */
	public CongNhan() {}
	
	/**
	 * A parameterized constructor.
	 * @param hoTen A string represents a worker's name.
	 * @param tuoi An integer represents a worker's age.
	 * @param gioiTinh A string represents a worker's gender.
	 * @param diaChi A string represents a worker's address.
	 * @param bac An integer represents a worker's level.
	 */
	public CongNhan(String hoTen, int tuoi, String gioiTinh, String diaChi, int bac)
	{
		super(hoTen, tuoi, gioiTinh, diaChi);
		setBac(bac);
	}
	
	/**
	 * Sets a value for the "bac" field.
	 * @param bac An integer is used to 
	 * 	set value for the "bac" field.
	 */
	private void setBac(int bac)
	{
//		The value of the "bac" field must be between 1 and 10.
		if (bac < 1)
		{
			this.bac = 1;
		}
		else if (bac > 10)
		{
			this.bac = 10;
		}
		else
		{
			this.bac = bac;
		}
	}
	
	/**
	 * Gets a value of a CongNhan instance's level from user input,
	 *  then validate that value, if it is between 1 and 10, accept it,
	 *  otherwise, ask user enter another value.
	 * @param sc A Scanner object is used to get user input from console.
	 * @return An integer which is ensured be between 1 and 10.
	 */
	private int validateBac(Scanner sc)
	{
		int bac;
		while (true)
		{
			bac = Utilities.getInteger("Bac (between 1 and 10): ", sc);
			if (bac < 1 || bac > 10)
			{
				System.out.println("You should enter a number between 1 and 10. Try again.");
			}
			else 
			{
				return bac;
			}
		}
	}
	
	@Override
	public void setInfo(Scanner sc)
	{
		super.setInfo(sc);
		int bac = validateBac(sc);
		setBac(bac);
	}

	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append("Cong Nhan: \n");
		builder.append(super.toString());
		builder.append(",\n  bac: ");
		builder.append(this.bac);
		builder.append(".");
		
		return builder.toString();
	}
}
























