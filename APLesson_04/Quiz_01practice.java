import java.util.Scanner;

public class Quiz_01practice
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		int wep = 45;
		System.out.println("Iron man has " + wep + " kinds of weapons in his suit");
		
		String pres = "Abraham Lincoln";
		String quote = "Whatever you are, be a good one.";
		System.out.println( pres + " once said, \" " + quote + "\""  );
		
		int h = 45;
		int w = 64;
		System.out.println("The area of your rectangle is..." + h*w);
		
		Scanner kb = new Scanner(System.in);
		System.out.println("What is your name? ");
		String answer = kb.nextLine();
		System.out.println("Is there a Mr. or Mrs. " + answer + "?");
		
		System.out.println("How many siblings do you have? ");
		int answer1 = kb.nextInt();
		System.out.println("What are their names? ");
		String answer2 = kb.nextLine();
		System.out.println("OK, which one is your favorite?");
		String answer3 = kb.nextLine();
		System.out.println("Awe! " + answer3 + " is your favorite.");

		System.out.println("This is top \n This is bottom");
		System.out.println("a   b   c\nd   e   f\ng   h   i");
	}
}