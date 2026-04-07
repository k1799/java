class Neon
{
	public static void main (String[]args)
	{
		int a=9;
		int b=a*a;// 9*9=81
		int c=b%10;//1
		int d=b/10;//8
		int e=c+d;// 8+1=9
		boolean result=a==e;
		System.out.println("the given nunmer is:"+result);
		// no neon number
		int f=8;
		int g=f*f;
		int h=g%10;
		int i=g/10;
		int j=h+i;
		boolean res=f==j;
		System.out.println("the given nunmer is:"+res);
	}
	
	
}