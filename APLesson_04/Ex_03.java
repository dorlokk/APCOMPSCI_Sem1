import java.util.Scanner;
public class Ex_03
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		Ex_03 calc = new Ex_03();
		System.out.println("what is the principal?");
		double P = kb.nextDouble();
		System.out.println("what is the interest rate in percent?");
		double r = kb.nextDouble();
		System.out.println("what is the number of times the interest is compounded per year?");
		double n = kb.nextDouble();
		System.out.println("what is the life of the loan?");
		double t = kb.nextDouble();
		double calculation = calc.loan(r, P, n, t);
		System.out.printf("the Loan costs %10.2f\n", calculation);
		double monthly =  calculation/(t*12);
		System.out.printf("your monthly payment %10.2f\n", monthly);
		
	}
	
	public double loan(double r, double p, double n, double t)
	{

		return p*(Math.pow(1+r/n, n*t));
		
	}
}