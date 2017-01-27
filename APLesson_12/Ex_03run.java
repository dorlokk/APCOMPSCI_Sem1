import java.util.Scanner;
public class Ex_03run
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the car properties");
		String paint = kb.next();
		String interior = kb.next();
		String engine = kb.next();
		String tires = kb.next();
		
		Ex_03 object = new Ex_03(paint, interior, engine, tires);
		
		System.out.println("The vehicle is ready");
		
		System.out.println("Paint: \t" + object.getPaint());
		System.out.println("Interior: \t" + object.getInterior());
		System.out.println("Engine: \t" + object.getEngine());
		System.out.println("Tires: \t" + object.getTires());
		
		System.out.println("Please enter the properties");
		object.setPaint(kb.next());
		object.setInterior(kb.next());
		object.setEngine(kb.next());
		object.setTires(kb.next());
		
		System.out.println("The vehicle is ready");
		System.out.println("Paint: \t" + object.getPaint());
		System.out.println("Interior: \t" + object.getInterior());
		System.out.println("Engine: \t" + object.getEngine());
		System.out.println("Tires: \t" + object.getTires());
		
		
	}
}
