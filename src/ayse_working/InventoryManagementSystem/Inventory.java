package ayse_working.InventoryManagementSystem;

import java.util.ArrayList;

public class Inventory {
    private String storeName;
    private ArrayList<Product> products = new ArrayList<>();

    public Inventory(String storeName) {
        this.storeName = storeName;
        this.products = products;
    }

    //addProduct(Product product) method to add a product to the inventory.
    public void addProduct(Product product) {
        products.add(product);
        //System.out.println(product + " is adding to " + products);
    }

    //removeProduct(int productId) method to remove a product from the inventory by its ID.
    public void removeProduct(int productId) {
        products.remove(productId);
        //System.out.println(productId + " is removing from " + products);
    }

    //listProducts() method to display information about all products in the inventory.
    public void listProducts(){
        for (Product each : products) {
            System.out.println(each.getProductId() + ". " + each.getProductName() + "- Price: $" + each.getPrice()+ " - Quantity:  " + each.getPrice() );
        }
    }
    //sellProduct(int productId, int quantity) method to sell a certain quantity of a specific product.
    public void sellProduct(int productId, int quantity) {
       // System.out.println("Product id " + productId + ", " + quantity + " quantity/quantities were sold. ");
        for (Product each : products) {
            if(each.getProductId()==productId) {
                each.sell(quantity);
            }
        }
    }

    //restockProduct(int productId, int quantity) method to restock a specific product.
    public void restockProduct(int productId, int quantity){
       // System.out.println("Product id " + productId + ", " + quantity + " quantity/quantities is restocking ");
        for (Product each : products) {
            if(each.getProductId()==productId) {
                each.restock(quantity);
            }
        }
    }

    //getTotalInventoryValue() method to calculate and return the total value of the inventory.

    public double getTotalInventoryValue() {
        double totalValue = 0;
        for (Product each : products) {
            totalValue += each.getPrice()* each.getQuantityInStock();
        }
        return totalValue;
    }

    public String toString() {
        return "Inventory{" +
                "storeName='" + storeName + '\'' +
                ", products=" + products +
                ", totalInventoryValue=" + getTotalInventoryValue() +
                '}';
    }
}
/*
Inventory Class:
Attributes:

storeName (String)
products (ArrayList<Product>)
Methods:

Constructor to initialize the store name and an empty product list.
addProduct(Product product) method to add a product to the inventory.
removeProduct(int productId) method to remove a product from the inventory by its ID.
listProducts() method to display information about all products in the inventory.
sellProduct(int productId, int quantity) method to sell a certain quantity of a specific product.
restockProduct(int productId, int quantity) method to restock a specific product.
getTotalInventoryValue() method to calculate and return the total value of the inventory.
 */