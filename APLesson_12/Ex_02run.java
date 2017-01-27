import java.util.Scanner;
public class Ex_02run
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What is x1, y1, x2, y2");
		int xO= kb.nextInt();
		int yO= kb.nextInt();
		int xT= kb.nextInt();
		int yT= kb.nextInt();
		
		Ex_02 object1 = new Ex_02(xO, yO, xT, yT);
		
		System.out.println("The distance between (" + object1.getxOne() + "," + object1.getyOne() + ") and (" + object1.getxTwo() + "," + object1.getyTwo() + ") is " + object1.getDist());
		
		object1.setxOne(5);
		object1.setyOne(5);
		object1.setxTwo(10);
		object1.setyTwo(10);
		
		System.out.println("The distance between (" + object1.getxOne() + "," + object1.getyOne() + ") and (" + object1.getxTwo() + "," + object1.getyTwo() + ") is " + object1.getDist());
		
	}
	
}