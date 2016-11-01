import java.util.Scanner;
public class Ex_01
{
	static int num1, num2;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What is the iterator number");
		num1 = kb.nextInt();
		System.out.println("What is the ending number");
		num2 = kb.nextInt();
		for(int i = 0; i <= num2; i+=num1)
		{
			System.out.print(i + "\t");
		}
		
	}
}