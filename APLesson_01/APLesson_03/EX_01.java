import java.util.Scanner;

public class EX_01
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What is your full name");
		String name = keyboard.nextLine();
		System.out.println(name + "? What a weird thing to name your child");
		System.out.println("How old are you");
		int age = keyboard.nextInt();
		System.out.println("I cant imagine being"+ age);
		System.out.println("What do you do for fun");
		String hobby = keyboard.next();
		System.out.println(hobby + "? Why would anyone do that for fun");
		System.out.println("What kind of music do you like");
		String music = keyboard.next();
		System.out.println("I guessed, only a person like you could consider" + music + "music");
		System.out.println("How many siblings do you have");
		int sib = keyboard.nextInt();
		System.out.println("Well i hope your" + sib + "siblings are better looking");
		System.out.println("What do you want to be when you grow up");
		String job = keyboard.next();
		System.out.println(job+"? Dont you think that is a bit too hard");
		
	}
}