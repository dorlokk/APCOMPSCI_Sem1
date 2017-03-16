import java.util.Arrays;
import java.lang.Math.*;
public class GMC extends Car
{
	private double x;
	private double y;
	private int ID;
	public GMC()
	{
		x= 0;
		y= 0;
		
	}
	
	public GMC (double xc, double yc)
	{
		x = xc;
		y = yc;
		
	}

	public int getID()
	{
		return super.getID();
	}

	public void move(double xc, double yc)
	{
		x = x + xc;
		y = y + yc;
	}

	public double[] getLoc()
	{
		double [] location = new double[2];
		location[0] = x;
		location[1] = y;
		return location;
	}
}