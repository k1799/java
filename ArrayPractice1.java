import java.util.Scanner;
class ArrayPractice1
{
	Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		ArrayPractice1 a1=new ArrayPractice1();
		a1.menu();

	}
	void menu()
	{
	     System.out.print("ENTER THE ARRAY SIZE:");
         int size=sc.nextInt();	
		 int ar[]=new int[size];
		 boolean result=true;
		 do{
		 System.out.println("1.INSERT THE DATA");
		 System.out.println("2.DISPLAY ALL DATA");
		 System.out.println("3.ONLY DIVISIBLE BY 7 ");
		 System.out.println("4.EXIT");
		 System.out.print("ENTER ANY CHOICE:");
		 int choice=sc.nextInt();
		 if(choice==1)
		 {
			 insert(ar);
		 }
		 else if(choice==2)
		 {
			 display(ar);
		 }
		 else if(choice==3)
		 {
			 divisible(ar);
		 }
		 else
		 {
			 System.out.println("exited");
			 result=false;
		 }
	}while(result);



	}
    void insert(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("ENTER THE "+i+" INDEX VALUE:");
			arr[i]=sc.nextInt();
		}
	}
	void display(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
	void divisible(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%7==0)
			{
			System.out.println(arr[i]);
			}
		}
	}

}