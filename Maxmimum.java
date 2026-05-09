import java.util.Scanner;
class Maxmimum
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String [] args)
	{
		System.out.print("ENTER THR ARRAY SIZE=");
		int size=sc.nextInt();
		int arr[]=new int[size];
		Maxmimum m=new Maxmimum();
		m.insert(arr);
		m.display(arr);
		int result=m.value(arr);
		System.out.println("MAXIMUM VALUE"+result);
	}
	void insert(int ar[])
	{
		for(int i=0;i<ar.length;i++)
		{
		System.out.print("ENTER THE VALUE=");
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
	int value(int ar[])
	{
	    int max=0;
		
		for(int i=0;i<ar.length;i++)
		{
		 if(ar[i]>max)
		 {
			 max=ar[i];
		 }
		}
		
		return max;
	}
}