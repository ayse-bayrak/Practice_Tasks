package day20_arrays_continue_for_each;
public class UniqueElements_Task5 {
    public static void main(String[] args) {
        int[] array = {1, 2, 1, 4, 5, 2, 6, 7, 8, 6, 9};

        String result = "";
        int unique = 0;
        for (int each : array) {
            int frequency = 0;
            for (int each1 : array) {
                if (each == each1) {
                    frequency++;
                }
            }


            if ((frequency == 1) && (!result.contains(each + ""))) {
                result += each + " ";
                unique++;
            }


            /*
            OR YOU COULD DO LIKE THIS

            if (frequency==1) {
                System.out.println(each + " ");
            }
             */

        }
        System.out.println("number of the unique elements = " + unique);
        System.out.println("the unique elements of an array = " + result);
    }
}
/*
Write a program that can display the unique elements of an array

			MUST use for each loop
 */