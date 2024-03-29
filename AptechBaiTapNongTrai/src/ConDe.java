
/**
 * Represents a goat.
 * This is the subclass of GiaSuc class.
 * @version 1.0 2021-11-10
 * @author Tri Phan
 */
public class ConDe extends GiaSuc
{
//	A class variable
	public static String tiengKeu = "dedede";
	
//	Default constructor
	public ConDe() 
	{
		setTiengKeu(tiengKeu);
	}
	
//	Another constructor
	public ConDe(int slConCaiItNhat, int slConCaiNhieuNhat, 
					double soLitSuaItNhat, double soLitSuaCaoNhat)
	{
		super(tiengKeu, slConCaiItNhat, slConCaiNhieuNhat, 
				soLitSuaItNhat, soLitSuaCaoNhat);
	}
}
