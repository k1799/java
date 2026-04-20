/*1 2 3 4//nested loop
1 2 3
1 2 
1*/
class Pattern//output ku set agura mathri condition mathanum oru sila neram
{
	public static void main (String [] args)
	{
		for (int i=4;i>=1;i--)// outer loop (rows)
		{
			for (int j=1;j<=i;j++)// inner loop (numbers)
			{
				System.out.print(j+" ");
			}
			System.out.println(" ");
		}
	}
}
