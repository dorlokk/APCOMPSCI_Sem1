import java.util.Scanner;
public class Ex_01
{
	static String history,computer,english,biology,pe,math,physics;
	static double gpa;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What is your history letter grade");
		history = kb.next();
		System.out.println("What is your computer letter grade");
		computer = kb.next();
		System.out.println("What is your english letter grade");
		english = kb.next();
		System.out.println("What is your biology letter grade");
		biology = kb.next();
		System.out.println("What is your PE letter grade");
		pe = kb.next();
		System.out.println("What is your math letter grade");
		math = kb.next();
		System.out.println("What is your physics letter grade");
		physics = kb.next();
		gpa = (calcPoints(history) + calcPoints(computer) + calcPoints(english) + calcPoints(biology) + calcPoints(pe) + calcPoints(math) + calcPoints(physics))/7;
		System.out.println("Your GPA is " + gpa);
	}
	
	public static double calcPoints(String grade)
	{
		if (grade.equals("A"))
			return 4.0;
		if (grade.equals("B"))
			return 3.0;
		if (grade.equals("C"))
			return 2.0;
		if (grade.equals("D"))
			return 1.0;
		if (grade.equals("F"))
			return 0.0;
		else
			return 0.0;
	}
}