package day30_inheritance.cryptoTask;

public class CryptoToken {

    private double price, marketCap, volume, circulatingSupply;
    private int quantity;
    private boolean isMineable;

    public CryptoToken(double price, double marketCap, double volume, double circulatingSupply, int quantity, boolean isMineable) {
        setPrice(price);
        setMarketCap(marketCap);
        setVolume(volume);
        setCirculatingSupply(circulatingSupply);
        setQuantity(quantity);
        setMineable(isMineable);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if ( price < 0) {
            System.err.println("price can not be set to zero or negative");
            System.exit(1);
        }
        this.price = price;
    }

    public double getMarketCap() {
        return marketCap;
    }

    public void setMarketCap(double marketCap) {
        if ( marketCap == 0) {
            System.err.println("marketCap can not be zero");
            System.exit(1);
        }
        this.marketCap = marketCap;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getCirculatingSupply() {
        return circulatingSupply;
    }

    public void setCirculatingSupply(double circulatingSupply) {
        this.circulatingSupply = circulatingSupply;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if ( quantity < 0) {
            System.err.println("quantity can nt set to negative");
            System.exit(1);
        }
        this.quantity = quantity;
    }

    public boolean isMineable() {
        return isMineable;
    }

    public void setMineable(boolean mineable) {
        isMineable = mineable;
    }

    public double totalPrice(){
        return price * quantity;
    } //returns the total price of the cyrpto totek ( price * quantity)

    public String toString() {
        return getClass().getSimpleName() + "{" +
                "price=" + price +
                ", marketCap=" + marketCap +
                ", volume=" + volume +
                ", circulatingSupply=" + circulatingSupply +
                ", quantity=" + quantity +
                ", isMineable=" + isMineable +
                ", totalPrice=" +  totalPrice() +
                '}';
    }
}
/*
create a class called CryptoToken
			variables:
				price, quantity, marketCap, volume, circulatingSupply, isMineable (boolean)

			Encapsulate all the fields
				Conditions:
					1. price can not be set to zero or negative
					2. quantity can nt set to negative
					3. marketCap can not be zero

			methods:
				toString()
				totalPrice(): returns the total price of the cyrpto totek ( price * quantity)
 */

/*
Volume: how much (of the coin) has been traded in the last 24 hours.
Circulating supply: how much of the coin currently exists.
Market Cap: Market capitalization; price of coin * circulating supply = Market Cap.
That is to say, how much is the total net worth or value of the coin.
 */