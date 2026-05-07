import java.util.Scanner;
class Training
{
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String [] args)
	{
		System.out.println("ENTER THE SIZE");
		int size=sc.nextInt();
		int ar[]=new int[size];
		boolean result=true;
		do
		{
		System.out.println("1.INSERT");
		System.out.println("2.DISPLAY");
		System.out.println("EXIT");
		
		
		int option=sc.nextInt();
		
		Training t=new Training();
		if(option==1)
		{
		t.insert(ar);
		}
		else if(option==2)
		{
			t.display(ar);
		}
		else
		{
			System.out.println("exit");
			result=false;
		}
		}while(result);
	}
	void insert(int ar[])
	{
		for(int i=0;i<ar.length;i++)
		{
		System.out.println("ENTER THE VALUE");
		ar[i]=sc.nextInt();
		}
	}
	void display(int ar[])
	{
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]);
		}
	}
}