package ayse_working.InventoryManagementSystem;


public class Product {
    private int productId;
    private String productName;
    private double price;
    private int quantityInStock;

    //Constructor(s) to initialize the product attributes.


    public Product(int productId, String productName, double price, int quantityInStock) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantityInStock = quantityInStock;
    }
    //Getter methods for all attributes.

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    //sell(int quantity) method to simulate selling a certain quantity of the product.
    //Update the quantity in stock.

    public int sell (int quantity) {
        System.out.println("Product id " + productId + ", " + quantity + " quantity/quantities were sold. ");
        quantityInStock -= quantity;
        System.out.println("Update quantity is " + quantityInStock);
        return quantityInStock;
    }

    //restock(int quantity) method to simulate restocking the product. Update the quantity in stock.

    public int restock(int quantity) {
        System.out.println("Product id "  + productId + ", " + quantity + " quantity/quantities is restocking. ");
        quantityInStock +=quantity;
        System.out.println("Update quantity is " + quantityInStock);
        return quantityInStock;
    }

    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                ", quantityInStock=" + quantityInStock +
                '}';
    }
}
/*
Create two classes: Product and Inventory.

Product Class:
Attributes:

productId (int)
productName (String)
price (double)
quantityInStock (int)

Methods:

Constructor(s) to initialize the product attributes.
Getter methods for all attributes.
sell(int quantity) method to simulate selling a certain quantity of the product. Update the quantity in stock.
restock(int quantity) method to simulate restocking the product. Update the quantity in stock.
 */