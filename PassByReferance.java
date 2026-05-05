class PassByReferance
{
	public static void main(String [] args)
	{
		int size[]={10,20,30};
		PassByReferance p=new PassByReferance();
		System.out.println(size[0]);
		System.out.println(size[1]);
		System.out.println(size[2]);
		p.changedisplay(size);
		System.out.println(size[1]);
		
	}
	void changedisplay(int ar[])
	{
		for(int i=0;i<ar.length;i++)
		{
			ar[0]=40;
			ar[1]=50;
			ar[2]=60;
		System.out.println(ar[i]);
		}
	}
}