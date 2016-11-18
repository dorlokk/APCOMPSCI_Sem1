import java.util.Scanner;
public class Ex_06
{
	static int max;
	public static void main(String[]args)
	{
		int[] numbers = new int[10];
		fillArray(numbers);
		System.out.println("The numbers in the array are");
		printArray(numbers);
		System.out.println(" ");
		System.out.println(" ");
		getBiggest(numbers);
		
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
	public static void getBiggest(int[] numbers)
	{
		max = 0;
		for(int num : numbers)
		{
			if(num > max)
			{
				max = num;
			}
			
		}
		System.out.println("The biggest number is " + max);
	}
}