import java.util.Scanner;
public class Ex_02
{
	static double num1, num2, num3;
	static double averagelife;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("what is the first number?");
		num1 = kb.nextDouble();
		System.out.println("what is the second number?");
		num2 = kb.nextDouble();
		System.out.println("what is the third number?");
		num3 = kb.nextDouble();
		average();
		print();
		
	}
	
	public static void average()
	{

		averagelife = (num1+num2+num3)/3;
		
	}
	
	public static void print()
	{
		System.out.printf("the average of " + num1 + ", " + num2 + ", and " + num3 + " is %10.5f ", averagelife);
	}
}