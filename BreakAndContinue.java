class BreakAndContinue
{
	public static void main(String [] args)
	{
		for(int i=1;i<=5;i++)
		{
			if(i==3)
			{
				continue;//output la 1245 nu varum ena continue antha visaytha matum skip pannum
				//break; irruntha antha full block vitu valiya poirum
			}
			System.out.println(i);
		}
	}
}