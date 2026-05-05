class StudentMarks //chargpt normal method
 {
    public static void main(String[] args)
	{

        // 5 student marks as String
        String m1 = "85";
        String m2 = "90";
        String m3 = "78";
        String m4 = "88";
        String m5 = "92";

        // Typecasting (String → int)
        int a = Integer.parseInt(m1);
        int b = Integer.parseInt(m2);
        int c = Integer.parseInt(m3);
        int d = Integer.parseInt(m4);
        int e = Integer.parseInt(m5);

        // Total
        int total = a + b + c + d + e;

        // Average
        double average = total / 5.0;

        // Output
        System.out.println("Total Marks = " + total);
        System.out.println("Average Marks = " + average);
    }
}