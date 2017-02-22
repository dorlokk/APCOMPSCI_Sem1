import java.lang.Math.*;
import java.util.ArrayList;
public abstract class Toy
{
	private String name;
	private int count;
	public Toy()
	{
		name = "";
		count = 1;
	}
	
	public Toy(String name)
	{
		this.name = name;
		this.count = 1;
	}
	
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setCount(int count)
	{
		this.count = count;
	}
	
	public abstract String getType();
	
	public String getName()
	{
		return name;
	}
	
	public int getCount()
	{
		return count;
	}
	
	public String toString()
	{
	   return name + " " + count;
	
	}
	
	
}