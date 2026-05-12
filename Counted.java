import java.util.Scanner;
//Count of 40 in given Array Using Scanner import java.util.Scanner; class Counted
class Counted
{
     
	public static void main(String [] args)
	{
	     Scanner sc = new Scanner(System.in);
		 
		System.out.println("ENTER THE ARRAY SIZE = ");
		int size = sc.nextInt();

		int arr[] = new int[size];
		System.out.println("ENTER THE VALUES");
		
		for(int i=0;i<arr.length;i++)
		{
			 arr[i]=sc.nextInt();
		}

		Counted c = new Counted();

		int result = c.num(arr);

		System.out.println("THE COUNT OF 40 = " + result);
	}

	int num(int ar[])
	{
		int count=0;
		for(int i=0; i<ar.length; i++)
		{
			if(ar[i] == 40)
			{
				count++;
			}
		}

		return count;
	}
}