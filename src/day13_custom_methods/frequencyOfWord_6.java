package day13_custom_methods;

public class frequencyOfWord_6 {
    public static void main(String[] args) {
        frequencyOfWord("Java java jAvA", "java");
    }
    public static void frequencyOfWord (String sentence, String word) {

    String  sentence2=  sentence.toLowerCase().replace("java",word.toLowerCase().substring(0,word.length()-1));
    int frequencyOfWord=sentence.length()-sentence2.length();
        System.out.println(frequencyOfWord);

    }
}
/*
6. Create a method named frequencyOfWord that takes two arguments:
            1. sentence (String)
            2. word (String)

    The method should return the frequency of the word from the sentence

        Ex:
            frequencyOfWord("Java java jAvA", "java")  ==> 4

 */