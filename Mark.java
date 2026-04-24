import java.util.Scanner;
class Mark
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("ENTER THE STUDENT SIZE:");
		int size=sc.nextInt();
		int mark[]=new int[size];
		//insert mark
		for(int i=0;i<mark.length;i++)
		{
			System.out.print("ENTER THE "+i+"STUDENT MARK:");
			mark[i]=sc.nextInt();

		}
		int minmark=0;
		for(int i=0;i<mark.length;i++)
		{
			if(mark[i]<minmark)
			{
				minmark = mark[i];
			}

		}
			System.out.println("LOWEST MARK IN MY CLASS: "+ minmark);
	}
}