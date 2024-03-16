package day07_if_statement_practice_task;
/*
6. Create a class called FINRA; write a function that prints out the number. but for a number which is a multiple of 3, print "FIN" instead of the number, and for a number which is a multiple of 5, print "RA" instead of the number. and for a number that is a multiple of both 3 and 5, print "FINRA" instead of the number.
            ex:
                number = 3

                output:
                      FIN


                number = 10

	            output:
	                RA

            	number = 15

	            output:
	                FINRA

 */
public class FINRA_6 {
    public static void main(String[] args) {
        int number = 16;
        String result = "";
        if (number % 3 == 0 || number % 5 == 0) {
            if (number % 3 == 0 && number % 5 == 0) result = "FINRA";
            else if (number % 3 == 0) result = "FIN";
            else result = "RA";
        }
        else result = "" + number;
        System.out.println(result);
    }
}
