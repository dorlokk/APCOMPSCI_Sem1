import java.util.Scanner;
public class Ex_03
{
	static double cube;
	static double calcSurfing;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("what is the side length?");
		cube = kb.nextDouble();
		calcSurf();
		print();
		
	}
	
	public static void calcSurf()
	{

		calcSurfing = (cube*cube)*6;
		
	}
	
	public static void print()
	{
		System.out.printf("The Surface Area of a cube with " + cube + " sides is " + calcSurfing); 
	}
}