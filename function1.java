class Function1
{
	public static void main (String [] args)
	{
		Function1 f1=new Function1();//main functional ithu mathiri than pannanum inimal main block kila than matha thellam varum.
		int result=f1.sum();
		System.out.println(result);
		String name=f1.name("Kannan");
		System.out.println(name);
		System.out.println(f1.multiply(1,5,2));//ippadi um kodukalam System.out .print()kulya kodukalam.
	}
	//with return type no argumentorparameter define
	int sum()
	{
		System.out.println("Welcome");
		int result=10+50;
		return result;
	}
	//with return type single parameter define
	String name(String name)
	{
		return name;
	}
	//with return type multiply parameter define
	int multiply(int a,int b,int c)
	{
		int res=a*b*c;
		return res;
	}
	
}