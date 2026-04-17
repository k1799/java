class Palin//using loops
{
	public static void main (String [] args)
	{
		int a=151;
		int temp=a;
		int rev=0;
		int sum=0;
		while (a>0)
		{
			rev=a%10;
			sum=(sum*10)+rev; 
			a=a/10;
		}
		if (temp==sum)
		{
			System.out.println("IT IS A PALINDROME NUMBER:"+sum);
		}
		else
		{
			System.out.println("IT IS A NOT PALINDROME NUMBER:"+sum);
			
		}
		
	}
}