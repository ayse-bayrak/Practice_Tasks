package ayse_working.GroupMeeting.week12meeting;

public class AliBreakCamelCase {
    public static String breakCamelCase(String str) {
        String res = "";
        if (str==null || str.isBlank()) {
            return res;
        }
        for (char each : str.toCharArray()) {
            if (Character.isUpperCase(each)) {
                res += " " + each;
            } else {
                res += each;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(breakCamelCase("  ILoveJava "));
    }
}
