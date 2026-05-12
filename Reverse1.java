class Reverse1
//Reverse The CharArray Without Scanner
{
	public static void main(String [] args)
	{
		char arr[]={'A','B','C','D','E'};
		int index=arr.length-1;
		Reverse1 r=new Reverse1();
		r.rev(arr,index);
	}
	
	void rev(char ar[],int i)
	{
		if(i>=0)
		{
			System.out.println("REVERSE LETTERS="+ar[i]);
			i--;
		  rev(ar,i);	
		}
	}
}