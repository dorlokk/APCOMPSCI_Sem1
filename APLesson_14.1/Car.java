import java.util.Arrays;
import java.lang.Math.*;
public abstract class Car implements Location
{
	private int x;
	private int y;
	private int ID;
	public Car()
	{
		ID = (int)(Math.random() * 900000) + 100000;
	}
	public Car(int xc, int yc)
	{
		ID = (int)(Math.random() * 900000) + 100000;
	}
	public int getID()
	{
		return ID;
	}
	public abstract void move(double xc, double yc);
}