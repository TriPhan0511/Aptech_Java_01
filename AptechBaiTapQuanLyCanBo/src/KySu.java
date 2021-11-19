import java.util.Scanner;

/** 
 * Represents an engineer.
 * This is the subclass of the CanBo class.
 * @version 1.0 2021-11-04
 * @author Tri Phan
 */
public class KySu extends CanBo
{
//	A private instance field.
	private String nganhDaoTao;
	
	/**
	 * A default constructor.
	 */
	public KySu() {}
	
	/**
	 * A parameterized constructor.
	 * @param hoTen A string represents an engineer's name.
	 * @param tuoi An integer represents an engineer's age.
	 * @param gioiTinh A string represents an engineer's gender.
	 * @param diaChi A string represents an engineer's address.
	 * @param nganhDaoTao A string represents an engineer's department.
	 */
	public KySu(String hoTen, int tuoi, String s, String diaChi, String nganhDaoTao)
	{
		super(hoTen, tuoi, s, diaChi);
		setNganhDaoTao(nganhDaoTao);
	}
	
	/**
	 * Sets a value for the "nganhDaoTao" field.
	 * @param nganhDaoTao A string is used to
	 * 	set value for the "nganhDaoTao" field.
	 */
	public void setNganhDaoTao(String nganhDaoTao)
	{
		this.nganhDaoTao = setDefaultValue(nganhDaoTao);
	}
	
	@Override
	public void setInfo(Scanner sc)
	{
		super.setInfo(sc);
		String nganhDaoTao = Utilities.getString("Nganh dao tao: ", sc);
		setNganhDaoTao(nganhDaoTao);
	}	

	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append("Ky Su: \n");
		builder.append(super.toString());
		builder.append(",\n  nganh dao tao: ");
		builder.append(this.nganhDaoTao);
		builder.append(".");
		return builder.toString();
	}
}













