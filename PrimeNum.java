class PrimeNum
{
	public static void main(String [] args)
	{
	   PrimeNum p=new PrimeNum();
	   p.prime(8);
	}
	void prime(int num)
	{
		boolean primenum=true;
		if(num<=1)
		{
			primenum=false;
		}
		else
		{
			for(int i=2;i<num;i++)
			{
				if(num%i==0)
				{
					primenum=false;
				}
			}
		}
		if(primenum)
		{
			System.out.println(num+ "=IT'S A PRIME NUMBER");
		}
		else
		{
			System.out.println(num+ "=IT'S NOT A PRIME NUMBER");
			
		}
	}
}