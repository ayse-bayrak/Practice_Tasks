package ayse_working.quizes;
// compile error
public class OrderDriver1 {

    public static void main(String[] args) {

        Order1 order = new Order1("f");//  create object from class order 1
        order = new Order1();
      System.out.println(Order1.value);//Non-static field 'value' cannot be referenced from a static context

    }
//  value= tacbfacb, 17 line only one time execute
}

class Order1 {

    static String value = "t";

    {
        value += "a";
    }

    {
        value += "c";
    }

    public Order1() {
        value += "b";
    }

    public Order1(String str) {
        this();
        value += str;
    }

}