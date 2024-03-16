package day30_inheritance.cryptoTask;

public class XRP extends CryptoToken{
    public XRP(double price, double marketCap, double volume, double circulatingSupply, int quantity, boolean isMineable) {
        super(price, marketCap, volume, circulatingSupply, quantity, isMineable);
    }
}
