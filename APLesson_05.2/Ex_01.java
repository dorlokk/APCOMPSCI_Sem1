import java.util.Scanner;
public class Ex_01
{
	static Scanner kb;
	public static void main(String[]args)
	{
		kb = new Scanner(System.in);
		adventure();
	}
	public static void adventure()
	{
		
		System.out.println("You see a dragon coming towards you, do you fight or flee");
		String choice1 = kb.next();
		if(choice1.equals("fight"))
		{
			System.out.println("You have decided to fight. Do you summon a storm or a fireball");
			String choice2 = kb.next();
			if(choice2.equals("storm"))
			{
				System.out.println("You have grounded the dragon. Do you fight it with a sword or a spear");
				String choice3 = kb.next();
				if(choice3.equals("sword"))
					System.out.println("Congrats you are able to slay the dragon");
				else if(choice3.equals("spear"))
					System.out.println("The dragon is able to dodge away and kill you");
				else
					System.out.println("r");
			}
			else if(choice2.equals("fireball"))
			{
				System.out.println("The dragon simply eats the fireball and is about to use its fire breath on you. Do you run or block with your shield");
				String choice4 = kb.next();
				if(choice4.equals("run"))
					System.out.println("The dragon sets fire to the forest and you die");
				else if(choice4.equals("block"))
					System.out.println("your shield is not strong enough and you die");
				else
					System.out.println("r");
			}
			else
				System.out.println("r");
		}
		else if(choice1.equals("flee"))
		{
			System.out.println("You run to the nearby lake. Do you summon a wave or block with water ");
			String choice5 = kb.next();
			if(choice5.equals("wave"))
			{
				System.out.println("You are able to knock the dragon into the lake. Do you slay it with an icespear or freeze it");
				String choice6 = kb.next();
				if(choice6.equals("icespear"))
					System.out.println("Congrats you slayed the dragon");
				else if(choice6.equals("freeze"))
					System.out.println("The dragon breaks out and kills you");
				else
					System.out.println("r");
			}
			else if(choice5.equals("block"))
			{
				System.out.println("You are able to block the dragons fire breath. Do you fly onto its back to attack its neck or belly");
				String choice7 = kb.next();
				if(choice7.equals("neck"))
					System.out.println("The dragon dodges away and you fall to your death");
				else if(choice7.equals("belly"))
					System.out.println("You are able to stab it at its weak point and slay it");
				else
					System.out.println("r");
			}
			else
				System.out.println("r");
		}
		else
			System.out.println("r");
	}
}
