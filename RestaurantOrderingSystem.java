import java.util.Scanner;

public class RestaurantOrderingSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double total = 0;
        double gst, finalBill;

        while (true) {

            // Member 1: Display Menu
            Menu.displayMenu();

            // Member 2: Customer Input
            int choice = Order.getChoice(sc);

            if (choice == 6) {
                break;
            }

            if (!Order.isValidChoice(choice)) {
                System.out.println("Invalid choice! Try again.");
                continue;
            }

            int quantity = Order.getQuantity(sc);

            if (!Order.isValidQuantity(quantity)) {
                System.out.println("Invalid quantity!");
                continue;
            }

            // Member 3: Price and Calculation
            double price = Calculation.getPrice(choice);

            total = Calculation.calculateTotal(
                total, price, quantity);

            System.out.println("Item added successfully!");
        }

        // Member 4: GST and Final Bill
        gst = total * 0.05;
        finalBill = total + gst;

        System.out.println("\n================================");
        System.out.println("          FINAL BILL");
        System.out.println("================================");
        System.out.println("Food Total : Rs. " + total);
        System.out.println("GST (5%)   : Rs. " + gst);
        System.out.println("--------------------------------");
        System.out.println("Final Bill : Rs. " + finalBill);
        System.out.println("================================");
        System.out.println("Thank You! Visit Again.");

        sc.close();
    }
}