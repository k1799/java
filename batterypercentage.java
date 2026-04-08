class batterypercentage
{
	public static void main (String [] args)
	{
		int batterypercentage =100;
		if (batterypercentage>=90 && batterypercentage<=100)
		{
			System.out.println("battery full");
		}
		else if (batterypercentage>=39 && batterypercentage<=79)
		{
			System.out.println("battery normal");
		}
		else 
		{
			System.out.println("battery low");
		}
    }
}