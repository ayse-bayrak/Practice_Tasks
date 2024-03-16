package day30_inheritance.cryptoTask;

public class Bitcoin extends CryptoToken {

    public Bitcoin(double price, double marketCap, double volume, double circulatingSupply, int quantity, boolean isMineable) {
        super(price, marketCap, volume, circulatingSupply, quantity, isMineable);
    }


}
/*
2. create 5 sub classes of CryptoToken:
			Bitcoin
			Ethereum
			Cardano
			XRP
			Doge

 */