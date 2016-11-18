import java.util.Scanner;
public class Ex_05
{
	static String odds;
	public static void main(String[]args)
	{
		int[] numbers = new int[10];
		fillArray(numbers);
		System.out.println("The numbers in the array are:");
		printArray(numbers);
		System.out.println(" ");
		System.out.println(" ");
		getOdds(numbers);
		
	}
	public static void fillArray(int[] numbers)
	{
		for(int i = 0; i < numbers.length; i++)
		{
			numbers[i] = (int)(Math.random()*100)+1;
		}

	}
	public static void printArray(int[] numbers)
	{
		for(int num : numbers)
		{
			
			System.out.print(num + " ");
		}
	}
	public static void getOdds(int[] numbers)
	{
		odds = "";
		for(int num : numbers)
		{
			if(num%2 != 0)
			{
				odds = odds + " " + num;
			}
			
		}
		System.out.println("The odd numbers are:" + odds);
	}
}