import java.util.Scanner;
public class Ex_04
{
	static int size,integer;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What is the integer");
		integer = kb.nextInt();
		System.out.println("What is the size");
		size = kb.nextInt();
		for(int i = 1; i <= size; i++)
		{
			System.out.println(i + "," + (i*integer));
		}
		
	}
}