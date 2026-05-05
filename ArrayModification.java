class ArrayModification//Array Modification Create an integer array. Pass it to a method and modify at least one element. Print array before and after calling the method.
{
	public static void main(String [] args)
	{
		int ar[]={20,30,60};
		ArrayModification a=new ArrayModification();
		System.out.println("BEFORE ARRAY...");
		
		for(int i=0;i<ar.length;i++)
		{
		System.out.println(ar[i]);
			
		}
	 a.modify(ar);
	System.out.println("AFTER ARRAY...");
	  for(int i=0;i<ar.length;i++)
	 {
		System.out.println(ar[i]);
	 }
	}
	  
	void modify(int ar[])
	{
		ar[1]=40;

	}	
}