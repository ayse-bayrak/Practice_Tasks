package day19_array_intro;

public class ClassmateReverse_2 {
    public static void main(String[] args) {
        String[] classmates = {"Umit Bulut", "Esma Gul Karci", "Zeynep Ozturk", "Asiye Yasar", "Doga Unver", "Seckin Kurklu", "Arzugul Erkin", "Ramazan Seckin Kurklu" , "Alim Zahir", "Alan Uygur", "Abuduxikeer Shawuti" };

        for (int i = 0; i < 10; i++) {
          String reverse = "";
            for (int j = classmates[i].length()-1; j >=0 ; j--) {

               reverse += classmates[i].charAt(j);
            }

            System.out.println(reverse);
        }
    }
}
/*
2. create a string array, and store the names of your classmates (10)
            reverse each student's names and print them in separate lines
            	ex:
            		arr = {java, python, c#}

        		output:
        			avaJ
        			nohtyp
        			#c
 */