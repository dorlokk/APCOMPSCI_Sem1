import java.util.Scanner;
public class Ex_04
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		Ex_04 calc = new Ex_04();
		System.out.println("what is the height?");
		double h = kb.nextDouble();
		System.out.println("what is the length?");
		double l = kb.nextDouble();
		System.out.println("what is the width?");
		double w = kb.nextDouble();
		double calculation = calc.converstion(h, l, w);
		System.out.printf("the measurement in cubic feet is %10.2f\n", calculation);
		
	}
	
	public double converstion(double h, double l, double w)
	{

		return (h*l*w)/1728;
		
	}
}