import java.util.Scanner;// this is new word array
class EmployeeName
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Scanner se=new Scanner(System.in);
		System.out.print("ENTER YOUR TOTAL EMPLOYEE STRENGTH :");
		int size=sc.nextInt();
		String []name=new String[size];
		for(int i=0;i<=name.length-1;i++)
		{
			System.out.print("ENTER YOUR "+i+" EMPLOYEE NAME :");
			name[i]=se.nextLine();
		}

		for(int i=0;i<=name.length-1;i++)
		{
			System.out.println(name[i]);
		}

	}

}