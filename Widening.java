class Widening
{
	//byte(1 byte)-short(2 byte)-char(2 byte)-int(4 byte)-long(8 byte)-float(4 byte)-double(8 byte).
	public static void main(String [] args)
	{
		byte a=10;
		int b=a;
		System.out.println(b);
		
		float g=120.62f;
		double d=g;
		System.out.println(d);
		
		
		int e=100;
		float f=e;
		System.out.println(f);
		
		
	}
	
}