import java.util.Scanner;

class Pratice1 {

    int choice;   // ✅ add this

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
		System.out.print("ENTER THE START NUMBER:");
        int start = sc.nextInt();
		System.out.print("ENTER THE END NUMBER:");
        int end = sc.nextInt();

        Pratice p = new Pratice();

        do {
            System.out.println("CHOOSE ANY ONE");
            System.out.println("1.DISPLAY NUMBERS:");
            System.out.println("2.SUM NUMBERS:");
            System.out.println("3.EVEN NUMBERS:");
            System.out.println("4.EXIT");

            p.choice = sc.nextInt();

            p.displaynumbers(start, end);

            if (p.choice == 2) {
                int result = p.sum(start, end);
                System.out.println(result);
            }

            p.even(start, end);

        } while (p.choice != 4);
    }

    void displaynumbers(int start, int end) {
        if (choice == 1) {
            for (int i = start; i <= end; i++) {
                System.out.println(i);
            }
        }
    }

    int sum(int start, int end) {
        int result = 0;
        if (choice == 2) {
            for (int i = start; i <= end; i++) {
                result += i;
            }
        }
        return result;   // ✅ must always return
    }

    void even(int start, int end) {
        if (choice == 3) {
            for (int i = start; i <= end; i++) {   // ✅ fixed
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}