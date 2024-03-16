package ayse_working.quizes;

public class MainClass1 {

    public static void main(String[] args) {

        Y.staticMethod();

    }

}

class X {

    static final void staticMethod() {
        System.out.println("Class X");
    }

}

class Y extends X {

//    static void staticMethod() { //staticMethod()' cannot override; overridden method is final
//        System.out.println("Class Y");
//    }

}