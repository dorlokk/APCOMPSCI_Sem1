import java.util.Random;
public class Ex_01
{
	public static void main(String[]args)
	{
		Random rn = new Random();
		int[][]nums = new int [4][4];
		for(int i = 0; i < nums.length; i++)
		{
			for(int j = 0; j < nums.length; j++)
			{
				nums[i][j] = rn.nextInt(10) + 1;
			}
		}
		for(int i = 0; i < nums.length; i++)
		{
			for(int j = 0; j < nums.length; j++)
			{
				System.out.print(nums[i][j] + "\t");
			}
			System.out.println();
		}
	}
}