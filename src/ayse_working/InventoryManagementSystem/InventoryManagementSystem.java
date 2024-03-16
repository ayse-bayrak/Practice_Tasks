package ayse_working.InventoryManagementSystem;

import java.util.ArrayList;
import java.util.Arrays;

public class InventoryManagementSystem {
    public static void main(String[] args) {


        /* my test objects

        Product p1 = new Product(1, "iphone", 1000, 3);
        Product p2 = new Product(2, "laptop", 1500, 2);

       // p1.sell(1);

       // p2.restock(1);

        System.out.println("===============Inventory Object Test=================");

        ArrayList<Product> products = new ArrayList<>(Arrays.asList(p1, p2));

        Inventory i1 = new Inventory("Inventory1", products );

        System.out.println(i1.listProducts());

        i1.sellProduct(1, 1);
        i1.restockProduct(2, 1);

        System.out.println(i1);
        */

                // Create an inventory for a store
                Inventory storeInventory = new Inventory("SuperMart");

                // Add products to the inventory
                storeInventory.addProduct(new Product(1, "Laptop", 899.99, 10));
                storeInventory.addProduct(new Product(2, "Smartphone", 499.99, 20));
                storeInventory.addProduct(new Product(3, "Headphones", 59.99, 50));

                // Display the initial inventory
                System.out.println("Initial Inventory:");
                storeInventory.listProducts();

                // Sell some products
                storeInventory.sellProduct(1, 2);
                storeInventory.sellProduct(3, 10);

                // Display the updated inventory after selling
                System.out.println("\nInventory after selling:");
                storeInventory.listProducts();

                // Restock some products
                storeInventory.restockProduct(2, 5);

                // Display the final inventory after restocking
                System.out.println("\nFinal Inventory after restocking:");
                storeInventory.listProducts();

                // Calculate and display the total inventory value
                System.out.println("\nTotal Inventory Value: $" + storeInventory.getTotalInventoryValue());


    }
}
