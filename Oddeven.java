import java.util.Scanner;//2. Write a Java program to check whether a number is even or odd. using Scanner.it's a chartgpt answer.date:9.4.26 home work 

public class Oddeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
    }
}