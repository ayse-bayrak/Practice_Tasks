package day30_inheritance.cryptoTask;

public class MyWallet {
    public static void main(String[] args) {
        Bitcoin bitcoin = new Bitcoin(34.1, 100.9, 75.2, 250.4, 40, true);
        System.out.println(bitcoin.totalPrice());
        System.out.println(bitcoin);

        Ethereum ethereum = new Ethereum(23.1, 98.1, 107.9, 876, 78, false);
        System.out.println(ethereum.totalPrice());
        System.out.println(ethereum);

        double totalAsset = bitcoin.totalPrice()+ ethereum.totalPrice();

        System.out.println(totalAsset);

    }
}
/*
3. create a class named MyWallet

		create one object for each CryptoToken

		calculate the total Asset
 */