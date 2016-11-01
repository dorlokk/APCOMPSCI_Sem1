import java.util.Scanner;
public class Ex_02
{
	
	static double w,h,bmi;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What is your weight");
		w = kb.nextDouble();
		System.out.println("What is your height");
		h = kb.nextDouble();
		bmi = (w*703)/(h*h);
		System.out.println("you are " + calc());
	}
	
	public static String calc()
	{
		if (bmi < 18.5)
			return "underweight";
		else if ((24.4 > bmi) & (bmi >= 18.5) )
			return "normal";
		else if ((29.9> bmi) & (bmi >= 24.4))
			return "overweight";
		else if ((34.9> bmi) &( bmi>= 29.9))
			return "obese";
		else if ((39.9> bmi) & (bmi >= 34.9))
			return "very obese";
		else if (bmi >= 39.9)
			return "morbidly obsese";
		else
			return "";
	}
}