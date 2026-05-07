//class la sir example podathu
class Delete1
{
	public static void main(String[] args)
	{
		int age[]={10,30,40,18,25,89};
		int posi=4;
		int newage[]=new int[age.length-1];
		for(int i=0;i<posi-1;i++)
		{
			newage[i]=age[i];
		}
		for(int i=posi-1;i<newage.length;i++)
		{
			newage[i]=age[i+1];
		}
		for(int i=0;i<newage.length;i++)
		{
			System.out.println(newage[i]);
		}

	}

}
