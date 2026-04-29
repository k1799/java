class ArrayPractice
{
	public static void main(String[] args)
	{
	    int employeeage[]={18,22,75,35,50};
		ArrayPractice a1=new ArrayPractice();
		int result=a1.maxage(employeeage);
		System.out.println(result);
		int res=a1.sumofarray(employeeage);
		System.out.println(res);
		int arrr[]=a1.reverse(employeeage);
		System.out.println(arrr[0]);

	}
		 int maxage(int ar[])
		 {
			 int max=0;
			 for(int i=0;i<ar.length;i++)
			 {
				 if(ar[i]>max)
				 {
					 max=ar[i];
				 }
			 }
			 return max;
		 }
		 int sumofarray(int sums[])
		 {
			 int sum=0;
			 for(int i=0;i<sums.length;i++)
			 {
				 sum=sum+sums[i];
			 }
			 return sum;
		 }
		 int[] reverse(int ar[])
		 {
			 int rev[]=new int[5];
			 for(int i=0;i<ar.length;i++)
			 {
				 rev[i]=ar[i];
			 }
			 return rev;
		 }


}