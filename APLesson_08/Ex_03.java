import java.util.Scanner;
public class Ex_03
{
	static int i = 0;
	static int number;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What is the number");
		number = kb.nextInt();
		luck(number);
	}
	public static void luck(int number)
	{
		if (number > 0)
		{
			if (number % 10 == 7)
			{
				i += 1;
				luck(number/10);
				
				
			}
			else
			{
				i += 0;
				luck(number/10);
				 
			}	
		}
		else
		{
			System.out.println(i);
		}
			
	}
}