import java.util.Arrays;
import java.lang.Math.*;
public class Toyota extends Car
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
		location[0] =Double.parseDouble(locations[0]);
		location[1] =Double.parseDouble(locations[1]);
		
	}
}