
public class TestApp 
{
	
	public static void main(String[] args)
	{
//		int num1 = 10;
//		int num2 = num1;
//		
////		Change
//		num2 = 20;
//		System.out.println("num 1 = " + num1);
//		System.out.println("num2 = " + num2);
		
		Integer num3 = 10;
		Integer num4 = num3;
		
//		Change
		change(num4);
		
		System.out.println("num3  = " + num3);
		System.out.println("num4 = " + num4);
	}
	
	private static void change(Integer number)
	{
		number++;
	}
}
