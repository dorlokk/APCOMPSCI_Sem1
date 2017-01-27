import java.lang.Math.*;
public class Ex_02
{
	private int xOne, yOne, xTwo, yTwo;
	private double distance;
	
	public Ex_02()
	{
		xOne = 0;
		yOne = 0;
		xTwo = 0;
		yTwo = 0;
		distance = 0;
	}
	
	public Ex_02(int xO, int yO, int xT, int yT)
	{
		xOne = xO;
		yOne = yO;
		xTwo = xT;
		yTwo = yT;
		distance = 0;
	}
	
	public void setxOne(int xO)
	{
		xOne = xO;
	}
	
	public void setyOne(int yO)
	{
		yOne = yO;
	}
	
	public void setxTwo(int xT)
	{
		xTwo = xT;
	}
	
	public void setyTwo(int yT)
	{
		yTwo = yT;
	}
	
	public int getxOne()
	{
		return xOne;
	}
	
	public int getyOne()
	{
		return yOne;
	}
	
	public int getxTwo()
	{
		return xTwo;
	}
	
	public int getyTwo()
	{
		return yTwo;
	}
	
	public double getDist()
	{
		distance = Math.sqrt((xTwo-xOne)*(xTwo-xOne) + (yTwo-yOne)*(yTwo-yOne));
		return distance;
	}
}