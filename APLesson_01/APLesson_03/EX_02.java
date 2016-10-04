import java.util.Scanner;

public class EX_02
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What is your weight");
		int w = keyboard.nextInt();
		System.out.println("What is your height");
		int h = keyboard.nextInt();
		int BMI = ((703*w)/(h*h));
		System.out.println("Your BMI is " + BMI);

		
	}
}