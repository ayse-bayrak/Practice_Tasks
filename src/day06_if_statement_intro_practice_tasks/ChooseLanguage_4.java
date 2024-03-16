package day06_if_statement_intro_practice_tasks;
/*
4. Create a class named ChooseLanguage,
Given an integer variable named selection that
has a number between 1~5, Write a program that
can select the language based on the number
that's given in the selection and prints the following message:

		for 1: Hello, thank for your call
		for 2: Hola, gracias para llamar
		for 3: Merhaba, aradiginiz icin tesekkurler
		for 4: Privet, spasibo za vash zvonok
		for 5: Merci ,pour votre appel

	Note: Do not use more than one print statement
 */
public class ChooseLanguage_4 {
    public static void main(String[] args) {
        int n = 3;
        String result = "--";

        if (n == 1){
            result = "Hello, thank for your call";
        }
        else if (n == 2) {
            result = "Hola, gracias para llamar";
        }
        else if (n == 3){
            result = "Merhaba, aradiginiz icin tesekkurler";
        } else if (n == 4) {
            result = "Privet, spasibo za vash zvonok";
        } else if (n == 5) {
            result = "Merci ,pour votre appel";
        }
        System.out.println(result);
    }
}
