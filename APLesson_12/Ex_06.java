import java.lang.Math.*;
public class Ex_06
{
	private String manufacturer, name, category;
	private int UPC;
	private float price;
	public Ex_06()
	{
		manufacturer = "";
		name = "";
		category = "";
		UPC = 0;
		price = 0;
	}
	
	public Ex_06(String m, String n, String c, float p)
	{
		manufacturer = m;
		name = n;
		category = c;
		UPC = (int)(Math.random() * 1000000000) + 1;
		price = p;
	}
	
	
	public void setManufacturer(String m)
	{
		manufacturer = m;
	}
	
	public void setName(String n)
	{
		name = n;
	}
	
	public void setCategory(String c)
	{
		category = c;
	}
	
	public void setUPC(int u)
	{
		UPC = u;
	}
	
	public void setPrice(int p)
	{
		price = p;
	}
	
	public String getManufacturer()
	{
		return manufacturer;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getCategory()
	{
		return category;
	}
	
	public int getUPC()
	{
		return UPC;
	}
	
	public float getPrice()
	{
		return price;
	}
	public String toString()
	{
	   return "Item Info........\nManufacturer: " + manufacturer +
							   "\nName: " + name +
							   "\nCategory: " + category +
							   "\nUPC#: " + UPC +
							   "\nPrice: " + price;
	}
	
	
}