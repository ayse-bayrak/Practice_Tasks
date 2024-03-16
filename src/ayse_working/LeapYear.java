package ayse_working;

public class LeapYear {
    public static void main(String[] args) {
        int year = 1900;

            System.out.println(year + "year is a leap year= " + (year%4==0&&year%100!=0||year%400==0));
    }
}
