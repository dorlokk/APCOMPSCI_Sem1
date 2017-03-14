import java.util.Arrays;
import java.lang.Math.*;
public class GMC implements Location
{
	private int x;
	private int y;
	private int ID;
	public GMC()
	{
		x= 0;
		y= 0;
		ID = (int)(Math.random() * 900000) + 100000;
	}
	
	public GMC (int xc, int yc)
	{
		x = xc;
		y = yc;
		ID = (int)(Math.random() * 900000) + 100000;
	}

	public int getID()
	{
		return ID;
	}

	public void move(int xc, int yc)
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