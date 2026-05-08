class RecursionLinear
{
	public  static void main(String [] args)
	{
		int arr[]={10,20,15,35,4,2,23};
		int target=2;
		int i=0;
		RecursionLinear r=new RecursionLinear();
		int result=r.find(arr,target,i);
		System.out.println(result);
	}
	int find(int ar[],int target,int i)
	{
		if(i>ar.length-1)
		{
			return -1;
		}
		if(ar[i]==target)
		{
			return i;
		}
		return find(ar,target,i+1);
	}
}