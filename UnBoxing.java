class UnBoxing
{
	//non primitive to primitive
	public static void main(String [] args)
	{
		String a="100";
		int b=Integer.parseInt(a);
		
		String c="120.69f";
		float d=Float.parseFloat(c);
		
		String e="A";
		char f=e.charAt(0);//ithu mathiri character matum syntax
		
		String g="100";
		short h=Short.parseShort(g);
		
		String i="120.69";
		double j=Double.parseDouble(i);
		
		System.out.println(b);
		System.out.println(d);
		System.out.println(f);
		System.out.println(h);
		System.out.println(j);
		
		//ippo mathu natha number any mathamatics process pannalam
		System.out.println(b+h);
		System.out.println(b-h);
		System.out.println(d+j);
		System.out.println(d-j);
		
		
		
		
		
		
	}
}