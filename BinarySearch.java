class BinarySearch
{
	public static void main(String [] args)
	{
		int arr[]={10,20,30,40,50,60,70};
		int target=70;
		BinarySearch b=new BinarySearch();
		int result=b.find(arr,target);
		System.out.println(result);
	}
	int find(int ar[],int target)
	{
		int start=0;
		int end=ar.length-1;
		while(start<=end)
		{
			int mid=(start+end)/2;
			if(ar[mid]==target)
			{
			  return mid;
			}
		    else if(ar[mid]<target)
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