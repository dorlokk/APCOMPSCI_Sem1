import java.util.Scanner;
public class Ex_03
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Print da werd");
		String werd = kb.next();
		for(int i = werd.length(); i > 0 ; i--)
		{
			System.out.println(werd.substring(0,i));
		}
	}
}