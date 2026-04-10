import java.util.Scanner;
class KannanShowroom
{
	public static void main (String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("**** Welcome Kannan Showroom ****");
		System.out.println("TVS");
		System.out.println("HERO");
		int veichles = sc.nextInt();
		if (veichles==1)
		{
			System.out.println("XL MODEL");
			System.out.println("RADION MODEL");
			int model = sc.nextInt();
			if (model==1)
			{
				System.out.println("XL PRICE IS $60000");
			}
			else if (model==2)
			{
				System.out.println("RADION PRICE IS $100000");
			}
			else
			{
				System.out.println("WE HAVE NO MODELS");
			}
				
		}
		else if (veichles==2)
	   {
		System.out.println("SPLENDER MODEL");
	    System.out.println("PLESERE MODEL");
          int model = sc.nextInt();		
		 if (model==1)
		{
		System.out.println("SPLENDER PRICE IS $70000");	
		}
		else if (model==2)
		{
			System.out.println("PLESERE PRICE IS $65000");
		}
		else
		{
			System.out.println("WE HAVE NO MODELS");
		}
	   }
	   else 
	   {
		  System.out.println("WE HAVE NO BIKES AVAILABLE");
	   }
		
	}
}