/*1 2 3 4//nested loop
1 2 3
1 2 
1*/
class Pattern//output ku set agura mathri condition mathanum
{
	public static void main (String [] args)
	{
		for (int i=1;i<=5;i++)
		{
			for (int j=1;j<=5-i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println(" ");
		}
	}
}