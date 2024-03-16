package ayse_working;

public class MocInterview {
    public static void main(String[] args) {

        String str = "Java";
        System.out.println(reversed(str));
    }

    public static String reversed (String str) {
        String reverseStr = "";
        for (int i = str.length()-1; i >=0 ; i--) {
            reverseStr += str.charAt(i);
        }
     return reverseStr;
    }
}

/*
How to reverse String in Java?
 */