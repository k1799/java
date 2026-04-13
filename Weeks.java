import java.util.Scanner;//3. Write a Java program to print the day name based on number (1–7). using scanner like 1-->monday,2-->Tuesday.it's a chartgpt answer.date:9.4.26 home work using switch
class Weeks
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the (1-7):");
		int weeks = sc.nextInt();//letter space vantha Line varum illyna next matum kodutha podhum
		if ( weeks == 1)
		{
			System.out.println("MONDAY");
		}
		else if ( weeks == 2)
		{
			System.out.println("TUESDAY");
		}
		else if ( weeks == 3)
		{
			System.out.println("WEDNESDAY");
		}
		else if ( weeks == 4)
		{
			System.out.println("THURSDAY");
		}
		else if ( weeks == 5)
		{
			System.out.println("FRIDAY");
		}
		else if ( weeks == 6)
		{
			System.out.println("SATURDAY");
		}
		else if ( weeks == 7)
		{
			System.out.println("SUNDAY");
		}
		else
		{
			System.out.println("WRONG INPUT");
		}
		
	}
}