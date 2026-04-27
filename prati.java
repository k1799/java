class prati
{
	public static void main (String [] args)
	{
		prati p=new prati();
		p.displayallnumbers(20,30);
	}
	void displayallnumbers(int start,int end)
	{
		for (int i=start;i<end;i++)
		{
			System.out.println(i);
		}
	}
}