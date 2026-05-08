class Recursion
{
	public static void main(String [] args)
	{
		Recursion r=new Recursion();
		r.even(1);
	}
	void even(int i)
	{
		if(i<=20)
		{
		if(i%2==0)
		{
		System.out.println(i);
		}
		even(i+1);
		
		}
	}
}