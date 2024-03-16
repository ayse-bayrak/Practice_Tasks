package day17_custom_class;

import java.sql.SQLOutput;

public class TestAddressObject {
    public static void main(String[] args) {

        Address address1 = new Address();

        address1.setInfo(7975,"Jones Branch Dr", "McLean", "VA","22012" );

        System.out.println(address1);
    }
}
