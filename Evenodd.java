import java.util.Scanner;
class Evenodd
{
	public static void main (String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number is odd or even:");
		int even = sc.nextInt();
		int odd = sc.nextInt();
		System.out.println("EVEN NUMBER IS:"+even);
		System.out.println("ODD NUMBER IS:"+odd);
	}
}