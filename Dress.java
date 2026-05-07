import java.util.Scanner;
class Dress
{
	static Scanner sc=new Scanner(System.in);
	static Scanner se=new Scanner(System.in);
	public static void main(String[] args)
	{
		boolean result=true;
		System.out.print("enter the size of array");
		int size=sc.nextInt();
		String dress[]=new String[size];
		do{
		System.out.println("1. store values");
		System.out.println("2.swap the values and print");
		System.out.println("3.exit");
		System.out.print("choose any one in this:");
		int option=sc.nextInt();

		Dress d=new Dress();
		if(option==1)
		{

			d.insert(dress);
		}
		else if(option==2)
		{
			System.out.print("enter the swap index:");
			int swap1=sc.nextInt();
			System.out.print("enter the swap index:");
			int swap2=sc.nextInt();
			d.swap(dress,swap1,swap2);

		}
		else
		{
			System.out.println("exited.......");
			result=false;
		}
		}while(result);



	}
	void insert(String dress[])
	{

		for(int i=0;i<dress.length;i++)
		{
			System.out.print("enter the dress name :");
			dress[i]=se.nextLine();
		}

	}
	void swap(String ar[],int a,int b)
	{
		String temp=ar[a];
		ar[a]=ar[b];
		ar[b]=temp;
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]);
		}

	}

}