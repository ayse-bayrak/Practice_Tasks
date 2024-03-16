package ayse_working.quizes;

public class MainClass {

    public static void main(String[] args) {

        C c = new C(4);

        String value = "";

    }

}
// A constructor 4
class A {

    public A(int a){
        System.out.println(" A constructor " + a);
    }

    {
        System.out.println("A instance");
    }

    static {
        System.out.println("A static");
    }
}
class B extends A {

    static {  // because of the static block, when we come to here it is executed
        System.out.println("2 B STATIC");
    }

    {
        System.out.println("4 B instance");
    }

    public B(int a) {
        super(a);
        System.out.println("B constructor");
    }

//    public B(){
//        System.out.println("constructor");
//    }

}

class C extends B {


    {
        System.out.println("3 C instance");
    }

    public C(int a) {
        super(a);
        System.out.println("C constructor");
    }
}