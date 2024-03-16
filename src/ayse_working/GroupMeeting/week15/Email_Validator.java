package ayse_working.GroupMeeting.week15;

import java.util.Objects;

public class Email_Validator {
    public static void main(String[] args) {
        // String email = "test@cydeo.com"; // true
        // String email = email = "test@cydeo.co.uk"; // true
        // String email = "mike.smith@cydeo.com"; // true
        // String email = "mike.smith@com"; // false
        // String email = "@cydeo.com"; // false
        // String email = "test@.com"; // false
        // String email = "test@cydeo."; //false
        String email = "test@@cydeo.com";
        boolean result = emailValidator(email);
        if (result) {
            System.out.println("an email is valid");
        } else {
            System.out.println("an email is invalid");
        }
    }
    public static boolean emailValidator(String email){

        String[] str1 = email.split("");

        int atCharacter = 0;
        int dotCharacter = 0;
        boolean appropriatePlace = false;

        for (int i=0; i< str1.length; i++) {
            if(Objects.equals(str1[i], "@")) {
                atCharacter++;
            }
            if(Objects.equals(str1[i], ".")){
                dotCharacter ++;
            }
        }
        // The '.' and '@' must be in the appropriatePlace
        //it contains also this requirement "The '@' must contain at least one character in front of it"
        // mean I think @ can not be first character

        if ((!str1[str1.length-1].equals("."))&& (!str1[str1.length-1].equals("@")) &&
                (!str1[0].equals(".")) && (!str1[0].equals("@")) && (!email.contains("@com")) &&
                (!email.contains(".@"))&&(!email.contains("@.")) )
        {
            appropriatePlace = true;
        }
        // if all conditions are true
        if ( atCharacter == 1 && dotCharacter >= 1 && appropriatePlace ) {
            return true;

        } else {
            return false;
        }
    }
}
/*
 Question-1 Email Validator
Your team has created a new bank website that requires email addresses to be validated.
• The email string must contain only one '@' character.
• The email string must contain an '.' character.
• The '@' must contain at least one character in front of it. e.g. "a@cydeo.com" is valid while
"@cydeo.com" is invalid.
• The '.' and '@' must be in the appropriate places. e.g. "mike.smith@com" is invalid while
"mike.smith@cydeo.com" is valid.
For a given string, find a solution that writes true on the console if an email is valid and false if it is invalid.
Examples:
email = "test@cydeo.com" --> true
email = "test@cydeo.co.uk --> true
email = "mike.smith@cydeo.com --> true email = "mike.smith@com --> false
email = "@cydeo.com" --> false
email = "test@.com" --> false
email = "test@cydeo." --> false
email = "test@@cydeo.com" --> false

 */