package ShoppingCart;

import java.util.Scanner;

public class ShoppingCartPrinter {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int i = 0;
        String productName;
        int productPrice = 0;
        int productQuantity = 0;
        int cartTotal = 0;

        //ItemToPurchase item1 = new ItemToPurchase();
        //ItemToPurchase item2 = new ItemToPurchase();

        // Get item 1 details from user, create itemToPurchase object
        ItemToPurchase item1 = new ItemToPurchase();
        System.out.println("Item 1");
        System.out.println("Enter the item name: ");
        item1.setName(scnr.nextLine());
        System.out.println("Enter the item price: ");
        item1.setPrice(scnr.nextInt());
        System.out.println("Enter the item quantity: ");
        item1.setQuantity(scnr.nextInt());

        scnr.nextLine();
        System.out.println("");
        // Get item 2 details from user, create itemToPurchase object

        ItemToPurchase item2 = new ItemToPurchase();
        System.out.println("Item 2");
        System.out.println("Enter the item name: ");
        item2.setName(scnr.nextLine());
        System.out.println("Enter the item price: ");
        item2.setPrice(scnr.nextInt());
        System.out.println("Enter the item quantity: ");
        item2.setQuantity(scnr.nextInt());

        // Add costs of two items and print total
        // cartTotal = item one price + item two price

        int total1 = item1.getPrice() * item1.getQuantity();
        int total2 = item2.getPrice() * item2.getQuantity();
        // Totoal Cost
        // item one information
        // item two information
        // Total output
        System.out.println("\nTOTAL COST");
        System.out.println(item1.getName() + " " + item1.getQuantity() + " @ $" + item1.getPrice() + " = $" + total1);
        System.out.println(item2.getName() + " " + item2.getQuantity() + " @ $" + item2.getPrice() + " = $" + total2);
        System.out.println("\nTotal: $" + (total1 + total2));

        return;
    }
}