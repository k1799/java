import java.util.Scanner;
class KannanModernWorld
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("********** WELCOME KANNAN MODERN DRESS SHOP ********");
		System.out.println("WE HAVE THREE SECTIONS");
		System.out.println("1.WOMEN SECTION");
		System.out.println("2.KIDS SECTION");
		System.out.println("3.MEN SECTION");
		System.out.print("CHOOSE ANY ONE SECTION :");
		int section=sc.nextInt();
		if(section==1)
		{
			System.out.println("****** WELCOME TO WOMENS SECTION ***********");
			System.out.println("1.SAREE");
			System.out.println("2.CHUDITHAR");
			System.out.println("3.WESTERN DRESS");
			System.out.print("CHOOSE ANY ONE DRESS MODEL :");
			int style=sc.nextInt();
			if(style==1)
			{
				System.out.println("SAREE PRICE IS $350");
			}
			else if(style==2)
			{
				System.out.println("CHUTITHAR PRICE IS $450");
			}
			else if(style==3)
			{
				System.out.println("WESTERN PRICE IS $600");
			}
			else
			{
				System.out.println("ONLY WE HAVE THESE STYLES FOR WOMENS");
			}



		}
		else if(section==2)
		{
			System.out.println("****** WELCOME TO KIDS SECTION ***********");
			System.out.println("1.FROCK");
			System.out.println("2.SARARA");
			System.out.println("3.SUITE");
			System.out.print("CHOOSE ANY ONE DRESS MODEL :");
			int style=sc.nextInt();
			if(style==1)
			{
				System.out.println("FROCK PRICE IS $450");
			}
			else if(style==2)
			{
				System.out.println("SARARA PRICE IS $1500");
			}
			else if(style==3)
			{
				System.out.println("SUITE PRICE IS $1000");
			}
			else
			{
				System.out.println("ONLY WE HAVE THESE STYLES FOR KIDS");
			}

		}
		else if(section==3)
		{
			System.out.println("****** WELCOME TO MENS SECTION ***********");
			System.out.println("1.SHIRT");
			System.out.println("2.PANT");
			System.out.println("3.VESTI");
			System.out.print("CHOOSE ANY ONE DRESS MODEL :");
			int style=sc.nextInt();
			if(style==1)
			{
				System.out.println("SHIRT PRICE IS $1500");
			}
			else if(style==2)
			{
				System.out.println("PANT PRICE IS $2000");
			}
			else if(style==3)
			{
				System.out.println("VESTI PRICE IS $2500");
			}
			else
			{
				System.out.println("ONLY WE HAVE THESE STYLES FOR MENS");
			}
		}
		else
		{
				System.out.println("ONLY WE HAVE THESE SECTIONS KINDLY ANY ONE FROM THESE SECTION ");
		}