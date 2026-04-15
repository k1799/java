class CountNumbers
{
	public static void main(String [] args)
	{
		int num=987;
		int count=0;
		int sum=num;
		if (num==0)
		{
			count =1;
		}
		else
		{
		while (sum!=0)
		{
			sum = sum/10;
			count++;
		}
		}
		System.out.println("THE NUMBER="+num);
		System.out.println("NUMBER OF DIGITS="+count);
	}
}