public class Ex_04
{
	private String hair, eyes, skin;
	public Ex_04()
	{
		hair = "";
		eyes = "";
		skin = "";
	}
	
	public Ex_04(String h, String e, String s)
	{
		hair = h;
		eyes = e;
		skin = s;
	}
	
	public void setHair(String h)
	{
		hair = h;
	}
	
	public void setEyes(String e)
	{
		eyes = e;
	}
	
	public void setSkin(String s)
	{
		skin = s;
	}
	
	public String getHair()
	{
		return hair;
	}
	
	public String getEyes()
	{
		return eyes;
	}
	
	public String getSkin()
	{
		return skin;
	}
	
	
}