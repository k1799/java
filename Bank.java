import java.util.Scanner;
class BankLoan
{
	public static void main (String [] args)
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("ENTER YOUR NAME:");
		String name = sc.nextLine();
		System.out.println("ENTER YOUR age:");
		byte age = sc.nextByte();
		System.out.println("ENTER YOUR MONTH SALERY:");
		float salery = sc.nextFloat();
		System.out.println("ENTER YOUR CIBIL SCORE:");
		int cibil = sc.nextInt();
		System.out.println("ARE YOU AN EXISTING CUSTOMER IS TRUE OR FALSE:");
		boolean customer =sc.nextBoolean();
		if (age>=21)
		{
			System.out.println(name+"YOUR AGE IS ELIGIBLE FOR LOAN:");
			if (salery>=20000)
			{
				System.out.println(name+"YOUR SALERY IS OK FOR A LOAN:");
			}
			else
			{
				System.out.println(name+"YOUR LOW SALERY NOT ELIGIBLE FOR A LOAN:");
			}
		    if (cibil >=750)
			{
				System.out.println(name+"YOUR ELIGIBLE FOR PREMIMUM LOAN;"+name);
			}
			else 
			{
				System.out.println(name+"YOUR ELIGIBLE FOR STANDARED LOAN(LOW CIBIL SCORE):");
			}
		    if (customer==true)
			{
				System.out.println(name+"YOUR ELIGIBLE FOR PREMIMUM LOAN:");
			}
            else if (customer==false)
			{
				System.out.println(name+"YOU WANT BECOME MY CUSTOMER:");
			}			
		}
		else
		{
			System.out.println("YOUR AGE IS UNDER 21 THEN NOT ELIGIBLE FOR LOAN");
		}
		
		
	}
}