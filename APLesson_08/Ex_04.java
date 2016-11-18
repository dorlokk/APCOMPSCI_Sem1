import java.util.Scanner;
public class Ex_04
{
	static String word;
	static int stop, start;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What is the word");
		word = kb.next();
		stop = word.length();
		start = 0;
		tree(word, start, stop);
		
	}
	public static void tree(String word, int start, int stop)
	{
		if (start <= stop)
		{
			System.out.printf("%10s\n", word.substring(0,start));
			start += 1;
			tree(word, start, stop);
		}
		else
		{
			System.out.println("");
		}
	}
}