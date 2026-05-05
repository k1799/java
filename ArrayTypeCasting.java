class ArrayTypeCasting
{
	public static void main(String [] args)
	{
	  ArrayTypeCasting a=new ArrayTypeCasting();
		int arr[]={10,20,30,40,50};
	    int result=a.sum(arr);
		System.out.println("SUM OF IS ="+result);
		a.max(arr);
	}
	int sum (int arr[])
	{
	    int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
	     return sum;
	}
	void max(int arr[])
	{
	    int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
		if(arr[i]>max)
		{
			max=arr[i];
		}
		}
		System.out.println("maximum number is="+max);
	}
}