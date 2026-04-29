import java.util.Scanner;
class ArrayFunction
{
	Scanner sc=new Scanner (System.in);
	public static void main(String [] args)
	{
		
		ArrayFunction a=new ArrayFunction();
		a.menu();
	}
	void menu()
	{
		System.out.print("ENTER THE ARRAY SIZE:");
		int size=sc.nextInt();
		int arr[]=new int[size];
		boolean result=true;
		do
		{
		System.out.println("1.INSERT THE VALUE");
		System.out.println("2.MAXIMUM VALUE");
		System.out.println("3.MINIMUM VALUE");
		System.out.println("4.EXIT");
		System.out.println("CHOOSE ANY ONE");
		int option=sc.nextInt();
		if(option==1)
		{
			insert(arr);
		}
		else if(option==2)
		{
			int m1=max(arr);
			System.out.println("MAXIMUM VALUE:"+m1);
		}
		else if(option==3)
		{
			int m2=min(arr);
			System.out.println("MINIMUM VALUE:"+m2);
			
		}
		else
		{
			System.out.println("EXITED....");
			result=false;
		}
	}while(result);
		
		
	}
	void insert(int ar[])
	{
		for (int i=0;i<ar.length;i++)
		{
			System.out.print("ENTER THE"+i+"VALUE:");
			ar[i]=sc.nextInt();
		}
	}
	   
	int max(int ar[])
	{
		int max=ar[0];
		for (int i=0;i<ar.length;i++)
		{
			if(ar[i]>max)
			{
			max=ar[i];
			}
		}
		return max;
	} 
	int min(int ar[])
	{
		int min=ar[0];
		for (int i=1;i<ar.length;i++)
		{
			if(ar[i]<min)
			{
			min=ar[i];
			}
		}
		return min;
	}
}