import java.util.Scanner;
public class Ex_01
{
	public static void main(String[]args)
	{
		String[] words = new String[5];
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter 5 words");
		for(int i = 0; i < words.length; i++)
		{
			words[i] = kb.next();
		}
		for(String wrd : words)
		{
			System.out.println(wrd);
			
		}
		System.out.println();
		System.out.println("reversed...");
		reverse(words);
	}
	public static void reverse(String[] words)
	{
		for(int i = (words.length-1); i > -1; i--)
		{
			System.out.println(words[i]);
		}
	}
}