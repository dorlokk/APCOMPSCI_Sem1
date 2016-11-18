import java.util.Scanner;
public class Ex_07
{
	static String z;
	public static void main(String[]args)
	{
		String[] words = new String[5];
		fillArray(words);
		System.out.println("The strings in the array are");
		printArray(words);
		System.out.println();
		System.out.println("The words with z are");
		haz(words);
		
	}
	public static void fillArray(String[] words)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter 5 words");
		
		for(int i = 0; i < words.length; i++)
		{
			words[i] = kb.next();
		}
	}
	public static void printArray(String[] words)
	{
		for(String wrd : words)
		{
			System.out.print(wrd + " ");
		}
	}
	public static void haz(String[] words)
	{
		z = "";
		for(String wrd : words)
		{
			if(wrd.indexOf("z") >= 0)
			{
				z += wrd;
			}
			
		}
		System.out.println(z);
	}
}