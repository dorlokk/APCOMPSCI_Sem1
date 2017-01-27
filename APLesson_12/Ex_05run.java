import java.util.Scanner;
public class Ex_05run
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the user properties");
		String firstName = kb.next();
		String lastName = kb.next();
		
		
		System.out.println("Would you like to have an avatar");
		String Avatar = kb.next();
		
		if(Avatar.equals("n"))
		{
			Ex_05 user1 = new Ex_05 (firstName, lastName, "Undefined");
			System.out.println (user1);
		}
		
		if (Avatar.equals("y"))
		{
			System.out.println("What is your username");
			String publicAvatar = kb.next();
			Ex_05  user2 = new Ex_05 (firstName, lastName, publicAvatar);
			System.out.println (user2);
		}
		
		
	}
}
