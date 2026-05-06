import java.util.Scanner;

class EmployeeSystem1
{
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        EmployeeSystem e = new EmployeeSystem();
        e.menu();
    }

    void menu()
    {
        int arr[] = new int[100];
        int size = 0;
        boolean result = true;

        do
        {
            System.out.println("1.INSERT EMPLOYEE ID");
            System.out.println("2.REMOVE EMPLOYEE ID");
            System.out.println("3.DISPLAY EMPLOYEE IDS");
            System.out.println("4.EXIT");
            System.out.println("CHOOSE ANY ONE");

            int option = sc.nextInt();

            if(option == 1)
            {
                size = insert(arr, size);   // 🔥 important
            }
            else if(option == 2)
            {
                size = remove(arr, size);   // 🔥 important
            }
            else if(option == 3)
            {
                display(arr, size);
            }
            else
            {
                System.out.println("EXITED");
                result = false;
            }

        } while(result);
    }

    // 🔹 INSERT
    int insert(int ar[], int size)
    {
        System.out.println("ENTER EMPLOYEE ID:");
        int id = sc.nextInt();

        ar[size] = id;
        size++;

        System.out.println("EMPLOYEE ID ADDED");
        return size;
    }

    // 🔹 REMOVE
    int remove(int ar[], int size)
    {
        System.out.println("ENTER EMPLOYEE ID TO REMOVE:");
        int id = sc.nextInt();

        boolean found = false;

        for(int i = 0; i < size; i++)
        {
            if(ar[i] == id)
            {
                for(int j = i; j < size - 1; j++)
                {
                    ar[j] = ar[j + 1];
                }

                size--;
                found = true;
                System.out.println("EMPLOYEE ID REMOVED");
                break;
            }
        }

        if(!found)
        {
            System.out.println("EMPLOYEE ID NOT FOUND");
        }

        return size;
    }

    // 🔹 DISPLAY
    void display(int ar[], int size)
    {
        System.out.println("EMPLOYEE IDS:");

        for(int i = 0; i < size; i++)
        {
            System.out.print(ar[i] + " ");
        }
        System.out.println();
    }
}