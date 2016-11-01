import java.util.Scanner;
public class Ex_02
{
	static String username,password,username1,password1;
	static Scanner kb;
	public static void main(String[]args)
	{
		kb = new Scanner(System.in);
		username = "guru";
		password = "lol";
		security();
	}
	public static void security()
	{
		System.out.println("What is the username");
		username1 = kb.next();
		System.out.println("What is the password");
		password1 = kb.next();
		if(password1.equals(password) && username1.equals(username))
			System.out.println("access granted");
		else {
			if (password1.equals(password))
				System.out.println("Your username is incorrect");
			else if (username1.equals(username))
				System.out.println("Your password is incorrect");
			else 
				System.out.println("Your username and password are incorrect");
			
		}
	}
}