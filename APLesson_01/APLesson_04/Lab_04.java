import java.util.Scanner;

public class Lab_04
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		Lesson_04 form = new Lesson_04();
		
		
		
		System.out.println("Enter item 1");
		String word1= kb.nextLine();
		System.out.println("Enter the price");
		double number1= kb.nextDouble();
		String blank1 = kb.nextLine();
		
		
		System.out.println("Enter item 2");
		String word2= kb.nextLine();
		System.out.println("Enter the price");
		double number2= kb.nextDouble();
		String blank = kb.nextLine();
		
		
		System.out.println("Enter item 3");
		String word3= kb.nextLine();
		System.out.println("Enter the price");
		double number3= kb.nextDouble();
		String blank3 = kb.nextLine();
		
		String word4 = "Subtotal";
		double number4 = number1+number2+number3;
		
		String word5 = "Tax";
		double number5 = number4*0.08;
		
		String word6 = "Total";
		double number6 = number4+number5;
		
		System.out.println("<<<<<<<<<<<<_Recipt_>>>>>>>>>>>>");
		form.format(word1, number1);
		System.out.println("\n");
		form.format(word2, number2);
		System.out.println("\n");
		form.format(word3, number3);
		System.out.println("\n");
		form.format(word4, number4);
		System.out.println("\n");
		form.format(word5, number5);
		System.out.println("\n");
		form.format(word6, number6);
		

	}
	public void format(String word, double number)
	{
		System.out.printf( "\n%10s   %5.2f", word, number);
	}
}