import java.util.Scanner;
class PositiveNegative
{
	public static void main (String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the numbers:");
		int positive = sc.nextInt();
		int negative = sc.nextInt();
		System.out.println("POSSITIVE NUMBER:"+positive);
		System.out.println("NEGATIVE NUMBER:"+negative);
	}
}