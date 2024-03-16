package ayse_working.GroupMeeting.week16;

import java.util.*;

public class FrequencyOfCharacters {

    public static void main(String[] args) {
        String str = "responsible";
        //String str = "";
        //String str = null;
        if (str == null) {
            System.out.println("input is null");
        } else if (str.isEmpty()) {
            System.out.println("empty map"); ;
        } else {
            System.out.println(frequencyOfCharacter(str));
        }
        // I could not add if statements in the method
    }

    public static Map<String, Integer> frequencyOfCharacter(String str) {

            String[] str1 = str.split("");
            ArrayList str2 = new ArrayList<>(Arrays.asList(str1));
            Map<String, Integer> map = new LinkedHashMap<>();

            for (String each : str1) {
                int frequency = 0;
                frequency = Collections.frequency(str2, each);
                map.put(each, frequency);
            }
            return map;
    }
}
