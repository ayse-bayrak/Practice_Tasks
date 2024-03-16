package ayse_working.selfGroupMeeting;

        import java.util.ArrayList;
        import java.util.Arrays;
        import java.util.Collections;

public class NthLargestNumber {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 7, 8, 8));

        System.out.println(numbers);

        int n = 3;

        if (n > numbers.size()) {
            System.out.println("Not enough elements in the arraylist");
            return;
        }

        for (int i = 0; i < n - 1; i++) {  //i=0,1

            numbers.removeIf(p -> Collections.max(numbers) == p);// delete max number in the collection

        }

        /*
        1-
        numbers.removeIf( p -> Collections.max(numbers) == p);
        System.out.println(numbers);
        2-
        numbers.removeIf( p -> Collections.max(numbers) == p);
        System.out.println(numbers);
        3-
        numbers.removeIf( p -> Collections.max(numbers) == p);
        System.out.println(numbers);
*/

        System.out.println(Collections.max(numbers));



        /*
         To return the Nth maximum number, we remove first (N-1) maximum numbers.
          then the next max number will be the Nth max number of the collection

          N =5th max number
          we will remove N-1 max number

          {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10}

          and then Nth max number

          {1, 2, 3, 4, 5, 6} ===> 6

          To return the Nth minimum number, we remove first (N-1) minimum numbers.
          then the next min number will be the Nth min number of the collection

           N =3th max number
          we will remove N-1 min number, 2

          {1, 1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10}

          {            3, 4, 5, 6, 7, 8, 9, 10, 10, 10} ===> 3

         */


    }
}
/*
2. write a program that can return the nth largest number from an arraylist
            ex:
                arraylist = {1,2,3,4,5,6,7,7,}
                n = 5
                n = 3

            output:
                4
                6
 */