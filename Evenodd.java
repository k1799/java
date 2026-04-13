import java.util.Scanner;
class Evenodd
{
	public static void main (String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number IS:");
		int num = sc.nextInt();
		if ( num % 2 == 0 )
		{
		System.out.println("EVEN NUMBER IS:"+num);
	    }
		else
		{
		System.out.println("ODD NUMBER IS:"+num);
		}
	}
}