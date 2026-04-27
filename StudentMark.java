import java.util.Scanner;
class StudentMark
{
	Scanner sc=new Scanner(System.in);
	public static void main(String [] args)
	{
		StudentMark s=new StudentMark();
		s.menu();
	}
	void menu()
	{
      System.out.print("ENTER THE ARRAY SIZE");
	  int size=sc.nextInt();
	  int arr[]=new int[size];//datatype arrayname[]=new datatype[size];
	  boolean result=true;
	  do
	  {
	  System.out.println("1.INSERT THE MARKS:");
	  System.out.println("2.Calculate TOTAL MARKS:");
	  System.out.println("3.CALCULATE AVERAGE:");
	  System.out.println("4.FIND GRADE:");
	  System.out.println("5.EXIT:");
	  System.out.println("CHOOSE ANY OPTION");
	  int option=sc.nextInt();
	  switch (option)
	  {
	  case 1:
	     getmarks(arr);//ithu vanthu int arr[] la arr kurikurathu
		 break;
	  case 2:
	    int t=total(arr);
		System.out.println("TOTAL MARKS="+t);
		break;
	  case 3:
        double a=avg(arr);	  
		System.out.println("AVERAGE MARKS="+a);
		break;
	  case 4:
		grade(arr);
		break;
	  default:
		System.out.println("EXITEDD....");
		result=false;
	  }
	  }while(result);
	}
	void getmarks(int ar[])
	{
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(" ENTER THE " +i+ " MARK ");
			ar[i]=sc.nextInt();
		}
	}
	int total(int ar[])
	{
		int sum=0;
		for(int i=0;i<ar.length;i++)
		{
			sum=sum+ar[i];
		}
		return sum;
	}
	double avg(int ar[])
	{
		int sum=total(ar);
		double avg= sum / ar.length;
	   return avg;
	}
	void grade(int ar[])
	{
		double avg=avg(ar);
		if(avg>=90)
		{
			System.out.print("A GRADE :"+avg);
		}
		else if(avg>=75)
		{
			System.out.print("B GRADE :"+avg);
			
		}
		else if(avg>=50)
		{
			System.out.print("C GRADE :"+avg);
		}
		else
		{
			System.out.print("FAILED"+avg);	
		}
	}
}