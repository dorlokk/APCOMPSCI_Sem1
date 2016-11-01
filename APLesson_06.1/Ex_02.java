import java.util.Scanner;
public class Ex_02
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Print da werd");
		String werd = kb.next();
		for(int i = 0 ; i < werd.length() ; i++)
		{
			System.out.println(werd.substring(i,werd.length()));
		}
	}
}