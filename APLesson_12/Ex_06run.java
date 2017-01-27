import java.util.Scanner;
public class Ex_06run
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the Item manufacturer");
		String manufacturer = kb.next();
		System.out.println("Enter the Item name");
		String name = kb.next();
		System.out.println("Enter the Item category");
		String category = kb.next();
		System.out.println("Enter the Item price");
		float price = kb.nextFloat();
		

		Ex_06 user1 = new Ex_06 (manufacturer, name, category, price);
		System.out.println (user1);

		
	}
}
