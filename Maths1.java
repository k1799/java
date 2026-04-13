import java.util.Scanner;
class Maths1
{
	public static void main (String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE VALUE");
		System.out.println("ENTER THE FIRST NUMBER");
		int first=sc.nextInt();
		System.out.println("ENTER THE SECOND NUMBER");
		int second=sc.nextInt();
		System.out.println("1.ADDITION");
		System.out.println("2.SUBRACTION");
		System.out.println("3.MULTIFICATION");
		System.out.println("4.DIVISION");
		System.out.println("CHOOSE ANY ONE");
		int option=sc.nextInt();
		if (option==1)
		{
			int a = (first + second);
			System.out.println("ADDITION VALUE IS:"+a);
		}
		else if (option==2)
		{
			int b = (first - second);
			System.out.println("SUBTRACTION VALUE IS:"+b);
		}
		else if (option==3)
		{
			int c = (first * second);
			System.out.println("MULTIFICATION VALUE IS:"+c);
		}
		else 
		{
			int d = (first / second);
			System.out.println("DIVISION VALUE IS:"+d);
		}


		
	}
}