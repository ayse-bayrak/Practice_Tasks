package day14_for_loop;

public class FINRA_2 {

    public static void main(String[] args) {

        finra(1,100);

    }
    public static String finra(int num1, int num2) {
            String result = "";

            for (int i = num1; i < num2; i++) {
                if (i % 15 == 0) {
                    result = "FINRA ";
                } else if (i % 5 == 0) {
                    result = "FIN ";
                } else if (i % 3 == 0) {
                    result = "RA ";
                } else {
                    result = "" + i;
                }

                System.out.print(result+ " ");
            }
            return result;

        }



}


