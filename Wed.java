import java.util.Scanner;//even number kandupedika scanner and loop use pani
class Wed
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Start Number:");
		int start=sc.nextInt();
		System.out.println("Enter The End Number:");
		int end=sc.nextInt();
		for(int i=start;i<=end;i++)
		{
			if ( i % 2 == 0)
			{
		      System.out.println("The Even Number Is:"+i);	
			}
			else
			{
		      System.out.println("The odd Number Is:"+i);	
				
			}
		}
	}
}