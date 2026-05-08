class RecursionBinary
{
	public static void main(String [] args)
	{
		int arr[]={10,20,30,40,50,60};
		int target=30;
		int left=0;
		int right=arr.length-1;
		RecursionBinary r=new RecursionBinary();
		int result=r.find(arr,target,left,right);
		System.out.print("FIND THE RECURSION BINARY INDEX="+" "+result);
	}
	int find(int ar[],int target,int left,int right)
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
		return find(ar,target,mid+1,right);
	   }
		return find(ar,target,left,mid-1);
	
	}
}