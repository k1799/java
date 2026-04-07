class Palindrome
{
	public static void main(String []args)
	{
		int a=1001;
		int b=a%10;//1
		int c=a/10;//100
		int d=c%10;//0
		int e=c/10;//10
		int f=e%10;//0
		int g=e/10;//1
		int h=((b*1000)+(d*100)+(f*10)+(g*1));//(1*1000)+(0*100)+(0*10)+(1*1)
		boolean result=a==h;
		System.out.println("the given number is:"+result);
		// no palindrome number
		int i=1234;
		int j=i%10;
		int k=i/10;
		int l=k%10;
		int m=k/10;
		int n=m%10;
		int o=m/10;
		int p=((j*1000)+(l*100)+(o*10)+(h*1));
		boolean res=i==p;
		System.out.println("the given number is:"+res);
    }
}