package day20_arrays_continue_for_each;
public class CommanElements_Task3 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {4,5,6,7,8};

        for (int each : arr1) {

            for (int each1 : arr2) {
                if(each==each1) {
                    System.out.print(each + " "); // 4 5
                }
            }
        }
    }
}
/*
3. Write a program that can print out the common elements from two integer array
          Ex:
              arr1: {1,2,3,4,5}
              arr2: {4,5,6,7,8}

          output:
              4 5


          MUST use for each loop
 */