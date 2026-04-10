import java.util.Scanner;//class work example 9.4.26
class BioData1
{
	public static void main (String [] args)
   {
    Scanner sc=new Scanner(System.in);//primitive
    Scanner se=new Scanner(System.in);//non primitive
    System.out.println("*********WELCOME GUYS**************");
    System.out.print("ENTER YOUR NAME :");
    String name=se.nextLine();
    System.out.print("ENTER YOUR AGE :");
    byte age=sc.nextByte();
    System.out.print("ENTER YOUR PHONENUMBER :");
    long mobilenumber=sc.nextLong();
    System.out.print("ENTER YOUR INITIAL :");
    char initial=sc.next().charAt(0);

    System.out.println("********PRINTING THE VALUES*******");
    System.out.println("MY NAME IS"+name);
    System.out.println("MY AGE IS"+age);
    System.out.println("MY PHONENUMBER IS"+mobilenumber);
    System.out.println("MY INITIAL IS"+initial);
  }

}