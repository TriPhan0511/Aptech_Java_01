import java.util.Scanner;

/** 
 * Represents an employee.
 * This is the superclass of CongNhan, KySu, NhanVien classes.
 * @version 1.0 2021-11-04
 * @author Tri Phan
 */
public class CanBo 
{
//	Private fields
	private String hoTen;
	private int tuoi;
	private GioiTinh gt;
	private String diaChi;
	
	/**
	 * A default constructor
	 */
	public CanBo() {}
	
	/**
	 * A parameterized constructor.
	 * @param hoTen A string is used to set value for an CanBo instance's name.
	 * @param tuoi An integer is used to set value for an CanBo instance's age.
	 * @param gioiTinh A string is used to set value for an CanBo instance's gender.
	 * @param diaChi A string is used to set value for an CanBo instance's address.
	 */
	public CanBo(String hoTen, int tuoi, 
			String gioiTinh, String diaChi)
	{
		setHoTen(hoTen);
		setTuoi(tuoi);
		setGioiTinh(gioiTinh);
		setDiaChi(diaChi);
	}
	
	/**
	 * Sets value for a CanBo instance's name.
	 * @param hoTen A string is used to 
	 * 	set value for the "hoTen" field.
	 */
	public void setHoTen(String hoTen)
	{
		this.hoTen = setDefaultValue(hoTen);
	}
	
	/**
	 * Sets value for a CanBo instance's age.
	 * @param hoTen A string is used to 
	 * 	set value for the "tuoi" field.
	 */
	public void setTuoi(int tuoi)
	{
//		Make sure the value of the "tuoi" field is always greater than or equal to 18
		if(tuoi < 18)
		{
			this.tuoi = 18;
		}
		else
		{
			this.tuoi = tuoi;
		}
	}
	
	/**
	 * Sets value for a CanBo instance's gender.
	 * @param hoTen A string is used to 
	 * 	set value for the "gioiTinh" field.
	 */
	public void setGioiTinh(String s)
	{
		if (s.equalsIgnoreCase("Nam"))
		{
			this.gt = GioiTinh.NAM;
		}
		else if (s.equalsIgnoreCase("Nu"))
		{
			this.gt = GioiTinh.NU;
		}
		else
		{
			this.gt = GioiTinh.KHAC;
		}
	}
	
	/**
	 * Sets value for a CanBo instance's address.
	 * @param hoTen A string is used to 
	 * 	set value for the "diaChi" field.
	 */
	public void setDiaChi(String diaChi)
	{
		this.diaChi = setDefaultValue(diaChi);
	}

	/**
	 * Gets a CanBo instance's name.
	 * @return A string represents a CanBo instance's name. 
	 */
	public String getHoTen()
	{
		return this.hoTen;
	}
	
	/**
	 * Convert from GioiTinh enumerate type to a string.
	 * @param gt A value of the GioiTinh enumerate type.
	 * @return A string represents a CanBo instance's gender.
	 */
	private String parseGioiTinh(GioiTinh gt)
	{
		String s;
		switch(gt)
		{
		case NAM:
			s = "Nam";
			break;
		case NU:
			s = "Nu";
			break;
		default:
			s = "Khac";
			break;
		}
		return s;
	}
	
	/**
	 * Sets a default string value.
	 * @param s A string will be check whether null or empty.
	 * @return A string has value of "Not Known".
	 */
	public String setDefaultValue(String s)
	{
		if(s == null || s.equals(""))
		{
			return "Not Known";
		}
		return s;
	}
	
	/**
	 * Gets information from user input,
	 * then set values for name, age, gender, 
	 * 	and address of a CanBo instance.
	 * @param sc Scanner object is used to get user input from console.
	 */
	public void setInfo(Scanner sc)
	{
//		Gets user input
		String hoTen = Utilities.getString("Ho Ten: ", sc);
		int tuoi = validateTuoi(sc);
		String gioiTinh = Utilities.getString("Gioi tinh: ", sc);
		String diaChi = Utilities.getString("Dia chi: ", sc);
		
//		Calls the setters
		setHoTen(hoTen);
		setTuoi(tuoi);
		setGioiTinh(gioiTinh);
		setDiaChi(diaChi);
	}
	
	/**
	 * Gets a value of a CanBo instance's age from user input,
	 * 	then validate that value, if it is less than 18, 
	 *  ask user enter another value, otherwise, accept that value.
	 * @param sc A Scanner object is used to get user input from console.
	 * @return An integer which is ensured be equal or greater than 18.
	 */
	private int validateTuoi(Scanner sc)
	{
		int tuoi;
		while (true)
		{
			tuoi = Utilities.getInteger("Tuoi (be greater than or equal to 18): ", sc);
			if (tuoi < 18)
			{
				System.out.println("You should enter a number which be greater than or "
									+ "equal to 18. Try again.");
			}
			else
			{ 
				return tuoi;
			}
		}
	}
	
	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append("  Ho ten: ");
		builder.append(this.hoTen);
		builder.append(", tuoi: ");
		builder.append(this.tuoi);
		builder.append(", \n  gioi tinh: ");
		builder.append(parseGioiTinh(this.gt));
		builder.append(", dia chi: ");
		builder.append(diaChi);
		return builder.toString();
	}
}




























