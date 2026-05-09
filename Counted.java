import java.util.Scanner;
class Counted
{
	static Scanner sc = new Scanner(System.in);
     
	public static void main(String [] args)
	{
		System.out.println("ENTER THE ARRAY SIZE = ");
		int size = sc.nextInt();

		int arr[] = new int[size];

		Counted c = new Counted();

		int result = c.num(arr);

		System.out.println("THE COUNT OF 40 = " + result);
	}

	int num(int ar[])
	{
		System.out.println("ENTER START THE VALUES");
	    int start=sc.nextInt();
	    System.out.println("ENTER END THE VALUES");
	    int end=sc.nextInt();
		int count = 0;

		for(int i=start; i<end; i++)
		{
			if(ar[i] == ar[i])
			{
				count++;
			}
		}

		return count;
	}
}