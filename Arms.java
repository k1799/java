import java.util.Scanner;//using loops scanner for armstrong
class Arms
{
	public static void main (String [] args)
	{
		Scanner sc=new Scanner(System.in);
		boolean result=true;
		do
		{
		  System.out.println("Enter Three Digit Number:");
		 int num=sc.nextInt();
		 int temp=num;
		 int rev=0;
		 int sum=0;
		 while(num>0)
		{
		   rev=num%10;
           sum=(rev*rev*rev)+sum;
           num=num/10;		  
		}
		if (temp==sum)
		{
			System.out.println("IT IS A ARMSTRONG NUMBER:"+sum);
		}
		else
		{
			System.out.println("IT IS A NOT ARMSTRONG NUMBER:"+sum);
			result=false;
		}
		}
        while(result);		
	}	
}