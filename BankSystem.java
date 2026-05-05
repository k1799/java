import java.util.Scanner;
class BankSystem
{
	Scanner sc=new Scanner(System.in);
	double balance=0;
	double withdraw=0;
	public static void main(String [] args)
	{
		BankSystem b=new BankSystem();
		b.menu();
	}
	void menu()
	{
		boolean result=true;
		do
	{
		System.out.println("1.DEPOSIT AMOUNT:");
		System.out.println("2.WITHDRAW:");
		System.out.println("3.CHECK BALANCE:");
		System.out.println("4.EXIT");
		System.out.println("CHOOSE ANY ONE OPTION");
		int option=sc.nextInt();
		if(option==1)
		{
			deposit();
		}	
		else if(option==2)
		{
			withdraw();
		}
		else if(option==3)
		{
			checkbalance();
		}
		else
		{
			System.out.println("EXITEDD....");
			result=false;
		}
	}while(result);
	}
	void deposit()
	{
		System.out.print("ENTER THE AMOUNT:");
		double amt=sc.nextInt();
		balance +=amt;
		System.out.println("DEPOSITED AMOUNT:"+balance);
	}
	void withdraw()
	{
		System.out.print("ENTER THE AMOUNT:");
		double amt=sc.nextInt();
		if(amt<=balance)
		{
			balance-=amt;
			withdraw=amt;
			System.out.println("WITHDRAW SUCESSFULLY"+withdraw);
		}
		else 
		{
			System.out.println("INSUFFICIANT BALANCE");
		}
	}
	void checkbalance()
	{
		System.out.println("BALANCE:"+balance);
	}
	
}