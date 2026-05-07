import java.util.Scanner;
class Train
{
	Scanner sc=new Scanner(System.in);
	int count=0;
	public static void main(String [] args)
	{
		Train t=new Train();
		t.menu();
	}
	void menu()
	{
		System.out.println("ENTER THE SIZE:");
		int size=sc.nextInt();
		int arr[]=new int[size];
		boolean res=true;
		do
		{
		    System.out.println("1.INSERT");
			System.out.println("2.DELETE");
			System.out.println("3.DISPLAY");
			System.out.println("4.EXIT");
			System.out.print("ENTER THE CHOICE: ");	
			int option=sc.nextInt();
			if(option==1)
			{
				insert(arr,count);
			}
			else if(option==2)
			{
				System.out.println("ENTER THE DELETE VALUE");
				int value=sc.nextInt();
				delete(arr,value);
			}
			else if(option==3)
			{
				display(arr);
			}
			else
			{
				System.out.println("EXID...");
				res=false;
			}
			
		}while(res);
	}
	//INSERT
	void insert(int ar[],int value)
	{
		if(count<ar.length)
		{
			System.out.println("ENTER THE EMPLOYEE ID");
			ar[count]=sc.nextInt();
			count++;
			System.out.println("EMPLOYEE ID ADDED");
		}
		else 
		{
			System.out.println("ARRAY IS FULL");
		}
	}
	//DELETE
	void delete(int ar[],int value)
	{
		boolean result=false;
		for(int i=0;i<count;i++)
		{
			if(ar[i]==value)
			{
				for(int j=i;j<count-1;j++)
				{
					ar[j]=ar[j+1];
				}
				count--;
				result =true;
				System.out.println("EMPLOYEE ID REMOVED");
				break;
			}
		}
		if(!result)
		{
			System.out.println("EMPLOYEE ID NOT FOUND");
		}
	}
	//DISPLAY
	void display(int ar[])
	{
		System.out.println("EMPLOYEE IDS");
		for(int i=0;i<count;i++)
		{
			
			System.out.println(ar[i]);
		}
	}
}