import java.util.Scanner;
class LinearAndBinary
{
	Scanner sc=new Scanner(System.in);
	public static void main(String [] args)
	{
		LinearAndBinary l=new LinearAndBinary();
		l.menu();
	}
	void menu()
	{
		System.out.print("ENTER THE SIZE:");
		int size=sc.nextInt();
		int arr[]=new int[size];
		boolean results=true;
		do
		{
		System.out.println("1.INSERT ELEMENTS");
		System.out.println("2.DISPLAY ELEMENTS");
		System.out.println("3.LINEAR SEARCH");
		System.out.println("4.BINARY SEARCH");
		System.out.println("CHOOSE ANY ONE");
		int option=sc.nextInt();
		
		if(option==1)
		{
			insert(arr);
		}
		else if(option==2)
		{
			display(arr);
		}
		else if(option==3)
		{
			System.out.print("ENTER THE LINEAR TARGET VALUE:");
		    int target=sc.nextInt();
			int res=search(arr,target);
			System.out.println("ELEMENT FOUND AT INDEX=" + res);
			if(res==-1)
			{
				System.out.println("ELEMENT NOT FOUND");
			}
		}
		else if(option==4)
		{
			System.out.print("ENTER THE BINARY FIND VALUE:");
	        int find=sc.nextInt();
			int result=search(arr,find);
			System.out.println("ELEMENT FOUND AT INDEX=" + result);
			if(result==-1)
			{
				System.out.println("ELEMENT NOT FOUND");
			}
		}
		else
        {
			System.out.println("EXITED...");
			 results=false;
		}	
		}while(results);		
	}
	void insert(int ar[])
	{
		System.out.println("ENTER THE VALUE");
		for(int i=0;i<ar.length;i++)
		{
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
	int search(int ar[],int a)
	{
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]==a)
			{
			   return i;
			}
		}
		return -1;
	}
	int searched(int ar[],int a)
	{
		int start=0;
		int end=ar.length-1;
		while(start<=end)
		{
			int mid=(start+end)/2;
			if(ar[mid]==a)
			{
				return mid;
			}
			else if(ar[mid]<a)
			{
				start=mid+1;
			}
			else 
			{
				end=mid-1;
			}
		}
			return -1;
		
	}
	
}
