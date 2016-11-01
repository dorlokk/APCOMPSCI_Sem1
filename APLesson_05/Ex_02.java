import java.util.Scanner;
public class Ex_02
{
	static String item1,item2,item3,item4;
	static double price1,price2,price3,price4,pricet,pricea,tax,pricetotal;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What are the 4 items");
		item1 = kb.nextLine();
		item2 = kb.nextLine();
		item3 = kb.nextLine();
		item4 = kb.nextLine();
		System.out.println("What are thier prices respectivly");
		price1 = kb.nextDouble();
		price2 = kb.nextDouble();
		price3 = kb.nextDouble();
		price4 = kb.nextDouble();
		pricet = price1 + price2 + price3 +price4;
		discount();
		tax = pricea*0.08;
		pricetotal = pricea + tax;
		format();
		
	}
	public static void discount()
	{
		if (pricet >= 2000)
		{
			pricea = pricet*0.85; 
		}
		if (pricet < 2000)
		{
			pricea = pricet;
		}
	}
	public static void format()
	{
		System.out.println("<<<<<<<<<<<<Reciept>>>>>>>>>>>>>");
		System.out.println(item1 +  "..." + price1);
		System.out.println(item2 +  "..." + price2);
		System.out.println(item3 +  "..." + price3);
		System.out.println(item4 +  "..." + price4);
		System.out.println("subtotal ... " + pricet );
		System.out.println("discount price ... " + pricea);
		System.out.println("total price ... " + pricetotal);
		System.out.println("Thank you for throwing money at us");
	}
}