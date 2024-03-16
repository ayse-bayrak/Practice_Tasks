package day08_ternary_switch_practice;

/*
5. Create a class called ChooseLanguage,
 		Given an integer variable named selection that has a number between 1~5.
 		Write a program that can select the language based on the number that's given in the selection and print the following message:

			for 1: Hello, thank you for your call
			for 2: Hola, gracias para llamar
			for 3: Merhaba, aradiginiz icin tesekkurler
			for 4: Privet, spasibo za vash zvonok
			for 5: Merci ,pour votre appel

			for any other numbers print "Invalid Number"

		Solution 1: Must use ternary
		Solution 2: MUST use the switch statement

 */
public class ChooseLanguage_3 {
    public static void main(String[] args) {
        int num=8;
        //solution 1 with ternary
        String result=(num==1)?"Hello, thank you for your call":
                (num==2)?"Hola, gracias para llamar":
                        (num==3)?"Merhaba, aradiginiz icin tesekkurler":
                                (num==4)?"Privet, spasibo za vash zvonok":
                                        (num==5)?"Merci ,pour votre appel":"Invalid Number";
        System.out.println(result);

        System.out.println("========with switch statement==========");

        switch (num){
            case 1:
                result="Hello, thank you for your call";
                break;
            case 2:
                result="Hola, gracias para llamar";
                break;
            case 3:
                result="Merhaba, aradiginiz icin tesekkurler";
                break;
            case 4:
                result ="Privet, spasibo za vash zvonok";
                break;
            case 5:
                result = "Merci ,pour votre appel\":\"Invalid Number";
                break;
        }
        System.out.println(result);

    }}


