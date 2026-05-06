import java.util.Scanner;// chatgpt answer
class EmployeeSystem {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        EmployeeSystem e = new EmployeeSystem();
        e.menu();
    }

    void menu() {

        int arr[] = new int[100];  // max size
        int size = 0;              // current count
        boolean result = true;

        do {
            System.out.println("\n1. Add employee ID");
            System.out.println("2. Remove employee ID");
            System.out.println("3. Display employee IDs");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter employee ID: ");
                int id = sc.nextInt();
                
                arr[size] = id;   // insert
                size++;

                System.out.println("Employee ID added.");
				
            }

            else if (choice == 2) {
                System.out.print("Enter employee ID to remove: ");
                int id = sc.nextInt();

                boolean found = false;

                for (int i = 0; i < size; i++) {
                    if (arr[i] == id) {

                        // shift left
                        for (int j = i; j < size - 1; j++) {
                            arr[j] = arr[j + 1];
                        }

                        size--;
                        found = true;
                        System.out.println("Employee ID removed.");
                        break;
                    }
                }

                if (!found) {
                    System.out.println("Employee ID not found.");
                }
            }

            else if (choice == 3) {
                System.out.println("Employee IDs:");

                for (int i = 0; i < size; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            }

            else {
                System.out.println("Exiting.");
                result = false;
            }

        } while (result);
    }
}
/*Problem Statement:

A multinational company keeps a list of employee identification numbers in the order in which employees join the organization. The company wants a menu-based system to manage these records.

The system should allow the user to:

Add a new employee identification number to the end of the list.

Remove an employee identification number when an employee leaves the company by checking each number one by one until the required number is found.

Display all employee identification numbers.

Exit the system.

📥 Sample Input
Menu:
1. Add employee ID
2. Remove employee ID
3. Display employee IDs
4. Exit

Enter your choice: 1
Enter employee ID: 105

Enter your choice: 1
Enter employee ID: 210

Enter your choice: 1
Enter employee ID: 315

Enter your choice: 3

Enter your choice: 2
Enter employee ID to remove: 210

Enter your choice: 3

Enter your choice: 4

📤 Sample Output
Employee ID added.
Employee ID added.
Employee ID added.

Employee IDs:
105 210 315

Employee ID removed.

Employee IDs:
105 315

Exiting.*/