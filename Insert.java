class Insert
{
	public static void main(String [] args)
	{
		String ar[]={"one","two","four","five","six"};
		int posi=3;
		String data="three";
		String newar[]=new String[ar.length+1];
		for(int i=0;i<posi-1;i++)
		{
			newar[i]=ar[i];
		}
		
		  newar[posi-1]=data;
		for(int i=posi;i<newar.length;i++)
		{
		  
			newar[i]=ar[i-1];

		}
		for(int i=0;i<newar.length;i++)
		{
			System.out.println(newar[i]);
		}
	}
}
