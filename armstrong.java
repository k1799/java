class Armstrong
{
	public static void main(String[]args)
	{
		int a=1634;
		int b=a%10;//4
		int c=a/10;//163
		int d=c%10;//3
		int e=c/10;//16
		int f=e%10;//6
		int g=e/10;//1
		int h=((b*b*b*b)+(d*d*d*d)+(f*f*f*f)+(g*g*g*g));//(4*4*4*4)+(3*3*3*3)+(6*6*6*6*)+(1*1*1*1)
		boolean result=a==h; 
		System.out.println("the given number is:" +result);
		// no armstrong number
		int i=1234;
		int j=i%10;
		int k=i/10;
		int l=k%10;
		int m=k/10;
		int n=m%10;
		int o=m/10;
		int p=((j*j*j*j)+(l*l*l*l)+(o*o*o*o)+(h*h*h*h));
		boolean res=i==p;
		System.out.println("the given number is:"+res);

	}
}
