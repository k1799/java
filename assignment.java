class Assignment
{
	public static void main(String[]args)
	{
		int a = 10;
		int b = a;
		
		System.out.println("b value is =:"+b);
		
		b = a;
		b += a;
		System.out.println("b value is =:"+b);
		
		b = a;
		b -= a;
		System.out.println("b value is =:"+b);
		
		b = a;
		b *= a;
		System.out.println("b value is =:"+b);
		
		b = a;
		b /= a;
		System.out.println("b value is =:"+b);
		
	}
	
}