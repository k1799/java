import java.util.Scanner;
class EmployeeDetails
{
	Scanner sc=new Scanner(System.in);
	public static void main(String [] args)
	{
		EmployeeDetails e=new EmployeeDetails();
		e.menu();
	}
	void menu()
	{
		System.out.println("ENTER THE EMPLOYEE STRENGTH:");
		int size=sc.nextInt();
		int arr[]=new int[size];
		boolean result=true;
		do
		{
			System.out.println("1.INSERT THE SALERY");
			System.out.println("2.WHO IS THE MAXIMUM SALERY PRICE");
			System.out.println("3.WHO IS THE MINIMUM SALERY PRICE");
			System.out.println("4.TOTAL SALERY");
			System.out.println("EXIT");
			System.out.println("CHOOSE ANY ONE");
			int option=sc.nextInt();
			if(option==1)
			{
				insert(arr);
			}
			else if(option==2)
			{
				max(arr);
		     
			}
			else if(option==3)
			{
				min(arr);
			}
			else if(option==4)
			{
				int s=sum(arr);
				System.out.println("TOTAL SALERY="+s);
			}
			else
			{
				System.out.println("EXITED");
				result=false;
			}
		}while(result);
		}
	void insert(int ar[])
	{
		for(int i=0;i<ar.length;i++)
		{
			System.out.println("ENTER THE" +i+ "SALERY");
			ar[i]=sc.nextInt();
		}
	}
	void max(int ar[])
	{
		int max=ar[0];
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]>max)
			{
				max=ar[i];
			}
		}System.out.println("MAXIMUM SALERY"+max);
	}
	void min(int ar[])
	{
		int min=ar[0];
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]<min)
			{
				min=ar[i];
			}
				System.out.println("MAXIMUM SALERY"+min);
			
		}
	}
	int sum(int ar[])
	{
		int sum=0;
		for(int i=0;i<ar.length;i++)
		{
			sum=sum+ar[i];
		}
		return sum;
	}
}