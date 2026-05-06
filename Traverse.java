class Traverse//and swap for array used
{
	public static void main(String [] args)
	{
		String name[]={"kannan","guru","rajam"};
		Traverse t=new Traverse();
		t.list(name);
		t.swap(name);
		
	}
	void list(String ar[])
	{
		System.out.println("ARRAY TRVERSE:");
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]);
		}
	}
	void swap(String ar[])
	{
		System.out.println("ARRAY SWAP:");
		String temp=ar[0];
		ar[0]=ar[2];
		ar[2]=temp;
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]);
		}
	}
}