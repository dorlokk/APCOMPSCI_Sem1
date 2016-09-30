import java.util.Scanner;
public class Ex_01
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("what is the length?");
		double l = kb.nextDouble();
		System.out.println("what is the width?");
		double w = kb.nextDouble();
		double calculation = calcPerim(l, w);
		print(calculation);
		
	}
	
	public static double calcPerim(double l, double w)
	{

		return (2*w)+(2*l);
		
	}
	
	public static void print(double calculation)
	{
		System.out.printf("Your rectangle is %10.5f ft around", calculation);
	}
}