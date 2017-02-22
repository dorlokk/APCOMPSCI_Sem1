import java.lang.Math.*;
import java.util.ArrayList;
public abstract class Ticket
{
	private int serialNo;
	
	public Ticket()
	{
		serialNo = (int)(Math.random() * 900000) + 1000000;
	}
	
	public abstract double getPrice();
	
	public int getSerialNo()
	{
		return serialNo;
	}
	
	public String toString()
	{
		return  "Price: " + getPrice() +
				"\nSerial #: " + getSerialNo();
	}
}