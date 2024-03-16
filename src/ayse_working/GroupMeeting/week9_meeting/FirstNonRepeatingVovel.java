package ayse_working.GroupMeeting.week9_meeting;

public class FirstNonRepeatingVovel {

//    Given a string, write a method to find the first non-repeating vowel (a, e, i, o, u)
//    in it and return its index. If it doesn't exist, return -1. Assume that all the
//    characters of the String is lowercase.
//    google ===> 5
//    googlee ===> -1

    public static void main(String[] args) {

        String given = "google";
        //              012345
        // a e i o
        int index = firstNonRepeatingVowel(given);
        int index2 = firstNonRepeatingVowel2(given);
        System.out.println(index);
        System.out.println(index2);

    }

    private static int firstNonRepeatingVowel(String given) {
        for (int i = 0; i < given.length(); i++) {

            if (given.charAt(i) == 'a' ||
                    given.charAt(i) == 'e' ||
                    given.charAt(i) == 'i' ||
                    given.charAt(i) == 'o'
                    || given.charAt(i) == 'u') {

                if (given.indexOf(given.charAt(i)) == given.lastIndexOf(given.charAt(i))) {
                    return i;
                }
            }
        }
        return -1;
    }

    private static int firstNonRepeatingVowel2(String given) {

        for (int i = 0; i < given.length(); i++) {
            if (   given.charAt(i) == 'a'
                    || given.charAt(i) == 'o'
                    || given.charAt(i) == 'i'
                    || given.charAt(i) == 'e'){
                int count = countThatCharacter(given.charAt(i), given);
                if (count == 1) return i;
            }
        }
        return -1;
    }

    private static int countThatCharacter(char c, String given) {
        int count = 0;
        for (int i = 0; i < given.length(); i++) {
            if (given.charAt(i) == c){
                count++;
            }
        }
        return count;
    }
}
