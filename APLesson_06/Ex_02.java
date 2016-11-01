import java.util.Scanner;
public class Ex_02
{
	static int facts,numero;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Print da numero");
		numero = kb.nextInt();
		facts = 1;
		for(int i = 1; i <= numero; i++)
		{
			facts = i * facts;
		}
		System.out.println(facts);
	}
}