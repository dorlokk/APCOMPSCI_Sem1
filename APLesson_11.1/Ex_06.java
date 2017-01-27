import java.util.Random;
import java.util.Scanner;
public class Ex_06
{
	static int healthCount;
	static int HEALTHLOAD = 6;
	static String[] health;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		Random rand = new Random();
		String turn = "";
		int damage = 0;
		int amount = 0;
		healthCount = 6;
		health = new String[HEALTHLOAD];
		
		while(!turn.equals("Q") && healthCount > 0)
		{
			System.out.println("Your turn! Hit Enter when ready: ");
			turn = kb.nextLine();
			damage =  rand.nextInt(2) + 1;
			amount =  rand.nextInt(6) + 1;
			
			System.out.println(takeDamage(damage, amount));
			printClip();
		}
		System.out.println("You died!!!");
	}
	public static String takeDamage(int damage, int amount)
	{
		if(damage == 1)
		{
			healthCount = healthCount - amount;
			return "taking " + amount + " damage";
		}
		else
		{
			if(healthCount + amount < HEALTHLOAD)
			{
				healthCount = healthCount + amount;
			}
			else
			{
				healthCount = HEALTHLOAD;
			}
		}
		return "Power Up " + amount;
	}
	public static void printClip()
	{
		String output = "";
		output += "Health: " + "		";
		for(int i = 0; i <healthCount ; i++ )
		{
			if(i < healthCount)
			{
				health[i] = "@";
				output = output +  health[i];
				
			}
			else
			{
				health[i] = "[]";
				output = output + health[i];
			}
		}
		System.out.println(output);
	}
}