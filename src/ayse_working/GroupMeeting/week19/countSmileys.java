package ayse_working.GroupMeeting.week19;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class countSmileys {

    public static void main(String[] args) {


        String[] arr1 = {":)", ";(", ";}", ":-D"};
        String[] arr2 ={";D", ":-(", ":-)", ";~)"};
        String[] arr3 ={";]", ":[", ";*", ":$", ";-D" };

        List<String> array1 = List.of(":)", ";(", ";}", ":-D");
        List<String> array2 = List.of(";D", ":-(", ":-)", ";~)");
        List<String> array3 = List.of(";]", ":[", ";*", ":$", ";-D");
        System.out.println("countSmileys1-brute force");
        System.out.println(countSmileys1(arr1)); //2
        System.out.println(countSmileys1(arr2)); //3
        System.out.println(countSmileys1(arr3)); //1

        System.out.println("countSmileys2");
        System.out.println(countSmileys2(array1)); //2
        System.out.println(countSmileys2(array2)); //3
        System.out.println(countSmileys2(array3)); //1

        System.out.println("countSmileys3");
        System.out.println(countSmileys3(arr1)); //2
        System.out.println(countSmileys3(arr2)); //3
        System.out.println(countSmileys3(arr3)); //1

    }

    public static int countSmileys1(String[] a ) {

        String valid = ":),:-),:~), ;), ;~), ;-), :D, :-D, :~D, ;D, ;~D, ;-D";
        String invalid = ";(, :>, :}, :]";
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (valid.contains(a[i])&&!invalid.contains(a[i])){
                count++;
            };
        }

        return count;
    }

    public static int countSmileys2(List<String> arr ) {
        int count = 0;
        String valid = ":),:-),:~), ;), ;~), ;-), :D, :-D, :~D, ;D, ;~D, ;-D";
        String invalid = ";(, :>, :}, :]";
        for (int i = 0; i < arr.size(); i++) {
            if (valid.contains(arr.get(i))&&!invalid.contains(arr.get(i))){
                count++;
            };
        }
        return count;
    }

    public static int countSmileys3( String[] arr ){
        Map<Integer,String> emoji= new LinkedHashMap<>();

        emoji.put(1,":)");
        emoji.put(2,":D");
        emoji.put(3,":~D");
        emoji.put(4,":~)");
        emoji.put(5,";)");
        emoji.put(6,";D");
        emoji.put(7,";~D");
        emoji.put(8,";~)");
        emoji.put(9,":-)");
        emoji.put(10,";-)");
        emoji.put(11,":-D");
        emoji.put(12, ";-D");
        int count = 0;
        for (String eachEmoji : arr) {
            for (String eachValue : emoji.values()) {
                if (eachValue.equals(eachEmoji)){
                    count++;
                }
            }
        }
        return count;
    }
}

/*
Given an array (arr) as an argument complete the function countSmileys that should return the total number of smiling faces.

Rules for a smiling face:

Each smiley face must contain a valid pair of eyes. Eyes can be marked as : or ;
A smiley face can have a nose but it does not have to. Valid characters for a nose are - or ~
Every smiling face must have a smiling mouth that should be marked with either ) or D
No additional characters are allowed except for those mentioned.

Valid smiley face examples: :) :D ;-D :~)
Invalid smiley faces: ;( :> :} :]

Example
countSmileys([':)', ';(', ';}', ':-D']);       // should return 2;
countSmileys([';D', ':-(', ':-)', ';~)']);     // should return 3;
countSmileys([';]', ':[', ';*', ':$', ';-D']); // should return 1;
Note
In case of an empty array return 0. You will not be tested with invalid input (input will always be an array). Order of the face (eyes, nose, mouth) elements will always be the same.
 */