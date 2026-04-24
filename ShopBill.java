import java.util.Scanner;//new key word method used
class ShopBill//menu mathiri question ketangana menu question used this program
{
	public static void main (String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("ENTE THE NUMBER OF ITEMS:");
		int item=sc.nextInt();
		double price[]=new double[item];
		boolean result=true;
		do
		{
			System.out.println("1.INSERT THE PRICE:");
			System.out.println("2.DISPLAY THE PRICE:");
			System.out.println("3.CALCULATE THE BILL:");
			System.out.println("4.EXIT");
			System.out.println("CHOOSE YOUR OPTION");
			int option=sc.nextInt();
			if (option==1)
			{
			   for (int i=0;i<price.length;i++)
			  {
				System.out.println("ENTER THE"+ i +"PRICE");
				price[i]=sc.nextDouble();
			  }
			}
			else if (option==2)
			{
				for (int i=0;i<price.length;i++)
				{
					System.out.println(price[i]);
				}
			}
			else if (option==3)
			{
				double total=0;
				for (int i=0;i<price.length;i++)
				{
					total += price[i];
				}
				double discount=0;
				if (total>5000)
				{
					discount=total*0.20;
				}
				else if (total>2000)
				{
					discount=total*0.10;
				}
				else
				{
					System.out.print("NO DISCOUNT");
				}
				double finalamount=total-discount;
				System.out.println("....BILL DETAILS....");
				System.out.println("TOTAL AMOUNT:"+total);
				System.out.println("DISCOUNT:"+discount);
				System.out.println("FINAL AMOUNT:"+finalamount);
			}
			else
			{
				System.out.println("EXITEDD THE BILLING");
				result=false;
			}
		}while(result);
		
	}
}