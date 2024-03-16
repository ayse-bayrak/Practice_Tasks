package day18_java_memory_allocation;

public class Offer {
    public String  location, companyName, jobTitle;
    public long salary;
    boolean hasBenefit, hasPTO, isWFH, isFullTime  ;

    public void setInfo(String location, String companyName, String jobTitle, long salary, boolean hasBenefit, boolean hasPTO, boolean isWFH, boolean isFullTime) {
        this.location = location;
        this.companyName = companyName;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.hasBenefit = hasBenefit;
        this.hasPTO = hasPTO;
        this.isWFH = isWFH;
        this.isFullTime = isFullTime;
    }

    public String toString() {
        return "Offer: " +
                "location='" + location + '\'' +
                ", companyName='" + companyName + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", hasBenefit=" + hasBenefit +
                ", hasPTO=" + hasPTO +
                ", isWFH=" + isWFH +
                ", isFullTime=" + isFullTime;
    }
   //for test Offer objects, I create main method in the same class
    public static void main(String[] args) {

        Offer offer1 = new Offer();
        offer1.setInfo("Ankara", "TUBITAK","Industrial Engineer", 100000000, true, true, true, true);

        System.out.println(offer1);

        //Offer offer2 = new Offer();
    }
}
/*
Create a custom class named Offer
        Attributes:
                location
                companyName
                jobTitle
                salary
                hasBenefit
                hasPTO
                isWFH
                isFullTime

        Actions:
            setInfo(): sets all the instance variables
            toString(): returns the full info of the Offer Object
 */