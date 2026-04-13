import java.util.Scanner;
class PositiveNegative
{
	public static void main (String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the numbers:");
		int num = sc.nextInt();
		if (num>0)
		{
		System.out.println("POSSITIVE NUMBER:"+num);
		}
		else if (num<0)
		{
		System.out.println("NEGATIVE NUMBER:"+num);
		}
		else
		{
			System.out.println("ZERO IS A NUTRAL VALUE");
		}
	}
}