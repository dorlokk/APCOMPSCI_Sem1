import java.util.Arrays;
import java.lang.Math.*;
public abstract class Car implements Location
{
	private int x;
	private int y;
	private int ID;
	private double[] location;
	public Car()
	{
		ID = (int)(Math.random() * 900000) + 100000;
		location = new double[2];
		
	}
	public Car(int xc, int yc)
	{
		ID = (int)(Math.random() * 900000) + 100000;
	}
	public int getID()
	{
		return ID;
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