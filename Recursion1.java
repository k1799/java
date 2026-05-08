class Recursion1
{
	public static void main(String [] args)
	{
		int ar[]={10,20,30,40,50};
	    int i=ar.length-1;
        Recursion1 r=new Recursion1();
		r.reverse(ar,i);
		
	}
	void reverse(int ar[],int i)
	{
		if(ar[i]>=0)
		{
			System.out.println(ar[i]);
		   i--;
			reverse(ar,i);
		}
	}
}