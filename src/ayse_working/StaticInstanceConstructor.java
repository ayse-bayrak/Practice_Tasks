package ayse_working;

class A {
        String s = "Class A";
    }
    class B extends A {
        String s = "Class B";
        {
            System.out.println(super.s);
        } }
    class C extends B { String s = "Class C";
        {
            System.out.println(super.s);
        } }
    class MainClass {
        public static void main(String[] args) {
            C c = new C();
            System.out.println(c.s); }
    }

/*
Class A
Class B
Class C
 */

/*
When an object of class C is created:
The superclass (A) constructor is called first.
Then, the constructor of class B is called.
Finally, the constructor of class C is called.
*/