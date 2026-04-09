class movieticket
{
	public static void main (String [] args)
	{
		byte age = 70;
		if (age<12)
		{
			System.out.println("ticket price is 80");
		}
		else if (age >=12 && age<=59)
		{
		System.out.println ("ticket price is 150");
		}
		else 
		{
		System.out.println ("ticket price is 100");
		}
	}
}