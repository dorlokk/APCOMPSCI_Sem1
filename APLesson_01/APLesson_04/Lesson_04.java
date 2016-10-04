public class Lesson_04
{
	public static void main(String[]args)
	{
		Lesson_04 form = new Lesson_04();
		String word1 = "fsadkajk";
		double number1 =7445246.4464845;
		
		form.format(word1, number1);
	}
	
	public void format(String word, double number)
	{
		System.out.printf("%10s  %10.2f", word, number);
	}
}