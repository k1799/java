class Bubblesort
{
	public static void main(String [] args)
	{
		int arr[]={40,20,10,5,15,4,25};
		Bubblesort b=new Bubblesort();
		b.assianting(arr);
		System.out.println("ASSIANTING VALUE");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(" "+arr[i]);
		}
		b.disanting(arr);
		System.out.println("DISIANTING VALUE");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(" "+arr[i]);
		}
	}
	void assianting(int ar[])
	{
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar.length-1;j++)
			{
				if(ar[j]>ar[j+1])
				{
					int temp=ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=temp;
				}
			}
		}
	}
	void disanting(int ar[])
	{
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar.length-1;j++)
			{
				if(ar[j]<ar[j+1])
				{
					int temp=ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=temp;
				}
			}
		}
	}
}