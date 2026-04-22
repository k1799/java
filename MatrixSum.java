import java.util.Scanner;
class MatrixSum
{
	public static void main (String [] args)
	{
		Scanner sc=new Scanner (System.in);
		System.out.print("ENTER THE ROW SIZE:");
		int rows=sc.nextInt();
		System.out.print("ENTER THE COLUMS SIZE:");
		int colums=sc.nextInt();
		int a[][]=new int [rows] [colums];//this is new key word formation
		int b[][]=new int [rows] [colums];
		int sum[][]=new int [rows] [colums];
		//input matrix 1
		System.out.println("ENTER MATRIX 1:");
		for (int i=0;i<rows;i++)//outer loop rows
		{
			for (int j=0; j<colums; j++)//inner loop colums
			{
				System.out.print ("Enter the value of "+ i + " " + j +" ");
				a[i][j]=sc.nextInt();
			}
		}
		//input matrix 2
		System.out.println("ENTER MATRIX 2:");
		for (int i=0;i<rows;i++)
		{
			for (int j=0 ;j<colums; j++)
			{
				System.out.print ("Enter the value of "+ i + " " + j +" ");
				b[i][j]=sc.nextInt();
			}
		}
		//matrix sum
		System.out.println("ENTER MATRIX SUM:");
		for (int i=0; i<rows; i++)
		{
			for (int j=0 ;j<colums;  j++)
			{
				sum[i][j]=a[i][j]+b[i][j];
			}
		}
		//output
		for (int i=0; i<rows; i++)
		{
			for (int j=0 ;j<colums;  j++)
			{
			System.out.print(sum[i][j] + " ");
				
			}
		     System.out.println(" ");
			
		}
	}
}