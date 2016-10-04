import java.util.Scanner;
public class Ex_01
{
	static double l, w;
	static double calculation;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("what is the length?");
		l = kb.nextDouble();
		System.out.println("what is the width?");
		w = kb.nextDouble();
		calcPerim();
		print();
		
	}
	
	public static void calcPerim()
	{

		calculation =  (2*w)+(2*l);
		
	}
	
	public static void print()
	{
		System.out.printf("Your rectangle is %10.5f ft around", calculation);
	}
}