package day14_for_loop;

public class palindrome_7 {
    public static void main(String[] args) {

      palindrome("545");
      palindrome("anna");

    }

    public static void palindrome (String word) {

        word = word.toLowerCase();
        String reverseWord ="";
        for (int i = word.length()-1; i >= 0; i--) {
            reverseWord +=word.charAt(i);
        }
        System.out.println("reverseWord = " + reverseWord);
        System.out.println("word = " + word);

        if (reverseWord.equals(word)) {
            System.out.println(true);
        }else {
            System.out.println(false);
        }
        
    }

}

/*
A palindrome number is a number that is same after reverse
545, 151, 34543
 */