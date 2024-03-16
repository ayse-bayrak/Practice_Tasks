package day34_abstract_interface.deviceTask;

public class DeviceShop {
    public static void main(String[] args) {

        Iphone iphone = new Iphone("Iphone", "14", "Medium", 1000, "White", true, true);
        Samsung samsung = new Samsung("Samsung", "Note", "Medium", 1000, "White", true, true);
        Google google = new Google("Samsung", "Note", "Medium", 1000, "White", true, true);

        PersonelComputer personelComputer = new PersonelComputer("Macintouch", "23", "Large", 20000, "White", true, true);
        Desktop desktop = new Desktop("Casper", "sprite", "medium", 2000, "White", false, true );
        Laptop laptop = new Laptop("HP", "wers", "medium", 2000, "Grey", true, true);

        iphone.turnOn();
        iphone.turnOff();
        iphone.call(626353);
        iphone.text(2357354);
        System.out.println(iphone);

        samsung.turnOff();
        samsung.turnOn();
        samsung.call(356243561);
        samsung.text(532143251);
        System.out.println(samsung);

        google.turnOff();
        google.turnOff();
        google.call(562532);
        google.text(76346743);
        System.out.println(google);

        personelComputer.turnOn();
        personelComputer.turnOff();
        System.out.println(personelComputer);
    }
}
