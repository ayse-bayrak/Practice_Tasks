package day19_array_intro;

public class ClassmatesInitial_1 {
    public static void main(String[] args) {

        String[] classmates = {"Umit Bulut", "Esma Gul Karci", "Zeynep Ozturk", "Asiye Yasar", "Doga Unver", "Seckin Kurklu", "Arzugul Erkin", "Ramazan Seckin Kurklu" , "Alim Zahir", "Alan Uygur", "Abuduxikeer Shawuti" };

        for (int i = 0; i < classmates.length; i++) {
            //System.out.println(classmates[i]);
            String initial = classmates[i].charAt(0) + "." + (classmates[i].charAt(classmates[i].indexOf(" ")+1) + ".");
            System.out.println(initial);
        }
    }
}
/*
1. create an array of named classmates, and store 10 of your classmates' full names
            print the initials of each classmate in separate lines

 */