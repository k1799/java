import java.util.Arrays;
class MergeSort
{
	public static void main(String [] args)
	{
	    MergeSort m=new MergeSort();
		int arr[]={10,4,2,20,13,8,6};
        int result[]=m.divide(arr);
	    System.out.print("ASSIANTING VALUE FOR MERGESORT=");
	   for(int i=0;i<result.length;i++)
	   {
          System.out.print(result[i]+" "); 	
	   }	   
	}
	int[] divide(int ar[])
	{
		if(ar.length<=1)
		{
			return ar;
		}
		int mid=ar.length/2;
		int left[]=divide(Arrays.copyOfRange(ar,0,mid));
		int right[]=divide(Arrays.copyOfRange(ar,mid,ar.length));
		return concure(left,right);
	}
	int[] concure(int left[],int right[])
	{
		int i=0;
		int j=0;
		int k=0;
		int newarr[]=new int[left.length+right.length];
		while(i<left.length && i<right.length)
		{
			if(left[i] < right[j])
			{
				newarr[k]=left[i];
				i++;
				k++;
			}
			else
			{
				newarr[k]=right[j];
				j++;
				k++;
			}
		}
		while(i<left.length)
		{
		   newarr[k]=left[i];
				i++;
				k++;	
		}
		while(i<right.length)
		{
			newarr[k]=right[j];
				j++;
				k++;
		}
		return newarr;
	}
}