import java.util.Scanner;
class PrimeNumber
{
	public static void main (String [] args)
	{
		PrimeNumber f1=new PrimeNumber();
		Scanner sc=new Scanner(System.in);
		System.out.print("ENTER THE NUMBER:");
		int num=sc.nextInt();
		if (f1.prime(num))
		{
			System.out.println(num+" is a prime number");
		}
		else
		{
			System.out.println(num+" is a not prime number");	
		}
		
	}
	boolean prime(int n)
	{
		if (n<=1)
		{
			return false;
		}
		for (int i=2;i<=n/2;i++)
		{
			if (n%i==0)
			{
				return false;
			}
		}
		return true;
	}
}