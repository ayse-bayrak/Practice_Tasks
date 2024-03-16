package ayse_working.quizes;

import day28_encapsulation.Credentials;

public class TestQuizEncapsulation {

    static String studentName  = "Mike";
    static {
        studentName = "Jordan";
    }


//    static String name = "John";
//            String id = "123";

    public static void main(String[] args) {

        studentName = "Jean";

        System.out.println(studentName);
//        JaneSystem.out.println(name);
//        System.out.println(id+1);
//        credential c = new credential();
//        c.start
//        credential obj = new credential();
//        System.out.println(obj.getPassword());
    }
}
