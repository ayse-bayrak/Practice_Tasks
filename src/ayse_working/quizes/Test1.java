//package ayse_working.quizes;
//
//public class Test1 {
//
//    public static void main(String[] args) {
//
//        C1 c = new C1();
//        c.m2("CYDEO" + c.m3(4.0));
//
//    }
//
//}
//
//interface I1 {
//
//    void m1();
//    void m2();
//
//}
//
//interface I2 {
//
//    default int m3(double d1) {
//        return (int) Math.sqrt(d1);
//    }
//
//}
//
//class C1 implements I1, I2 { //Class 'C1' must either be declared abstract or implement abstract method 'm2()' in 'I1'
//
//    @Override
//    public void m1() {
//        System.out.println("Method fro C1");
//    }
//
//    @Override
//    public void m2(String str) {
//        System.out.println(str.substring(2, 5));
//    }
//
//}
