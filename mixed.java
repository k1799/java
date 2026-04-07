class Mixed
{
	public static void main (String [] args)
	{
		// Arithmetic
		int a = 10;
		int b = 5;
		int c = 15;
		System.out.println (a+b);
		System.out.println (a-b);
		System.out.println (a*b);
		System.out.println (a/b);
		System.out.println (a%b);
		
		// Relation 
		System.out.println (a==b);
		System.out.println (a!=b);
		System.out.println (c<=b);
		System.out.println (c>=b);
		System.out.println (a>c);
		System.out.println (a<c);
		
		//Logical
		System.out.println (a>b && a<c);
		System.out.println (a>b || a<c);
		System.out.println (!(a>c));
	}
}