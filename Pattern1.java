/*4 3 2 1//using nested loop
3 2 1
2 1
1*/
class Pattern1//output ku set agura mathri condition mathanum
{
	public static void main (String [] args)
	{
		for (int i=4;i>=1;i--)
		{
			for (int j=i;j>=1;j--)
			{
			System.out.print(j+" ");	
			}
			System.out.println(" ");
	    }
	}
}