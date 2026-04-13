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
			int a=num;
			int b=a%10;
			int c=a/10;
			int d=c%10;
			int e=c/10;
			int f=((c*100)+(d*10)+(e*1));
			boolean result = a == f ;
			System.out.println("THIS IS THE PALINDROME NUMBER:");
			if (option==1)
			{
				int result = a != f;
				System.out.println("THIS IS NOT PALINDROME NUMBER:");
			}
			
		else if (option==2)
		{
			int g=num;
			int h=g%10;
			int i=g/10;
			int j=i%10;
			int k=i/10;
			int l=((i*i*i)+(j*j)+(e));
			System.out.println("THIS IS THE ARMSTRONG NUMBER:");
		    boolean resu= g == l;
             if (option==2)
			{
				int resu= g != l;
				System.out.println("THIS IS NOT ARMSTRONG NUMBER:");
			}			
		}
		else if (option==3)
		{
			int r=num;
			int m=r*r;
			int n=m%10;
			int o=m/10;
			int p=n+o;
			boolean res= r != p;
			System.out.println("THIS IS THE NEON NUMBER:");
			 if (option==3)
			{
				int res= r != f;
				System.out.println("THIS IS NOT NEON NUMBER:");
			}
		}
		}
	}
}