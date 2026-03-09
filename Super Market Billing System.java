import java.util.Scanner;

class Product {
    String name;
    int price;

    Product(String name, int price) {
        this.name = name;
        this.price = price;
    }
}

public class SuperMarketBillingSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Product[] products = {
                new Product("Rice", 50),
                new Product("Sugar", 40),
                new Product("Milk", 30),
                new Product("Soap", 25),
                new Product("Biscuits", 10)
        };

        int choice;
        int quantity;
        int total = 0;

        do {
            System.out.println("\n===== SUPER MARKET BILLING SYSTEM =====");
            System.out.println("1. Rice - ₹50");
            System.out.println("2. Sugar - ₹40");
            System.out.println("3. Milk - ₹30");
            System.out.println("4. Soap - ₹25");
            System.out.println("5. Biscuits - ₹10");
            System.out.println("6. Exit");

            System.out.print("Select item: ");
            choice = sc.nextInt();

            if (choice >= 1 && choice <= 5) {

                System.out.print("Enter quantity: ");
                quantity = sc.nextInt();

                int cost = products[choice - 1].price * quantity;
                total += cost;

                System.out.println(products[choice - 1].name + " added. Cost = ₹" + cost);

            }

        } while (choice != 6);

        System.out.println("\n===== FINAL BILL =====");
        System.out.println("Total Amount = ₹" + total);
        System.out.println("Thank you for shopping!");

        sc.close();
    }
}
