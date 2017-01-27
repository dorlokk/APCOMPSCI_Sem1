import java.util.Random;
import java.util.Scanner;
public class Ex_05
{
	static int bulletCount;
	static int CLIPSIZE = 16;
	static int shotCount;
	static String[] clip;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		bulletCount = 96;
		shotCount = 0;
		clip = new String[CLIPSIZE];
		
		resetClip();
		
		while(bulletCount > 0 || shotCount > 0)
		{
			System.out.println("Will you shoot's' or will you reload'r'");
			String action = kb.next();
			if(action.equals("r"))
			{
				reload();
			}
			else
			{
				System.out.println(shoot());
			}
			printClip();
		}
		System.out.println("Out of Bullets!!!");
	}
	public static void resetClip()
	{
		for(int i = 0; i < clip.length; i++)
		{
			clip[i] = "[]";
		}
	}
	public static String shoot()
	{
		if(shotCount > 0)
		{
			clip[shotCount-1] = "[]";
			shotCount= shotCount-1;
			return "Boom!!!";
		}
		else 
		{
			return "Reload!!!";
		}
	}
	public static void reload()
	{
		if(bulletCount >= CLIPSIZE)
		{
			bulletCount = bulletCount-CLIPSIZE;
			shotCount = CLIPSIZE;
		}
		else
		{
			shotCount = bulletCount;
			bulletCount = 0;
		}
		resetClip();
		for(int i = 0; i <shotCount; i++)
		{
			clip[i] = " * ";
		}
	}
	public static void printClip()
	{
		String output = "";
		output += "Bullets:" + "	" + bulletCount + "\n" + "Clip:" + "	";
		for(int i = 0; i < CLIPSIZE; i++)
		{
			output = output + clip[i];
		}
		System.out.println(output);
	}
	
}