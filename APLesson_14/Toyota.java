import java.util.Arrays;
import java.lang.Math.*;
public class Toyota implements Location
{
	private double[] location;
	private int ID;
	public Toyota ()
	{
		location = new double[2];
		ID = (int)(Math.random() * 900000) + 100000;
	}
	
	public Toyota (String z)
	{
		ID = (int)(Math.random() * 900000) + 100000;
		location = new double[2];
		String[] locations = z.split(", ");
		location[0] = Double.parseDouble(locations[0]);
		location[1] = Double.parseDouble(locations[1]);
		
	}

	public int getID()
	{
		return ID;
	}

	public void move(int xc, int yc)
	{
		location[0] += xc;
		location[1] += yc;
	}
	public double[] getLoc()
	{

		return location;
	}
}