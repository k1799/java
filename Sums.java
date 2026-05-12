import java.util.Scanner;
//Sum Of The Array Using Scanner.
class Sums
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("ENTER ARRAY SIZE=");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("ENTER THE VALUE:");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		Sums s=new Sums();
		int result=s.find(arr,0);
		System.out.print("SUM OF VALUES="+result);
	}
	/*int find(int ar[])
	{
		int sum=0;
		for(int i=0;i<ar.length;i++) intha for loop ok 
		{
			sum=ar[i]+sum;
		}
		return sum;
	}*/
	   int sum=0;
	int find(int ar[],int i)
	{
		if(i<ar.length)
		{
			sum=sum+ar[i];
			i++;
			return find(ar,i);//but ithu than recursion use panni kandupudikurathu
			
		}
		return sum;
	}
}