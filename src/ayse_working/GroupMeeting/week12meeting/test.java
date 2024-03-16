package ayse_working.GroupMeeting.week12meeting;

public class test {

        public static void main(String[] args) {
            // Test cases
            System.out.println(breakCamelCase("camelCasing"));          // Output: "camel Casing"
            System.out.println(breakCamelCase("weLoveProgramming"));    // Output: "we Love Programming"
            System.out.println(breakCamelCase("identifier"));           // Output: "identifier"
            System.out.println(breakCamelCase(""));                      // Output: ""
            System.out.println(breakCamelCase(null));                    // Output: ""
        }

        public static String breakCamelCase(String camelCaseString) {
            // Check for null or empty input
            if (camelCaseString == null || camelCaseString.isEmpty()) {
                return "";
            }

            // Use a StringBuilder to efficiently build the result
            StringBuilder result = new StringBuilder();

            // Iterate through each character in the input string
            for (char ch : camelCaseString.toCharArray()) {
                // Check if the character is an uppercase letter
                if (Character.isUpperCase(ch)) {
                    // Insert a space before the uppercase letter
                    result.append(" ").append(ch);
                    System.out.println(result);
                } else {
                    // Otherwise, append the character as is
                    result.append(ch);
                }
            }

            // Convert the StringBuilder to a String and trim leading space if any
            return result.toString().trim();
        }

}
