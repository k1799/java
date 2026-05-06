class Delete
{
	public static void main(String [] args)
	{
		String ar[]={"one","ten","two","three","four","five"};
		int posi=2;
		String newar[]=new String[ar.length-1];
		for(int i=0;i<posi-1;i++)
		{
			newar[i]=ar[i];
		}
		for(int i=posi-1;i<newar.length;i++)
		{
			newar[i]=ar[i+1];
		}
		for(int i=0;i<newar.length;i++)
		{
			System.out.println(newar[i]);
		}
		
		
	}
}