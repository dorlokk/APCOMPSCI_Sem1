import java.lang.Math.*;
import java.util.ArrayList;
public class StudentAdvance extends Advance
{
	private int daysLeft;
	public StudentAdvance()
	{
		super();
	}
	
	public StudentAdvance(int dl)
	{
		super(dl);
	}
	
	public double getPrice()
	{
		return super.getPrice()/2;
	}
	public String toString()
	{
		return super.toString() + "\nStudentID Required";
	}
}