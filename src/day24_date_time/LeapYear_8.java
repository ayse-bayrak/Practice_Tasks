package day24_date_time;

import java.time.LocalDate;

public class LeapYear_8 {
    public static void main(String[] args) {
            int birthYear = 2000;
        if (isLeapYear(birthYear)) {
            System.out.println("Year is leap year");
        } else {
            System.out.println("Year is not leap year");
        }
    }

    public static boolean isLeapYear(int birthYear){
        return LocalDate.of(birthYear,1,1).isLeapYear();
    }

}
/*

8. Create a function that accepts an int argument birthYear,
return true if the person was born on leap year,
otherwise return false
 */