class ExplicitCasting//another name narrowing-big to small
{
	//1.double to integer conversion
	public static void main (String [] args)
	{
		double weights=45.69;
		int weight=(int)weights;
		System.out.println(weight);
		
		
		//2.integer to byte conversion
		int runingkm=130;
		byte distance=(byte)runingkm;
		System.out.println(distance);
	}
}