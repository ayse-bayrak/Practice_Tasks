package ayse_working.InventoryManagementSystemGPT;

public class ProductGPT {
    private int productId;
    private String productName;
    private double price;
    private int quantityInStock;

    public ProductGPT(int productId, String productName, double price, int quantityInStock) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantityInStock = quantityInStock;
    }

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

    public void sell(int quantity) {
        if (quantity > 0 && quantity <= quantityInStock) {
            quantityInStock -= quantity;
            System.out.println("Sold " + quantity + " " + productName + "(s).");
        } else {
            System.out.println("Insufficient quantity in stock.");
        }
    }

    public void restock(int quantity) {
        if (quantity > 0) {
            quantityInStock += quantity;
            System.out.println("Restocked " + quantity + " " + productName + "(s).");
        } else {
            System.out.println("Invalid restock quantity.");
        }
    }
}
