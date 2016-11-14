import java.util.Scanner;
public class Ex_02
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
		first(words);
	}
	public static void first(String[] words)
	{
		for(String wrd : words)
		{
			System.out.println(wrd.substring(0, 1));
		}
	}
}