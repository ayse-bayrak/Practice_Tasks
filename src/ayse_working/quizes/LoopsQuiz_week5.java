package ayse_working.quizes;

public class LoopsQuiz_week5 {
    public static void main(String[] args) {

        System.out.println("=========10=======");

        String s = "Cydeo";
        for (int i = 0; i < s.length(); i += 3) {

            System.out.println(s.charAt(i));
        }

        //output:
        //c
        //e

        System.out.println("=========9=======");

        int num = 10;
        do {
            num+=5;
        }while (num<15);
        System.out.println(num);
        //output:15

        System.out.println("=========8=======");
        int z = 5;
        for (int i = 5; i > 0; i --) {
            z+=i;
        }System.out.println(z);
     //output:20

        System.out.println("=========7=======");
/*
Which of the following loop is best to use when the repetition number of the code is fixed?
For Loop
 */
        System.out.println("=========6=======");

        /*
        The while loop is best to use when the repetition number of the code is NOT fixed.
        True
         */
        System.out.println("=========5=======");

//        for (int i = 0; i < 5; i --) {
//            System.out.println("hello cydeo");
//        }
        //output:infinite loop

        System.out.println("=========4=======");
        int j = 7;
        for (int i = 0; i < j-1 ; i +=2) {
            System.out.println(i);
        }
        //output:
        /*
        0
        2
        4
        */

        System.out.println("=========3=======");
        int a = 0;
        while (a<=6){
            a +=2;
        }
        System.out.println(" a = " + a);
        //output:
        /*
        a = 8
        */

        System.out.println("=========2=======");
    /*
    What does the break statement do when it's given in a loop's body?
    answer: it exits the loop immediately
    */

        System.out.println("=========1=======");
    /*
    While loop executes the body of the loop first, before checking the condition.
    False
     */

    }
}
