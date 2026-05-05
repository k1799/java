class Boxing
{
	//primitive to nonprimitive
	public static void main(String [] args)
	{
		int a=10;
		String b=Integer.toString(a);
		char c='g';
		String d=Character.toString(c);
		float e=100.69f;
		String f=Float.toString(e);
		System.out.println(b);
		System.out.println(d);
		System.out.println(f);
		//ippo ithu than output la varum ana ""-double kdation kula varum 
		int g=a+b;//nu bota answer output varthathu ena b value string la save ahiruchu
		System.out.println(g);//incompatible types: String cannot be converted to int ippadi varum.
	}
}