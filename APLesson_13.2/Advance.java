import java.lang.Math.*;
import java.util.ArrayList;
public class Advance extends Ticket
{
	private int daysLeft;
	public Advance()
	{
		super();
		daysLeft = 0;
	}
	
	public Advance(int dl)
	{
		super();
		daysLeft = dl;
	}
	
	public double getPrice()
	{
		if(daysLeft > 10)
		{
			return 30.00;
		}
		else
		{
			return 40.00;
		}
	}
}