class Insert1//class la sir example podathu
{
	public static void main(String[] args)
	{
		String old[]={"one","two","four","five","six"};
		int posi=3;
		String data="three";
		String newarr[]=new String[old.length+1];
		for(int i=0;i<posi-1;i++)
		{
			newarr[i]=old[i];
		}
		newarr[posi-1]=data;
		for(int i=posi;i<newarr.length;i++)
		{
			newarr[i]=old[i-1];
		}
		for(int i=0;i<newarr.length;i++)
		{
			System.out.println(newarr[i]);
		}

	}

}