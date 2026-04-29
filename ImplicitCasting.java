class ImplicitCasting//another name widening-small to big
{
	//1.integer to double conversion
	public static void main (String [] args)
	{
		int age=25;
		double busticket=age;
		System.out.println(busticket);
		
		//2.character to integer conversion(ASCII VALUE)
		char a='B';
		int num=a;
		System.out.println(num);
	}
}