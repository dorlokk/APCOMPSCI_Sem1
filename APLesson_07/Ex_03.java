import java.util.Scanner;
public class Ex_03
{
	static int number;
	static int rev = 0;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What is the number");
		number = kb.nextInt();
		getReverse();
		System.out.println( number + " reversed is " + rev);
	}
	public static void getReverse()
	{
		int num = number;
		while(num>0)
		{
			rev *= 10;
			rev = rev + (num%10);
			num/=10;
		}
	}
}