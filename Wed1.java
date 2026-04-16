import java.util.Scanner;//123456789 to be the result
class Wed1
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Start Number:");
		int start=sc.nextInt();
		System.out.println("Enter The End Number:");
		int end=sc.nextInt();
		do
		{
			
		System.out.println(start);
		start++;
		}
		while (start<=end);
	}
}