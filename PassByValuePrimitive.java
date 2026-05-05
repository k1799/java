class PassByValuePrimitive//Pass by Value (Primitive)Declare an integer variable. Pass it to a method that tries to change its value. Print the value inside the method and outside the method.
{
	public static void main(String [] args)
	{
		int a=10;
		PassByValuePrimitive p=new PassByValuePrimitive();
		System.out.println("BEFORE MEDHOD CALL="+a);
		p.change(a);
		System.out.println("AFTER MEDHOD CALL="+a);
		
	}
	void change(int a)
	{
		System.out.println("INSIDE THE METHOD BEFORE CALL:"+a);
		a=20;
		System.out.println("INSIDE THE METHOD AFTER CALL:"+a);
	}
}