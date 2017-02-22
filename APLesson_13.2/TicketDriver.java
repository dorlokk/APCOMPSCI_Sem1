import java.lang.Math.*;
import java.util.ArrayList;
public class TicketDriver
{
	public static void main(String[]args)
	{
		Walkup walk =  new Walkup(10);
		System.out.println(walk);
		Advance b4=  new Advance(10);
		System.out.println(b4);
		StudentAdvance sa =  new StudentAdvance(10);
		System.out.println(sa);
		
		
	}
}