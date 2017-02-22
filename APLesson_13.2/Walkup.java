import java.lang.Math.*;
import java.util.ArrayList;
public class Walkup extends Ticket
{
	private int daysLeft;
	public Walkup()
	{
		daysLeft = 0;
	}
	
	public Walkup(int dl)
	{
		daysLeft = dl;
	}
	
	public double getPrice()
	{
		return 50.00;
	}
}