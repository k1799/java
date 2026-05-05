class PassByValue
{
	public static void main(String [] args)
	{
		int a=10;
		int b=20;
		PassByValue p=new PassByValue();
		System.out.println(a+b);
		p.display(a,b);
		System.out.println(a*b);
		
	}
	void display(int a,int b)
	{
		a=30;
		b=40;
		System.out.println(a+b);
	}
}