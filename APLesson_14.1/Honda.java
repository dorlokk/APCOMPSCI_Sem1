import java.util.Arrays;
import java.lang.Math.*;
public class Honda extends Car
{
	private int ID;
	private double[] location;
	public Honda ()
	{
		location = new double [2];
		
		ID = (int)(Math.random() * 900000) + 100000;
	}

	public Honda (double[] locations)
	{
		ID = (int)(Math.random() * 900000) + 100000;
		location = locations;
	}

	public int getID()
	{
		return super.getID();
	}
	
	public void move(double xc, double yc)

	{
		location[0] +=xc;
		location[1] +=yc;
	}

	public double[] getLoc()

	{
		return location;
	}
}