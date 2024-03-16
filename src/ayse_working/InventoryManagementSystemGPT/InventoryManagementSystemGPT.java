package ayse_working.InventoryManagementSystemGPT;

public class InventoryManagementSystemGPT {

        public static void main(String[] args) {
            // Create an inventory for a store
            InventoryGPT storeInventory = new InventoryGPT("SuperMart");

            // Add products to the inventory
            storeInventory.addProduct(new ProductGPT(1, "Laptop", 899.99, 10));
            storeInventory.addProduct(new ProductGPT(2, "Smartphone", 499.99, 20));
            storeInventory.addProduct(new ProductGPT(3, "Headphones", 59.99, 50));

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

