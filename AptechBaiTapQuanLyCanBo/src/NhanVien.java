import java.util.Scanner;

/** 
 * Represents a staff.
 * This is the subclass of the CanBo class.
 * @version 1.0 2021-11-04
 * @author Tri Phan
 */
public class NhanVien extends CanBo 
{
//	A private instance field.
	private String congViec;
	
	/**
	 * A default constructor.
	 */
	public NhanVien() {}
	
	/**
	 * A parameterized constructor.
	 * @param hoTen A string represents a staff's name.
	 * @param tuoi An integer represents a staff's age.
	 * @param gioiTinh A string represents a staff's gender.
	 * @param diaChi A string represents a staff's address.
	 * @param congViec A string represents a staff's job.
	 */
	public NhanVien(String hoTen, int tuoi, String gioiTinh, String diaChi, String congViec)
	{
		super(hoTen, tuoi, gioiTinh, diaChi);
		setCongViec(congViec);
	}
	
	/**
	 * Sets a value for the "congViec" field.
	 * @param congViec A string is used to 
	 * 	set value for the "congViec" field.
	 */
	public void setCongViec(String congViec)
	{
		this.congViec =setDefaultValue(congViec);
	}

	@Override
	public void setInfo(Scanner sc)
	{
		super.setInfo(sc);
		String congViec = Utilities.getString("Cong viec: ", sc);
		setCongViec(congViec);
	}	

	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append("Nhan Vien: \n");
		builder.append(super.toString());
		builder.append(",\n  cong viec: ");
		builder.append(this.congViec);
		builder.append(".");
		return builder.toString();
	}
}
























