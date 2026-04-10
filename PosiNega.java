import java.util.Scanner;//1.  Write a Java program to check whether a number is positive or negative using Scanner.it's a chartgpt answer.date:9.4.26 home work

public class PosiNega {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num >= 0) {
            System.out.println("Positive Number");
        } else {
            System.out.println("Negative Number");
        }
    }
}