import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What would like you to order? (ENTER NUMBER)\n1. Burger\n2. Taco\n3. Rice");
        Product productInput = null;
        int option = scanner.nextInt();
        System.out.println("How many would you like? (ENTER NUMBER)");
        int quantity = scanner.nextInt();
        System.out.println("How many miles away? (ENTER NUMBER)");
        double miles = scanner.nextDouble();

        switch(option) {
            case 1 -> productInput = new Burger("Burger", 5.99, quantity);
            case 2 -> productInput = new Taco("Taco", 3.99, quantity);
            case 3 -> productInput = new Rice("Rice", 2.99, quantity);
        }


        DeliverySystem.getInstance().calculateTotalPrice(productInput, miles);
        DeliverySystem.getInstance().printReceipt();
    }
}
