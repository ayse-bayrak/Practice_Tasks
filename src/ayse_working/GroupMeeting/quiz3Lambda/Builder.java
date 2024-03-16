package ayse_working.GroupMeeting.quiz3Lambda;

class Laptop {

    private String CPU;
    private String screenSize;
    private String OS;

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public String getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    @Override
    public String toString() {
        return "ayse_working.GroupMeeting.quiz3Lambda.Laptop{" +
                "CPU='" + CPU + '\'' +
                ", screenSize='" + screenSize + '\'' +
                ", OS='" + OS + '\'' +
                '}';
    }
}



interface LaptopBuilder {
    Laptop build();
}

public class Builder {

    public static void main(String[] args) {

        Laptop hpLaptop = build(() -> {

            Laptop laptop = new Laptop();

            laptop.setCPU("Intel Core i9");
            laptop.setScreenSize("17.3 in");
            laptop.setOS("Windows 11");

            return laptop;

        });

        System.out.println(hpLaptop);

    }

    public static Laptop build(LaptopBuilder laptopBuilder) {
        return laptopBuilder.build();
    }

}