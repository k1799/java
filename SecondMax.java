class SecondMax//litreal method used
{
	public static void main (String [] args)
	{
		int size[]={10,8,20,50,40};
		int max=0;
		int secondmax=0;//"Integer.MIN_VALUE"=-2147483648 THIS LOWEST NUMBER ATHI KA PATCHAM ZERO USE PANNA KUDATHU INTHA "" IPPADI MARK PANA VALU THAN USE PANANANUM ITHU MAX KU
		for (int i=0;i<size.length;i++)
		{
			if (size[i]>max)
			{
				secondmax=max;//important line
				max=size[i];
			}
			else if (size[i]>secondmax)//ippadi poda output varum ana rendu max number irrunthuchuna else if(size[i]>secondmax && size[i] != max)nu podanum
			{
				secondmax=size[i];
			}
		}
		System.out.println("SECOND MAX:"+secondmax);
	}
}