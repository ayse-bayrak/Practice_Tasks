package day12_custom_method;

public class displayDayName_4 {
    public static void main(String[] args) {

    displayDayName(7);

    int number =9;
    displayDayName(number);

    }

    public static void displayDayName (int number) {
        String dayName = "";
        switch (number){
            case 1: dayName = "Monday"; break;
            case 2: dayName = "Tuesday"; break;
            case 3: dayName = "Wednesday"; break;
            case 4: dayName = "Thursday"; break;
            case 5: dayName = "Friday"; break;
            case 6: dayName = "Saturday"; break;
            case 7: dayName = "Sunday"; break;
            default: dayName = "Invalid Number"; break;
        }
        System.out.println(dayName);
    }
}
/*
Create a method named day that can display the name of the day based on the given number to the method, if the number is invalid, then the method should print the error message "Invalid Number"
    Ex:
        day(5)

        output:
            Friday


 */