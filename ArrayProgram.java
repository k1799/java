import java.util.Scanner;
class ArrayProgram
{
	public static void main (String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER YOUR SIZE");
		int size=sc.nextInt();
		int arr[]=new int [size];
		boolean result=true;
		do
		{
			System.out.println("1.INSERT ELEMENTS");
			System.out.println("2.DISPLAY ELEMENTS");
			System.out.println("3.COUNT EVEN NUMBERS");
			System.out.println("4.COUNT ODD NUMBERS");
			System.out.println("5.EXIT");
			System.out.println("CHOOSE YOUR OPERATION");
			int operation=sc.nextInt();
			if (operation==1)
			{
				for (int i=0;i<arr.length;i++)
				{
					System.out.println("ENTER THE " + i + "th elements");
					 arr[i] =sc.nextInt();
				}
			}
			else if (operation==2)
			{
				for (int i=0;i<arr.length;i++)
				{
					System.out.println(arr[i]);
					
				}
			}
			else if (operation==3)
			{
				int even=0;
				for (int i=0;i<arr.length;i++)
				{
					if (arr[i] % 2 == 0)
					{
					even++;
					}
				}
					System.out.println("EVEN NUMBER COUNT IS =" +even);
			}
			else if (operation==4)
			{
				int odd=0;
				for (int i=0;i<arr.length;i++)
				{
					if (arr[i]% 2 == 1)
					{
					odd++;
					}
				}
					System.out.println("ODD NUMBER COUNT IS =" +odd);
			}
			else
			{
				System.out.println("EXIT OPERATION");
				result=false;
				
			}
			
		}
			while (result);
		
			
			
	}
} 