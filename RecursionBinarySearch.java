import java.util.Scanner;
class RecursionBinarySearch
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		int arr[]={5,10,20,25,30,35,40};
		System.out.print("ENTER THE KEY NUMBER=");
		int key=sc.nextInt();;
		int left=0;
		int right=arr.length-1;
		RecursionBinarySearch r=new RecursionBinarySearch();
		int result=r.find(arr,left,right,key);
		if(result==-1)
		{
		   System.out.println("ELEMENT NOT FIND INDEX="+result);	
		}
		else
		{
		System.out.println("ELEMENT FIND INDEX="+result);
		}
	}
	int find(int ar[],int left,int right,int target)
	{
		if(left>right)
		{
			return -1;
		}
		int mid=(left+right)/2;
		if(ar[mid]==target)
		{
			return mid;
		}
		if(ar[mid]<target)
		{
			return find(ar,mid+1,right,target);
		}
			return find(ar,left,mid-1,target);
		
	}
	
}