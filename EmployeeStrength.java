import java.util.Scanner;
class EmployeeStrength
{
	public static void main (String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE EMPLOYEE STRENGTH:");
		int strength=sc.nextInt();
		int arr[]=new int[strength];
		boolean result=true;
		do
		{
			System.out.println("1.INSERT EMPLOYEE AGE:");
			System.out.println("2.DISPLAY ALL EMPLOYEE AGE:");
			System.out.println("3.SUM OF EMPLOYEE AGE:");
			System.out.println("4.PRINT  ONLY EVEN AGE EMPLOYEE:");
			System.out.println("5.PRINT MAXIMUM AGE IN EMPLOYEE:");
			System.out.println("6.PRINT MINIMUM AGE IN EMPLOYEE:");
			System.out.println("7.COUNT THE EMPLOYEE:");
			System.out.println("EXIT:");
			System.out.println("CHOOSE YOUR OPTION");
			int option=sc.nextInt();
			if (option==1)
			{
			 for (int i=0;i<arr.length;i++)
			 {
				System.out.println("ENTER THE"+i+"AGE");
				arr[i]=sc.nextInt();
			 }
			}
			else if (option==2)
			{
			 for (int i=0;i<arr.length;i++)
			 {
				System.out.println(arr[i]);
			 }
			}
			else if (option==3)
			{
				int sum=0;
			 for (int i=0;i<arr.length;i++)
			 {
				 sum=sum+arr[i];
			 }
				System.out.println("SUM OF EMPLOYEE AGE:"+sum);
			 
			}
			else if (option==4)
			{
				
			 for (int i=0;i<arr.length;i++)
			 {
				 if (arr[i] % 2 == 0)
				 {
				    System.out.println("EVEN OF EMPLOYEE AGE:"+arr[i]);	 
				 }
			 }
			}
			else if (option==5)
			{
				int max=0;
				for (int i=0;i<arr.length;i++)
				{
					if (arr[i]>max)
					{
						max=arr[i];
					}
				}
				System.out.println("MAXIMUM AGE IN EMPLOYEE"+max);
			}
			else if (option==6)
			{
				int min=arr[0];
				for (int i=0;i<arr.length;i++)
				{
					if (arr[i]<min)
					{
						min=arr[i];
					}
				}
				System.out.println("MINIMUM AGE IN EMPLOYEE"+min);
			}
			else if (option==7)
			{
				int count=0;
				for (int i=0;i<arr.length;i++)
				{
						count++;
				}
				System.out.println("COUNT THE EMPLOYEE:"+count);
			}
			else
			{
				System.out.println("EXITEDD......");
				result=false;
			}
		}while(result);
	}
}