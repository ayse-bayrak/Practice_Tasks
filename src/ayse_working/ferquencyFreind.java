package ayse_working;

public class ferquencyFreind {

    public static void main(String[] args) {

        String str = "aaabbccccddeeee";

        char MaxCharNumber = '0';
        int maxFrequency = 0;

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            int currentFrequency = 0;

            for (int j = 0; j < str.length(); j++) {
                if (currentChar == str.charAt(j)) {
                    currentFrequency++;
                }
            }

            if (currentFrequency > maxFrequency) {
                MaxCharNumber = currentChar;
                maxFrequency += currentFrequency;
            }

            if (currentFrequency == maxFrequency) {
                MaxCharNumber += currentChar;
            }

            System.out.println(MaxCharNumber);

        }
        System.out.println(MaxCharNumber);


    }
}


/*
* 1. Write a program that can return the character that has the highest frequency from a string
    Ex:
        str = "aaabbccccddeeee"

        output:
            c
            e*/