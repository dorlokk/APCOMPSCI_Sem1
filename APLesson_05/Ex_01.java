import java.util.Random;
public class Ex_01
{
	static int player,computer;
	public static void main(String[]args)
	{
		Random rand = new Random();
		player = rand.nextInt(7);
		computer = rand.nextInt(7);
		System.out.println("player rolled a " + player);
		System.out.println("computer rolled a " + computer);
		rolldice();
	}
	
	public static void rolldice()
	{
		if (player > computer)
		{
			System.out.println("player wins");
		}
		if (player < computer)
		{
			System.out.println("computer wins");
		}
		if (player == computer)
		{
			System.out.println("tie");
		}
	}
}