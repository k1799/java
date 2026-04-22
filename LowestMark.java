class LowestMark//Litreal used
{
	public static void main (String [] args)
	{
		int size[]={300,350,400,500};
		int lowest=size[0];
		for (int i=0;i<size.length;i++)
		{
			if (size[i]<lowest)
			{
				lowest=size[i];
			}
			
			
		}System.out.println("LOWEST MARK:"+lowest);
	}
}