import java.util.Scanner;

class MergeSortMenu
{
    int arr[];
    int size;
    Scanner sc = new Scanner(System.in);

    // Enter Array
    void enterArray()
    {
        System.out.println("Enter Array Size:");
        size = sc.nextInt();

        arr = new int[size];

        System.out.println("Enter Array Elements:");

        for(int i=0; i<size; i++)
        {
            arr[i] = sc.nextInt();
        }
    }

    // Merge Function for Ascending
    void mergeAsc(int low, int mid, int high)
    {
        int temp[] = new int[size];

        int i = low;
        int j = mid + 1;
        int k = low;

        while(i <= mid && j <= high)
        {
            if(arr[i] < arr[j])
            {
                temp[k] = arr[i];
                i++;
            }
            else
            {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        while(i <= mid)
        {
            temp[k] = arr[i];
            i++;
            k++;
        }

        while(j <= high)
        {
            temp[k] = arr[j];
            j++;
            k++;
        }

        for(i=low; i<=high; i++)
        {
            arr[i] = temp[i];
        }
    }

    // Ascending Merge Sort
    void mergeSortAsc(int low, int high)
    {
        if(low < high)
        {
            int mid = (low + high) / 2;

            mergeSortAsc(low, mid);
            mergeSortAsc(mid + 1, high);

            mergeAsc(low, mid, high);
        }
    }

    // Merge Function for Descending
    void mergeDesc(int low, int mid, int high)
    {
        int temp[] = new int[size];

        int i = low;
        int j = mid + 1;
        int k = low;

        while(i <= mid && j <= high)
        {
            if(arr[i] > arr[j])
            {
                temp[k] = arr[i];
                i++;
            }
            else
            {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        while(i <= mid)
        {
            temp[k] = arr[i];
            i++;
            k++;
        }

        while(j <= high)
        {
            temp[k] = arr[j];
            j++;
            k++;
        }

        for(i=low; i<=high; i++)
        {
            arr[i] = temp[i];
        }
    }

    // Descending Merge Sort
    void mergeSortDesc(int low, int high)
    {
        if(low < high)
        {
            int mid = (low + high) / 2;

            mergeSortDesc(low, mid);
            mergeSortDesc(mid + 1, high);

            mergeDesc(low, mid, high);
        }
    }

    // Find Median
    void findMedian()
    {
        mergeSortAsc(0, size - 1);

        if(size % 2 == 0)
        {
            double median =
            (arr[size/2] + arr[(size/2)-1]) / 2.0;

            System.out.println("Median = " + median);
        }
        else
        {
            System.out.println("Median = " + arr[size/2]);
        }
    }

    // Display Array
    void display()
    {
        System.out.println("Array Elements:");

        for(int i=0; i<size; i++)
        {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    // Menu Method
    void menu()
    {
        int choice;

        do
        {
            System.out.println("\n---- MENU ----");
            System.out.println("1. Enter Array");
            System.out.println("2. Sort Ascending");
            System.out.println("3. Sort Descending");
            System.out.println("4. Find Median");
            System.out.println("5. Display Array");
            System.out.println("6. Exit");

            System.out.println("Enter Choice:");
            choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    enterArray();
                    break;

                case 2:
                    mergeSortAsc(0, size - 1);
                    System.out.println("Sorted in Ascending Order");
                    break;

                case 3:
                    mergeSortDesc(0, size - 1);
                    System.out.println("Sorted in Descending Order");
                    break;

                case 4:
                    findMedian();
                    break;

                case 5:
                    display();
                    break;

                case 6:
                    System.out.println("Program Ended");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while(choice != 6);
    }

    public static void main(String args[])
    {
        MergeSortMenu obj = new MergeSortMenu();
        obj.menu();
    }
}