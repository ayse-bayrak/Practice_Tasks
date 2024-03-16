package day07_if_statement_practice_task;
/*
2. Create a class called Browser. Write a program that can display the name of the selected browser
        1. declare a String variable named browserName
        2. Assume that the valid browsers are chrome, firefox, opera, safari, and edge.
        3. if the browser name does not match with the valid browser names, output should be: Invalid Browser Name

        Ex:
            String browser = "chrome";

        Output:
            Chrome Browser is selected

        Note: MUST use nested if
 */
public class Browser_2 {
    public static void main(String[] args) {
        String browserName = "edgel";
        String result = "String browser = ";
        if (browserName == "chrome" || browserName == "firefox"
                || browserName == "opera"|| browserName =="safari"
                ||browserName == "edge" )
        {
           if(browserName == "chrome") result += "\""+browserName+"\";";
           else if(browserName == "firefox") result += "\""+browserName+"\";";
           else if(browserName == "opera") result += "\""+browserName+"\";";
           else if(browserName == "safari") result += "\""+browserName+"\";";
           else result += "\""+browserName+"\";";
            System.out.println(result);
        }
        else System.out.println("Invalid Browser Name");
    }
}
