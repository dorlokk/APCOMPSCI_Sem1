import java.util.Scanner;
public class Ex_02
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What is the first word");
		String one = kb.next();
		System.out.println("What is the second word");
		String two = kb.next();
		System.out.println("What is the third word");
		String three = kb.next();
		makeCenter(one);
		makeCenter(two);
		makeCenter(three);
	}
	public static void makeCenter(String number)
	{
		if (number.length() >= 20)
			System.out.println(number);
		else
			makeCenter(" " + number + " ");
	}
}