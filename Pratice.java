import java.util.Scanner;
class Pratice
{
	Scanner sc=new Scanner (System.in);
	public static void main (String [] args)
	{
		Pratice p=new Pratice();//classname nickname=new classname
		p.menu();//menu va call panuram
	}
	void menu()
	{
		System.out.print("ENTER THE START NUMBER:");
		int start=sc.nextInt();
		System.out.print("ENTER THE END NUMBER:");
		int end=sc.nextInt();
		boolean result=true;
		do
		{
		System.out.println("1.DISPLAY ALL NUMBERS");
		System.out.println("2.ALL NUMBERS SHOW IN REVERSE");
		System.out.println("3.SUM ALL NUMBERS");
		System.out.println("4.DISPLAY EVEN NUMBERS ONLY");
		System.out.println("5.EXIT");
		System.out.println("CHOOSE ANY ONE");
		int option=sc.nextInt();
		if (option==1)
		{
			display(start,end);//non static name matum kupita podhum
		}
		else if (option==2)
		{
			reverse(start,end);
		}
		else if (option==3)
		{
			sum(start,end);
			System.out.println(sum);
		}
		else if (option==4)
		{
			even(start,end);
		}
		else
		{
			System.out.println("EXITED...");
			result=false;
		}
		}while(result);
		
		
	}
	void display(int start,int end)
	{
		for (int i=start;i<=end;i++)
		{
			System.out.println(i);
		}
	}
	void reverse(int start,int end)
	{
		for (int i=end;i>=start;i--)
		{
			System.out.println(i);
		}
	}
	    int sum=0;
	int sum (int start,int end)
	{
		for (int i=start;i<=end;i++)
		{
			sum=sum+i;
			
		}
		return sum;
	}
	void even(int start,int end)
	{
		for (int i=start;i<=end;i++)
		{
			if (i%2==0)
			{
				System.out.println(i);
			}
		}
	}
}