package ayse_working.GroupMeeting.week19;

import java.util.List;

public class CountSmileBruteForce {
    public static void main(String[] args) {

        String[] array1 = {":)", ";(", ";}", ":-D"};
        String[] array2 ={";D", ":-(", ":-)", ";~)"};
        String[] array3 ={";]", ":[", ";*", ":$", ";-D" };

        System.out.println(countSmileys(array1)); //2
        System.out.println(countSmileys(array2)); //3
        System.out.println(countSmileys(array3)); //1


    }

    public static int countSmileys(String[] a ) {

        String valid = ":),:-),:~), ;~) :D, :-D, ;-D, ;D , :~D ";
        String invalid = ";(, :>, :}, :]";
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (valid.contains(a[i])&&!invalid.contains(a[i])){
                count++;
            };
        }

        return count;
    }

}
