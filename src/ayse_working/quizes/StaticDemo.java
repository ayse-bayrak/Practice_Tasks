package ayse_working.quizes;

public class StaticDemo {


    StaticDemo sd = new StaticDemo();

    void method1() {
        method4();                  // Line 1
        StaticDemo.method2();       // Line 2
        //StaticDemo.method3();       // Line 3 compile error
    }

    static void method2() {}

    void method3() {
        method1();                  // Line 4
        method2();                  // Line 5
        sd.method4();               // Line 6
    }

    static void method4() {}

}
