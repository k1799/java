import java.util.Scanner;
class PassByReferance1
{
		static  Scanner sc=new Scanner(System.in);
	public static void main(String [] args)
	{
		System.out.println("ENTER THE SIZE");
		int size=sc.nextInt();
		int ar[]=new int[size];
		PassByReferance1 p1=new PassByReferance1();
		p1.insert(ar);
		p1.display(ar);
		p1.changedisplay(ar);
	}
	void insert(int ar[])
	{
		for(int i=0;i<ar.length;i++)
		{
			System.out.print("ENTER THE VALUE=");
			ar[i]=sc.nextInt();
		}
	}
	void display(int ar[])
	{
		System.out.println("DISPLAY VALUE");
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]);
		}
	}
	void changedisplay(int ar[])
	{
		System.out.println("CHANGE REFERANCE DISPLAY VALUE");
		ar[0]=100;
		ar[1]=200;
		ar[2]=300;
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]);
		}
	}
	
}