class Overloading
{
	public static void main(String [] args)
	{
		Overloading o=new Overloading();
		int result=o.sum(20);// parameter la enakudukiramo atha vachu function run agum
		System.out.println(result);
		int res=o.sum(20,30);
		System.out.println(res);
		
		
	}
	int sum(int a,int b)
	{
		return a+b;
	}
	int sum(int a)
	{
		return a-10;
	}
}