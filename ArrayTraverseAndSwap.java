import java.util.Scanner;
class ArrayTraverseAndSwap
{
     Scanner sc=new Scanner(System.in);
     Scanner se=new Scanner(System.in);
	public static void main(String [] args)
	{
		ArrayTraverseAndSwap a=new ArrayTraverseAndSwap();
		a.menu();
	}
	void menu()
	{
		System.out.print("ENTER THE ARRAY SIZE=");
		int size=sc.nextInt();
		String ar[]=new String[size];
	   boolean result=true;
		do
		{
		System.out.println("1.INSERT:");
		System.out.println("2.TRAVERSE:");
		System.out.println("3.SWAP:");
		System.out.println("EXIT");
		System.out.println("CHOOSE ANY ONE");
		int option=sc.nextInt();
		if(option==1)
		{
			insert(ar);
		}
		else if(option==2)
		{
			traverse(ar);
		}
		else if(option==3)
		{
			swap(ar);
		}
		else
		{
			System.out.println("EXITED...");
			result=false;
		}
		}while(result);	
	}
	void insert(String ar[])
	{
		for(int i=0;i<ar.length;i++)
		{
		System.out.println("ENTER THE " +i+ "CAR:");
		ar[i]=se.nextLine();
		}
	}
	void traverse(String ar[])
	{
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]);
		}
	}
	void swap(String ar[])
	{
		String temp=ar[0];
		ar[0]=ar[1];
		ar[1]=temp;
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]);
		}
	}
}