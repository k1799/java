import java.util.Scanner;
class Highestage
{
	public static void main (String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("ENTER THE SIZE:");
		int size=sc.nextInt();
		int age[]=new int[size];
		int maximum=0;
		for (int i=0;i<age.length;i++)
		{
			System.out.println("ENTER THE"+i+"AGE");
			age[i]=sc.nextInt();
			if (age[i]>maximum)
			{
				maximum=age[i] ;
			}
		}
			System.out.println("highestage:"+maximum);	
	}
}