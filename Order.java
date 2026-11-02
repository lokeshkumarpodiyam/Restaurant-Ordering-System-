import java.util.Scanner;

public class Order {

    public static int getChoice(Scanner sc) {

        System.out.print("Enter your choice: ");
        return sc.nextInt();
    }

    public static int getQuantity(Scanner sc) {

        System.out.print("Enter quantity: ");
        return sc.nextInt();
    }

    public static boolean isValidChoice(int choice) {

        return choice >= 1 && choice <= 5;
    }

    public static boolean isValidQuantity(int quantity) {

        return quantity > 0;
    }
}