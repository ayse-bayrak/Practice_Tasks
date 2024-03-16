package ayse_working.selfGroupMeeting;

public class IsAlphabetic {

    public static void main(String[] args) {
        String str = "(((W&e**_lco73me %t%o co!@$,,<r>e <<J>>>$@av```~a777.||}{";

        System.out.println(isAlphabetic(str));
    }

    public static String isAlphabetic(String string) {

        String str2 ="";

        for (char each : string.toCharArray()) {
            if (Character.isLetter(each)||Character.isSpaceChar(each)) {
                if (Character.isSpaceChar(each)) {
                    str2+=" ";
                }
                str2 += each+ "";
            }
        }

        return str2;
    }
}
