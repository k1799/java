import java.util.Scanner;
class Numbers
{
	public static void main (String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("CHOOSE ONE OPTION :");
		System.out.println("1.Palindrome:");
		System.out.println("2.Armstrong:");
		System.out.println("3.Neon:");
		int option=sc.nextInt();
		System.out.println("ENTER THE NUMBER IS:");
		int num=sc.nextInt();
		if (option==1)
		{
			int a=num;//163
			int b=a%10;//3
			int c=a/10;//16
			int d=c%10;//6
			int e=c/10;//1
			int f=((b*100)+(d*10)+(e*1));
			boolean result = a == f ;
			System.out.println("THIS IS THE PALINDROME NUMBER:");
		}
        else 
			{
				System.out.println("THIS IS NOT PALINDROME NUMBER:");
			}		
		if (option==2)
		{
			int g=num;//151
			int h=g%10;//1
			int i=g/10;//15
			int j=i%10;//5
			int k=i/10;//1
			int l=((h*h*h)+(j*j)+(k));
		    boolean resu= g == l;
                System.out.println("THIS IS THE ARMSTRONG NUMBER:");			
		}
		else
			{
				System.out.println("THIS IS NOT ARMSTRONG NUMBER:");
			}
		if (option==3)
		{
			int r=num;//9
			int m=r*r;//9*9=81
			int n=m%10;//1
			int o=m/10;//8
			int p=n+o;
			boolean res= r==p;
			System.out.println("THIS IS THE NEON NUMBER:");
		}
		else 
		    {
				System.out.println("THIS IS NOT NEON NUMBER:");
			}
		
	}
}