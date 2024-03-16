package day29_inharitance.Phone;

public class TestPhone {

    public static void main(String[] args) {

        Iphone iphone = new Iphone();
        iphone.setInfo("14+", "large", 1000, "White" );

        System.out.println(iphone);
        iphone.faceTime("aysegunes");
        iphone.faceTime(5323218212l);

        Samsung samsung = new Samsung();
        samsung.setInfo( "Note10", "Medium", 900, "Black");
        System.out.println(samsung);
        samsung.freeze();

        Nokia nokia = new Nokia();
        nokia.setInfo( "3310","Small", 800, "Red");
        System.out.println(nokia);
        nokia.selfDefense();

    }

    }

