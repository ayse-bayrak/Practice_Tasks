package day06_if_statement_intro_practice_tasks;

public class AgeGroups_6 {
    public static void main(String[] args) {
        int age = 45;
        String result = "";

        if (age >= 1 && age <= 2) {
            result = "infant";}
        else if (age <= 5) {
            result = "Toddler";}
        else if (age <= 9) {
            result = "Kid";}
        else if (age <= 12) {
            result = "Pre-Teen";}
        else if ( age <= 17) {
            result = "Teenager";}
        else if (age <= 20) {
            result = "Young Adult";}
        else if (age <= 39) {
            result = "Adult"; }
        else if (age <= 49) {
            result = "Young Middle-Aged Adult";}
        else if ( age <= 54) {
            result = "Middle-Aged Adult";}
        else if (age <= 64) {
            result = "Very Young Senior Citizen";}
        else if (age <= 74) {
            result = "Young Senior Citizen"; }
        else if ( age <= 84) {
            result = "Senior Citizen";}
        else {
            result = "Old Senior Citizen";}
        System.out.println(result);
    }
}
/*
6. Create a class named AgeGroups, an integer variable named age is declared and given.
write a program
that can define the age groups of a person
	             age groups are:
	                    infant (1 - 2)
	                    Toddler (3 - 5),
	                    Kid (6 - 9),
	                    Pre-Teen (10 - 12),
	                    Teenager (13 - 17),
	                    Young Adult (18 - 20),
	                    Adult (21 - 39),
	                    Young Middle-Aged Adult (40 - 49),
	                    Middle-Aged Adult (50 - 54),
	                    Very Young Senior Citizen (55 - 64),
	                    Young Senior Citizen (65 - 74),
	                    Senior Citizen (75 - 84),
	                    Old Senior Citizen (85+)

            Note: Do not use more than one print statement

 */