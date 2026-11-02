public class Calculation {

    public static double getPrice(int choice) {

        switch (choice) {

            case 1:
                return 150;

            case 2:
                return 80;

            case 3:
                return 60;

            case 4:
                return 70;

            case 5:
                return 40;

            default:
                return 0;
        }
    }

    public static double calculateTotal(
            double total, double price, int quantity) {

        return total + (price * quantity);
    }
}