import java.util.Scanner;
public class Ex_01
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What is the scentence");
		String scent = kb.nextLine();
		recur(scent);
	}
	public static void recur(String scent)
	{
		if (scent.indexOf(" ") == -1)
		{
			System.out.println(scent);
		}
		else
		{
			if (scent.indexOf(" ") == -1)
			{
				System.out.println(scent);
			}
			else
			{
				scent = scent.substring(0, scent.indexOf(" ")) + "_" + scent.substring(scent.indexOf(" ") +1);
				recur(scent);
			}
		}
			
	}
}
