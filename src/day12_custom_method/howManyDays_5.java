package day12_custom_method;

public class howManyDays_5 {
    public static void main(String[] args) {

        howManyDays("june");

    }
    public static void howManyDays(String month) {

        month = month.substring(0,1).toUpperCase() + month.substring(1).toLowerCase();

        String result;
        switch (month) {
            case "January":result = month + " has 31 days"; break;
            case "April":result = month + " has 31 days"; break;
            case "June":result = month +" has 31 days"; break;
            case "September": result = month +" has 31 days"; break;
            case "November": result = month +" has 31 days"; break;
            case "February": result = month +" has 28 days"; break;
            case "March":result = month +" has 30 days" ; break;
            case "May":result = month +" has 30 days" ; break;
            case "July":result = month +" has 30 days" ; break;
            case "August": result = month +" has 30 days" ; break;
            case "October": result = month +" has 30 days" ; break;
            case "December": result = month +" has 30 days" ; break;
            default:result="Invalid number";
        }

        System.out.println(result);

    }


    }


/*
Create a method that can print how many days a month has
    Ex:
        month("jUNe")

        output:
            June has 30 days
            January: 31 days

February: 28
March:May:July: August:  October:December: 31 days
April: June: September:November: 30 days

2: 28
3, 5, 7, 8, 10, 12 : 30
1, 4, 6, 9, 11 :31


 */