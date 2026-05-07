class LinearSearch1
{
	public static void main(String [] args)
	{
		int arr[]={5,10,2,20,3,4,30};//mixed values la irrukuratha find pana linearsearch use aguthu
		int target=10;
		LinearSearch1 l=new LinearSearch1();
		int result=l.find(arr,target);
		System.out.println(result);
	}
	
	int find(int ar[],int a)
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
}