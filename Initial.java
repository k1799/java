import java.util.Scanner;
class Initial
{
	public static void main (String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE INITIAL:");
		char initial=sc.next().charAt(0);
		switch (initial)
		{
			case 'G':
			{
		
			System.out.println("KANNAN INITIAL IS:");
			break;
			}
		
		    case 'A':
			{
		
			System.out.println("GURUMURTHY INITIAL IS:");
			break;
			}
		
		    case 'C':
			{
		
			System.out.println("CAT INITIAL IS:");
			break;
			}
		
		default :
		{
		   System.out.println("THERE KNOW MORE INITIAL IS THERE:");	
		}
		}
		
	}
}