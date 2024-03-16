package ayse_working.InventoryManagementSystemGPT;

import java.util.ArrayList;

public class InventoryGPT {
    private String storeName;
    private ArrayList<ProductGPT> products;

    public InventoryGPT(String storeName) {
        this.storeName = storeName;
        this.products = new ArrayList<>();
    }

    public void addProduct(ProductGPT product) {
        products.add(product);
        System.out.println(product.getProductName() + " added to the inventory.");
    }

    public void removeProduct(int productId) {
        for (ProductGPT product : products) {
            if (product.getProductId() == productId) {
                products.remove(product);
                System.out.println(product.getProductName() + " removed from the inventory.");
                return;
            }
        }
        System.out.println("Product with ID " + productId + " not found in the inventory.");
    }

    public void listProducts() {
        System.out.println("Inventory of " + storeName + ":");
        for (ProductGPT product : products) {
            System.out.println(product.getProductId() + ". " + product.getProductName() +
                    " - Price: $" + product.getPrice() + " - Quantity: " + product.getQuantityInStock());
        }
    }

    public void sellProduct(int productId, int quantity) {
        for (ProductGPT product : products) {
            if (product.getProductId() == productId) {
                product.sell(quantity);
                return;
            }
        }
        System.out.println("Product with ID " + productId + " not found in the inventory.");
    }

    public void restockProduct(int productId, int quantity) {
        for (ProductGPT product : products) {
            if (product.getProductId() == productId) {
                product.restock(quantity);
                return;
            }
        }
        System.out.println("Product with ID " + productId + " not found in the inventory.");
    }

    public double getTotalInventoryValue() {
        double totalValue = 0;
        for (ProductGPT product : products) {
            totalValue += product.getPrice() * product.getQuantityInStock();
        }
        return totalValue;
    }
}
