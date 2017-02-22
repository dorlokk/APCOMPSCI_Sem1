import java.lang.Math.*;
import java.util.ArrayList;
public class Car extends Toy
{
	private String name;
	private int count;
	public Car()
	{
		super();
	}
	
	public Car(String name)
	{
		super(name);
	}
	
	public String getType()
	{
		return "Car";
	}

}