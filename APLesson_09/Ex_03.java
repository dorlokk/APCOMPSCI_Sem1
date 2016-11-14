import java.util.Scanner;
public class Ex_03
{
	public static void main(String[]args)
	{
		int[] numbers = new int[10];
		for(int i = 0; i < numbers.length; i++)
		{
			numbers[i] = (int)(Math.random() * 100) + 1;
		}
		for (int num : numbers)
		{
			System.out.println(num);
		}
		System.out.println();
		System.out.println("The average of the above number is..." + average(numbers));
	}
	public static int average(int[] numbers)
	{
		int sum = 0;
		for(int num : numbers)
		{
			sum +=num;
		}
		return sum/10;
	}
}