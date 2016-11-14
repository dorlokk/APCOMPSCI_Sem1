import java.util.Scanner;
public class Ex_04
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter the starting number");
		int start = kb.nextInt();
		System.out.println("Please enter the size number");
		int size = kb.nextInt();
		int[] seq = new int[size-start];
		for(int i = 0; i < seq.length; i++)
		{
			if(i == 0||i==1)
			{
				seq[i] = start;
			}
			else
			{
				seq[i] = seq[i-1] + seq[i-2];
			}
			System.out.print(seq[i] + " ");
		}
		
	}
}