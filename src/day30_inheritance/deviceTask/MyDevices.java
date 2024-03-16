package day30_inheritance.deviceTask;

public class MyDevices {
    public static void main(String[] args) {
        Iphone iphone = new Iphone("14", "+", "White", "medium", 1000, true, true);

        PersonelComputer personelComputer = new PersonelComputer("Mac", "M2", "White", "Large", 2000, true, true, 256, 80, true );

        SmartTV smartTV = new SmartTV("Samsung", "34", "White", "Large", 4000, false, true );

        iphone.turnOn();
        personelComputer.turnOn();
        smartTV.turnOn();

        iphone.turnOff();
        personelComputer.turnOff();
        smartTV.turnOff();

        System.out.println("=========================================");

        iphone.call(3424234234l);
        iphone.text(324232534l);

        smartTV.turnOn();
        smartTV.turnOff();

        personelComputer.madeIn();

        System.out.println("=========================================");

        System.out.println(iphone);
        System.out.println(personelComputer);
        System.out.println(smartTV);
    }
}
/*
Create a class named MyDevices:
			Create the objects of each subclasses and

			test all the functions of each object

            Analyze the relationships between the classes

 */