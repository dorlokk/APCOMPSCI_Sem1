import java.lang.Math.*;
import java.util.ArrayList;
public class AFigure extends Toy
{
	private String name;
	private int count;
	public AFigure()
	{
		super();
	}
	
	public AFigure(String name)
	{
		super(name);
	}
	
	public String getType()
	{
		return "Action Figure";
	}
	
}