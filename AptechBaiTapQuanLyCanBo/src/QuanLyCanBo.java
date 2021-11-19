
import java.util.ArrayList;
import java.util.Scanner;

/** 
 * An employee management application which
 *  can be used to add a new employee,
 *  search employees based on their names,
 *  display the information of all employees.
 * @version 1.0 2021-11-04
 * @author Tri Phan
 */
public class QuanLyCanBo 
{
	public static ArrayList<CanBo> list = new ArrayList<>();
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		System.out.println("\nAloha, I am an employee manager. May I help you?");
		int choice = 0;
		while (choice != 4)
		{
			System.out.println("\n********** Main Menu ***********");
			System.out.println("\nPress 1 to add a new employee to the list.\n"
					+ "Press 2 to search employees based on their names.\n"
					+ "Press 3 to display the information of all employees.\n"
					+ "Press 4 to say goodbye to me.");
			choice = Utilities.getInteger("\nYour choice: ", sc);
			switch (choice)
			{
				case 1:
				{
					insertItemToList();				
					break;
				}
				case 2:
				{
					findBasedOnHoTen(list);
					break;
				}
				case 3:
				{
					displayItems(list);
					break;
				}
				case 4:
				{
					System.out.println("\nI hope I were useful for you.\nGoobye. See you soon!");
					break;
				}
				default:
				{
					System.out.println("\nWrong choice! Try again.");
					break;
				}
			}
		}
	}
	
	/**
	 * Gets the user's choice which is entered from console,
	 * then calls the addItem method to add instance of CongNhan,
	 * or KySu, or NhanVien to the static array list field.
	 */
	private static void insertItemToList()
	{
		System.out.println("\n----------- Enter a new employee to the list ------------------");
		int choice = 0;
		while (choice != 4)
		{
			
			System.out.println("\nPress 1 to add a new CongNhan to the list.\n"
					+ "Press 2 to add a new KySu to the list.\n"
					+ "Press 3 to add a new NhanVien to the list.\n"
					+ "Press 4 to exit.");
			choice = Utilities.getInteger("\nWhich option do you want ?  ", sc);
			switch(choice)
			{
			case 1:
				System.out.println("\n***** Adding an CongNhan object to the list *****");
				addItem(list, new CongNhan());
				break;
				
			case 2:
				System.out.println("\n***** Adding an KySu object to the list *****");
				addItem(list, new KySu());
				break;
			case 3:
				System.out.println("\n***** Adding an NhanVien object to the list *****");
				addItem(list, new NhanVien());
				break;
			case 4:
				System.out.println("\nYou will be get back to the main menu...");
				break;
			default:
				System.out.println("\nWrong choice. Try again.");
				break;
			}
		}
	}
	
	/**
	 * Add one instance of CongNhan, or KySu, or NhanVien classes
	 * into an array list. 
	 * @param list An array list 
	 * 	which contains all of instances of CanBo's subclasses.
	 * @param cb An instance of CanBo's subclass.
	 */
	private static void addItem(ArrayList<CanBo> list, CanBo cb)
	{
		cb.setInfo(sc);
		list.add(cb);
	}
	
	/**
	 * Gets condition from user input.
	 * Then finds instances of CanBo's subclasses meet the condition.
	 * @param list An array list which is used to contain the found instance.
	 */
	private static void findBasedOnHoTen(ArrayList<CanBo> list)
	{
		String hoTen = Utilities.getString("Enter ho ten: ", sc);
		
//		Calls the getItemsBasedOnHoTen to get the list of CanBo meet the condition
		ArrayList<CanBo> found = getItemsBasedOnHoTen(hoTen, list);
		if (found.size() == 0)
		{
			System.out.println("\nResult: Not found.");
			System.out.println("\nYou will be get back to the main menu...");
		}
		else
		{
			System.out.println("\nResult: Found!");
			displayItems(found);
		}
	}
	
	/**
	 * Finds CanBo's subclass instance based on the hoTen field. 
	 * @param hoTen A string represents the hoTen field.
	 * @param list An array list which is used to contain the found instance.
	 * @return An array list contains all of found instances.
	 */
	private static ArrayList<CanBo> getItemsBasedOnHoTen(String hoTen, ArrayList<CanBo> list) 
	{
		ArrayList<CanBo> result = new ArrayList<>();
		for (CanBo cb: list)
		{
			if (cb.getHoTen().equalsIgnoreCase(hoTen))
			{
				result.add(cb);
			}
		}
		return result;
	}
	
	/**
	 * Shows all information of CanBo's subclasses' instances in an array list.
	 * @param list An array list which contains CanBo's subclasses' instances.
	 */
	private static void displayItems(ArrayList<CanBo> list)
	{
		System.out.println("\n----------- Information of employee(s) ------------------\n");
		if (list.size() == 0)
		{
			System.out.println("Nothing to show.");
		}
		else
		{
			for (CanBo cb: list)
			{
				System.out.println(cb);
			}
		}
		System.out.println("\nYou will be get back to the main menu...");
	}
}






















