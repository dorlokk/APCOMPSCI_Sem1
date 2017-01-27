import java.util.Scanner;
public class Ex_01run
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What is the distance, hours, and minutes");
		int d = kb.nextInt();
		int h = kb.nextInt();
		int m = kb.nextInt();
		
		Ex_01 object1 = new Ex_01(d, h, m);
		
		System.out.println(object1.getDistance() + " miles in " + object1.getHours() + " hours and " + object1.getMinutes() + " minutes = " + object1.getMPH() + " MPH");
		
		object1.setDistance(10);
		object1.setHours(10);
		object1.setMinutes(10);
		
		System.out.println(object1.getDistance() + " miles in " + object1.getHours() + " hours and " + object1.getMinutes() + " minutes = " + object1.getMPH() + " MPH");
		
	}
	
}