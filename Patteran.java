/*1 2 3 4 5
1 2 3 4
1 2 3 
1 2 
1*/
public class Patteran//chart gpt using program
{
    public static void main(String[] args)
	{
        for (int i = 5; i >= 1; i--) {   // outer loop (rows)

            for (int j = 1; j <= i; j++) {   // inner loop (numbers)
                System.out.print(j + " ");
            }

            System.out.println(); // next line
        }
    }
}