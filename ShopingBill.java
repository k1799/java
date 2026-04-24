import java.util.Scanner;//chargpt answer but simple question used this program but this is correct
public class ShopingBill {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of items: ");
        int n = sc.nextInt();

        double[] price = new double[n];
        double total = 0;

        // Input prices
        for (int i = 0; i < n; i++) {
            System.out.print("Enter price of item " + (i + 1) + ": ");
            price[i] = sc.nextDouble();
            total += price[i];
        }

        double discount = 0;

        // Apply discount
        if (total > 5000) {
            discount = total * 0.20;
        } else if (total > 2000) {
            discount = total * 0.10;
        }

        double finalAmount = total - discount;

        // Output
        System.out.println("\n------ BILL DETAILS ------");
        System.out.println("Total Amount : " + total);
        System.out.println("Discount     : " + discount);
        System.out.println("Final Amount : " + finalAmount);
    }
}