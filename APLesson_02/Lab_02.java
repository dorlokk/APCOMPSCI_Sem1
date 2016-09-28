public class Lab_02
{
	public static void main(String[]args)
	{
		int x = 8;
		int y = 5;
		int mult = x * y;
		System.out.println("The product of " + x + " times " + y + " is " + mult);
		
		String name = "Addi Guru";
		String address = "Torrey Pines High School";
		String city = "San Diego, CA";
		String zip = "10101";
		System.out.println(name + "\n" +address+ "\n" + city + " " + zip);
		
		int a = 1;
		int b = 2;
		int c = 3;
		int ab = a*b;
		int ac = a*c;
		int bc = b*c;
		int area = (2*ab)+(2*ac)+(2*bc);
		System.out.println("The surface area of the rectangle is " + area);
	}
}