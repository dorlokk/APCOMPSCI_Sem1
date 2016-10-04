import java.util.Scanner;

public class EX_03
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("we will be calculating velocity");
		System.out.println("What is the acceleration");
		int a = keyboard.nextInt();
		System.out.println("How long is it been moving  in seconds");
		int t = keyboard.nextInt();
		System.out.println("What is the initial velocity");
		int v = keyboard.nextInt();
		int vi = (a*t+v);
		System.out.println("Your velocity is " + vi);

		
	}
}