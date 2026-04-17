import java.util.Scanner;//even odd kandpudipathu in if else
class EvenorOdd
{
	public static void main (String [] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("ENTER THE VALUE");
		int a = sc.nextInt();
		if (a % 2 == 0)
		{
			System.out.println("THE NUMBER IS A EVEN");
		}
		else
		{
			System.out.println("THE NUMBER IS A ODD");
		}
	}
}