import java.util.Scanner;
public class Ex_04
{
	static double r;
	static double calcAreaa;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("what is the radi length?");
		r = kb.nextDouble();
		calcArea();
		print();
		
	}
	
	public static void calcArea()
	{

		calcAreaa =  Math.PI*(r*r);
		
	}
	
	public static void print()
	{
		System.out.printf("The  Area of a circle with radius " + r + " is " + calcAreaa); 
	}
}




//Four score and seven years ago, Addi and Jodie had met in Nelson's class of 2020. They had never met before, unless they talked at Science Fair. Jodie had no friends in English class, while Addi was very loud in his corner. Her first friend was CODYYYYYYYY, the cat and Edward. They both hated her because she condonded falling off roofs. The tomato sauce propoganda video was great. As Addi went to the restroom, Jodie was typing out a story, rather a fanfiction of Kuodukula.



