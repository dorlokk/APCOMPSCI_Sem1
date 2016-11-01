import java.util.Scanner;
public class Ex_04
{
	public static void main(String[]args)
	{
		sing("na",4);
		sing("na",4);
		sing("hey",3);
		sing("goodbye",1);
	}
	public static void sing(String song, int times)
	{
		for(int i = 0; i < times ; i++)
		{
			System.out.print(song+ " " );
		}
		System.out.println("\n");
	}
}