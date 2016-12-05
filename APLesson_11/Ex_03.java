import java.util.Random;
public class Ex_03
{
	public static void main(String[]args)
	{
		Random rn = new Random();
		String[][]xAndo = new String [3][3];
		for(int i = 0; i < xAndo.length; i++)
		{
			for(int j = 0; j < xAndo[i].length; j++)
			{
				int pick = rn.nextInt(2)+1;
				if(pick == 1)
				{
					xAndo[i][j] = "x";
				}
				if(pick == 2)
				{
					xAndo[i][j] = "o";
					
				}
				System.out.print(xAndo[i][j] + "\t");
			}
			System.out.println();
		}
		
	}
}