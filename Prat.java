import java.util.Scanner;
class Prat
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE VALUE:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		Prat p=new Prat();
		p.value(a,b);
		System.out.println(a-b);
		
		
	}
	void value(int a,int b)
	{
		a=10;
		b=20;
		System.out.println(a+b);
	}
}