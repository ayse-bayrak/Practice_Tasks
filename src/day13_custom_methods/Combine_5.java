package day13_custom_methods;

public class Combine_5 {
    public static void main(String[] args) {

        combine("one","eight");
    }
    public static void combine(String w1, String w2) {
        String result ="";
        if ((w1.charAt(w1.length()-1)==w2.charAt(0))) {
           result = w1.substring(0,w1.length()-1)+w2;
        }else {
            result = w1+w2;
        }
        System.out.println(result);
    }

}
/*
5.  Create a method named combine that can take two string and hen add them together and returns it.
        But if the last letter of the first word and the first letter of the last letter are the same, return that character once.
    Ex:
        combine("one", "eight")  ==> oneight
 */