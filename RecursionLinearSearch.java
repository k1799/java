import java.util.Scanner;
class RecursionLinearSearch
{
		static Scanner sc=new Scanner(System.in);
	public static void main(String [] args)
	{
		System.out.print("ENTER THE ARRAY SIZE:");
		int size=sc.nextInt();
		int arr[]=new int[size];
		RecursionLinearSearch r=new RecursionLinearSearch();
		r.insert(arr,0);
		r.display(arr,0);
		System.out.print("ENTER THE KEY NUMBER:");
		int key=sc.nextInt();
		int result=r.find(arr,0,key);
		System.out.println(result);
	}
	void insert(int ar[],int i)
	{
		if(i<ar.length)
		{
			System.out.print("ENTER THE " + i + "VALUE = ");
			ar[i]=sc.nextInt();
			insert(ar,i+1);
			
		}
	}
	void display(int ar[],int i)
	{
		if(i<ar.length)
		{
		     System.out.println("DISPLAY THE ARRAY VALUE ="+" "+ ar[i]);
			display(ar,i+1);
			
		}
	}
	int find(int ar[],int i,int target)
	{
		if(i>=ar.length-1)
		{
			return -1;
		}
		if(ar[i]==target)
		{
			return i;
		}
			return find(ar,i+1,target);
		
	}
	
}