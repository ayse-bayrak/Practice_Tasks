package day26_static.restaurant;

import java.time.LocalDate;

public class Server {

    public String name;
    public int employeeID;
    public double hourlyRate;
    public boolean isFullTime;
    public LocalDate hire_date;

    public Server(String name, int employeeID, double hourlyRate, boolean fullTime, LocalDate hire_date) {
        this.name = name;
        this.employeeID = employeeID;
        this.hourlyRate = hourlyRate;
        this.isFullTime = fullTime;
        this.hire_date = hire_date;
    }

    public void takeOrder() {
        System.out.println(name + " is taking an order");
    }

    public void cleanTable() {
        System.out.println(name + " is cleaning the table");
    }

    @Override
    public String toString() {
        String fullTimeStatus = "Part Time";

        if (isFullTime) {
            fullTimeStatus = "Full Time";
        }
        return "Server{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", hourlyRate=" + hourlyRate +
                ", fullTime=" + (isFullTime?"Full Time":"Part Time") +
                ", hire_date=" + hire_date +
                '}';
    }
}
/*
4. Restaurant Task:
		4.1  Create a class called Server

	        Attributes:
	                name (String), employeeID (int), hourlyRate (double), fullTime (boolean), hire_date (LocalDate)

			Add A constructor that can set all the fields.

	        Actions: (all void methods)
	            takeOrder(): server's name + "is taking an order"
	            cleanTable(): server's name + "is cleaning the table"
	            toString(): Returns (String) all the information of a Server
	                -> Extra: For fullTime status, instead of printing a boolean value, print "full-time" or "part-time."

 */