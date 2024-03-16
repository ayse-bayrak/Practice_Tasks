package day28_encapsulation;

public class Credentials {

    private String username;
    private String password;

    public Credentials(String username, String password) {
        setUsername(username);
        setPassword(password);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {

        if (!isStrongPassWord(password)) {
            System.err.println("The password MUST be a strong password, \n 1-The password MUST be at least eight characters long and should not contain space" +
                    "\n 2. The password should at least contain one letter \n 3. The password should at least contain one special character \n 4. The password should at least contain a digit ");
            System.exit(1);
        }
        this.password = password;
    }

    public boolean isStrongPassWord(String password) {
        int numberDigit = 0;
        int numberSpecial = 0;
        int numberLetter = 0;

        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                numberDigit++;
            }
            if (Character.isLetter(password.charAt(i))) {
                numberLetter++;
            }
            if (Character.isLetterOrDigit(password.charAt(i)) && password.charAt(i) != ' ') {
                numberSpecial++;
            }
        }

        return (password.length() >= 8 && numberLetter > 0 && numberDigit > 0 && numberSpecial > 0 && !password.contains(" "));

    }//takes an argument of string and verifies if the given string is a strong password, returns a boolean

    public String toString() {
        return "Credentials{" +
                "username='" + getUsername() + '\'' +
                ", password='" + getPassword() + '\'' +
                '}';
    }

}
/*
create a class named Credentials
            Variables:
                username, password

            Encapsulate all the fields.
                    (The password MUST be a strong password)


            Add a constructor that allows the user to set all the fields when the object is created.
                        (If the arguments are not valid, it should not be set to the instances)

            Methods:
                isStrongPassWord(): takes an argument of string and verifies if the given string is a strong password, returns a boolean
                            Characteristics of strong passwords are:
                                    1. The password MUST be at least eight characters long and should not contain space
                                    2. The password should at least contain one letter
                                    3. The password should at least contain one special character
                                    4. The password should at least contain a digit

                toString()

 */