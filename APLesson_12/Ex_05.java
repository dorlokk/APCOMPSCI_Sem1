import java.lang.Math.*;
public class Ex_05
{
	private String firstName, lastName, avatar;
	private int userID;
	public Ex_05()
	{
		firstName = "";
		lastName = "";
		avatar = "";
		userID = 0;
	}
	
	public Ex_05(String fN, String lN)
	{
		firstName = fN;
		lastName = lN;
		avatar = "Undefined";
		userID = (int)(Math.random() * 1000000) + 1;
	}
	
	public Ex_05(String fN, String lN, String a)
	{
		firstName = fN;
		lastName = lN;
		avatar = a;
		userID = (int)(Math.random() * 1000000) + 1;
	}
	
	
	
	public void setFirstName(String fN)
	{
		firstName = fN;
	}
	
	public void setLastName(String lN)
	{
		lastName = lN;
	}
	
	public void setAvatar(String a)
	{
		avatar = a;
	}
	
	public void setUserID(int ID)
	{
		userID = ID;
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public String getAvatar()
	{
		return avatar;
	}
	
	public int getUserID()
	{
		return userID;
	}
	public String toString()
	{
	   return "Customer Info...\nFirst Name: " + firstName +
							   "\nLast Name: " + lastName +
							   "\nAvatar: " + avatar +
							   "\nUser ID#: " + userID;
	}
	
	
}