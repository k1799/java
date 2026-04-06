class Swaping
{
	public static void main(String[]args)
	{
	int a = 1999;
	int b = 2012;
	int c = 2020;
	a=a+b+c;
	b=a-(b+c);
	c=a-(b+c);
	a=a-(b+c);
	System.out.println("A:"+a);
	System.out.println("B:"+b);
	System.out.println("C:"+c);
	}
}
	