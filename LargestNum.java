class LargestNum//largest number find array used
{
	public static void main (String [] args)
	{
		int arr[][]={
			{1, 8, 6},
		    {4, 2, 10}
		};
		int largest =arr[0][0];
		for (int i=0;i<arr.length;i++)//this is usig  for tables rows formation
		{
			for (int j=0;j<arr[i].length;j++)//this is usig  for tables colum formation
			{
				while(arr[i][j]>largest)
				{
					largest=arr[i][j];
				}
			}
		}
		System.out.println("LARGEST VALUE IS ="+largest);
	}
}