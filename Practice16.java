import java.util.Scanner;
class Practice16
{
		Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
	            Practice16 p=new Practice16();
				p.menu();

	}
	void menu()
	{
		System.out.print("enter the start number:");
		int start=sc.nextInt();
		System.out.print("enter the end number:");
		int end=sc.nextInt();
		boolean result=true;
		do{
		System.out.println("1.display all between numbers");
		System.out.println("2.sum all between numbers");
		System.out.println("3.resverse all numbers");
		System.out.println("4.display only even numbers");
		System.out.println("5.exit");
		System.out.print("choose any one option:");
		int choice=sc.nextInt();
		if(choice==1)
		{
			display(start,end);
		}
		else if(choice==2)
		{
			int res=sum(start,end);
			System.out.println(res);
		}
		else if(choice==3)
		{
			reverse(start,end);
		}
		else if(choice==4)
		{
			even(start,end);
		}
		else
		{
			System.out.println("exited....");
			result=false;
		}
		}while(result);
	}
	void display(int a,int b)
	{
		for(int i=a;i<=b;i++)
		{
			System.out.println(i);
		}
	}
	int sum(int a,int b)
	{
		int sum=0;
		for(int i=a;i<=b;i++)
		{
			sum=sum+i;
		}
		return sum;
	}
	void reverse(int a,int b)
	{
		for(int i=b;i>=a;i--)
		{
			System.out.println(i);
		}
	}
	void even(int a,int b)
	{
		for(int i=a;i<=b;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);	
			}
		}
	}


}