class Tuesday2
{
	public static void main(String[] args)
	{
		int a=10;
		int b=5;
		Tuesday2 t2=new Tuesday2();
		t2.sum(a,b);
		t2.multiply(a,b);
		a=100;
		b=50;
		t2.sol(a,b);
		System.out.println(a-b);

	}
	void sum(int a,int b)
	{
		System.out.println(a+b);
	}
	void multiply(int a,int b)
	{
		a=50;
		System.out.println(a*b);
	}
	void sol(int a,int b)
	{
		System.out.println(a+b);
		
	}

}