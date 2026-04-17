import java.util.Scanner;
class PrintNum
{
	public static void main (String [] args)
	{
	   Scanner sc=new Scanner(System.in);
       System.out.println("ENTER THE FIRST NUMBER:");
      int first=sc.nextInt();	
       System.out.println("ENTER THE SECOND NUMBER:");
      int second=sc.nextInt();
	   System.out.println("1.PRINT ALL NUMBERS");
       System.out.println("2.PRINT EVEN NUMBERS ONLY");
       System.out.println("3.PRINT NUMBERS IN REVERSE");
       System.out.println("4.ADD ALL NUMBERS");
	  int option=sc.nextInt();	
	  if (option==1)
	 {
		 for (int i=first;i<=second;i++)
		 {
           System.out.println(i);
		 }
	 }
	 else if (option==2)
	 {
		 int i=first;
		 while (i<=second)
		 {
			 i++;
		   if(i%2==0)
		 {
           System.out.println("THE EVEN NUMBER IS:"+i);
			 
		 }
		 }
	 }
	 else if (option==3)
	 {
		for (int i=second;i>=first;i--)
		 {
           System.out.println(i);
		 } 
	 }
	 else if (option==4)
	 {
		 int sum=0;
		 for (int i=first;i<=second;i++)
		 { 
			sum=sum+i; 
		 }
            System.out.println(sum);		 
	 }
	 else
	 {
		System.out.println("EXIT PROGRAM");
	 }
	 
	}
}