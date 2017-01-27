import java.util.Scanner;
public class Ex_04run
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the human properties");
		String hair = kb.next();
		String eyes = kb.next();
		String skin = kb.next();
		
		
		Ex_04 object = new Ex_04(hair, eyes, skin);
		
		System.out.println("Human properties");
		
		System.out.println("hair: \t" + object.getHair());
		System.out.println("eyes: \t" + object.getEyes());
		System.out.println("skin: \t" + object.getSkin());
		
		
		System.out.println("Please enter the friend properties");
		object.setHair(kb.next());
		object.setEyes(kb.next());
		object.setSkin(kb.next());
		
		
		System.out.println("Friend properties");
		System.out.println("hair: \t" + object.getHair());
		System.out.println("eyes: \t" + object.getEyes());
		System.out.println("skin: \t" + object.getSkin());

		
		
	}
}
