package ayse_working.GroupMeeting.week12meeting;

public class AliReverseWordsInString {
    public static String reverseStr(String str) {
        String res = "";
        String[] wordArr = str.split(" ");
        for (int i = wordArr.length - 1; i >= 0; i--) {
            if (!wordArr[i].isBlank()) {
                res += " " + wordArr[i].trim();
            }
        }
        return res.trim();
    }

    public static void main(String[] args) {
        System.out.println(reverseStr(" hello     world"));
    }
}
