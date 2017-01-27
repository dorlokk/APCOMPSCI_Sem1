public class Ex_03
{
	private String paint, interior, engine, tires;
	public Ex_03()
	{
		paint = "";
		interior = "";
		engine = "";
		tires = "";
	}
	
	public Ex_03(String p, String i, String e, String t)
	{
		paint = p;
		interior = i;
		engine = e;
		tires = t;
	}
	
	public void setPaint(String p)
	{
		paint = p;
	}
	
	public void setInterior(String i)
	{
		interior = i;
	}
	
	public void setEngine(String e)
	{
		engine = e;
	}
	
	public void setTires(String t)
	{
		tires = t;
	}
	
	public String getPaint()
	{
		return paint;
	}
	
	public String getInterior()
	{
		return interior;
	}
	
	public String getEngine()
	{
		return engine;
	}
	
	public String getTires()
	{
		return tires;
	}
	
}