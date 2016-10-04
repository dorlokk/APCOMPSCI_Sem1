import java.util.Scanner;

public class Ex_02
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		Ex_02 form = new Ex_02();
		
		
		
		System.out.println("Enter your first name");
		String word1= kb.next();
		System.out.println("Enter your last name");
		String word2= kb.next();
		System.out.println("Enter your title");
		String word3= kb.next();
		String blank = kb.nextLine();
		System.out.println("Enter the school");
		String word4= kb.nextLine();
		System.out.println("Enter the school years that you will be attending ex 2016-17");
		String word5 = kb.nextLine();
		System.out.println("Enter your subject");
		String word6 = kb.nextLine();
		
		
		System.out.println("**************************************");
		form.format(word4, word5);
		form.format(word1, word2);
		form.format(word3, word6);
		System.out.println("**************************************");
	}
	public void format(String word, String word1)
	{
		//System.out.println ("\n");
		System.out.printf( "\n%15s   %15s", word, word1);
	}
}