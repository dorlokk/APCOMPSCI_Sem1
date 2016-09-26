import java.util.Scanner;
public class Ex_03
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("what is the side length?");
		double cube = kb.nextDouble();
		
		print(cube, calcSurf(cube));
		
	}
	
	public static double calcSurf(double cube)
	{

		return (cube*cube)*6;
		
	}
	
	public static void print(double cube, double calcSurf)
	{
		System.out.printf("The Surface Area of a cube with " + cube + " sides is" + calcSurf); 
	}
}