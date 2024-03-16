package day27_access_modifier;

public class TestIphone {
    public static void main(String[] args) {
     Iphone iphone1 = new Iphone("14 + ", "Big", "White" , 1000);

     iphone1.call(5333218212l);
     iphone1.text(5333218212l);
     iphone1.faceTime("aysegunes.bayrak82@gmail.com");
     iphone1.faceTime(5333218212l);

        System.out.println(iphone1);

    }
}
