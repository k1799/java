import java.util.Scanner;
class ArrayName
{
   public static void main(String[] args)
   {
	   Scanner sc =new Scanner(System.in);
	   System.out.print("ENTER YOUR ARRAY SIZE :");
		int size=sc.nextInt();
		int ar[]=new int[size];
		boolean result=true;
		do
		{
		System.out.println("1.INSERT");
		System.out.println("2.DISPLAY");
		System.out.println("3.SUM OF ARRAY");
		System.out.println("4.PRINT ONLY EVEN NUMBERS");
		System.out.println("5.REVERSE");
		System.out.println("6.EXIT");
		int choice=sc.nextInt();
		if(choice==1)
		{
			for(int i=0;i<ar.length;i++)
			{
				System.out.println("ENTER THE "+i+" th VALUE");
				ar[i]=sc.nextInt();
			}
		}
		else if(choice==2)
		{
			for(int i=0;i<ar.length;i++)
			{
				System.out.println(ar[i]);
			}
		}
		else if(choice==3)
		{
			int sum=0;
			for(int i=0;i<ar.length;i++)
			{
				sum=ar[i]+sum;
			}
			System.out.println(sum);
		}
		else if(choice==4)
		{
			for(int i=0;i<ar.length;i++)
			{
				if(ar[i]%2==0)
				{
				System.out.println(ar[i]);	
				}
			}
		}
		else if(choice==5)
		{
			for(int i=ar.length-1;i>=0;i--)
			{
				System.out.println(ar[i]);	
			}
		}
		else
		{
			System.out.println("exitedd......");
			result=false;
		}
   }while(result);



   }   
}
