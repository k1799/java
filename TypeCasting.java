class TypeCasting//used for function method
{
	/*question use typecasting for solving  store five student mark 
	in string variable 
	find total mark 
	average mark for all students*/
	public static void main(String [] args)
	{
		TypeCasting t=new TypeCasting();
		t.insert();
	}
	void insert()
	{
        // 5 student marks as String
		String s1="99";
		String s2="69";
		String s3="89";
		String s4="73";
		String s5="65";
		
        // Typecasting (String → int)
		int sm1=Integer.parseInt(s1);
		int sm2=Integer.parseInt(s2);
		int sm3=Integer.parseInt(s3);
		int sm4=Integer.parseInt(s4);
		int sm5=Integer.parseInt(s5);
		
		// Total
		int total=sm1+sm2+sm3+sm4+sm5;
        
        // Average
        double average = total / 5.0;

        // Output
        System.out.println("Total Marks = " + total);
        System.out.println("Average Marks = " + average);
	}
}
