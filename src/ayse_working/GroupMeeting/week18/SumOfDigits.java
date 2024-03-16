package ayse_working.GroupMeeting.week18;

import java.util.ArrayList;

public class SumOfDigits {
    public static void main(String[] args) {
        int n = 687;
        System.out.println("sum of Digit: " + sumOfDigit(n)); //21
        System.out.println("sum Of Digit Until Single Digits: " + sumOfDigitUntilSingleDigits(n)); //3
        System.out.println("sum Of Digit2: " + sumOfDigit2(n));
        System.out.println("sum Of Digit Until Single Digits2: " + sumOfDigitUntilSingleDigits2(n));
    }

    public static int sumOfDigit(Integer n) {
        int sum = 0;

        for (int i = 0; i < String.valueOf(n).length(); i++) {
            sum += Integer.parseInt("" + String.valueOf(n).charAt(i));
        }
        return sum;
    }

    public static int sumOfDigitUntilSingleDigits(int n) {

        do {
            int sum = 0;
            n = sumOfDigit(n);
            sum = 0;
        } while (("" + n).length() != 1);
        return n;
    }

    public static int sumOfDigit2(int n) {
        int sum = 0;
        while (n != 0) {
            int digit = n % 10;
            sum += digit;
            n /= 10;
        }
        return sum;
    }

    public static int sumOfDigitUntilSingleDigits2(int n) {
        int sum = n;
        while (sum > 9) {
            sum = sumOfDigit2(sum);
        }
        return sum;
    }

    // shumeyse solution's

    public static int sumOfDigits(int num) {
        int result = 0;
        while (num > 0) {
            result += num % 10;
            num /= 10;
        }
        return result;
    }

    public static int sumOfDigitsRoot(int num) {
        int result = 0;
        while (num > 0) {
            result += num % 10;
            num /= 10;
        }
        if (result < 10)
            return result;
        return sumOfDigits(result);
    }

    public static int sumDigits(int input) {
        ArrayList<Integer> list = new ArrayList<>();
        while (input > 0) {
            list.add(input % 10); //add remainder of input/10, which is the last digit
            input /= 10; //remove last digit
        }
        return list.stream().reduce(0, Integer::sum); //add together each number from list
    }

    // QUESTION 2
    public static int recursiveSumDigits(int input) {
        while (input > 9)
            input = sumDigits(input);
        return input;
    }

    public static void SumOfDigits3(int input) {
        {
            int output = 0;
            String str = String.valueOf(input);
            for (String digit : str.split("")) {
                output += Integer.parseInt(digit);
            }
            System.out.println(output);
        }
    }

    public static void DigitRoot(int input) {
        while (input / 10 != 0) {
            int temp = 0;
            String str = String.valueOf(input);
            for (String digit : str.split("")) {
                temp += Integer.parseInt(digit);
            }
            input = temp;
        }
    }
}
