package day08_ternary_switch_practice;

import java.lang.invoke.SwitchPoint;

/*
9. write a program that can display the selected browser
            3.1  declare a String variable called browserName
            3.2  Assume that the valid browsers are: chrome, firefox, opera, safari, edge
            3.3 if the browser name does not match with the valid browsers' names, the output should be: Invalid Browser

        	Do Not use if statement or ternary
 */
public class BrowserName_9 {
    public static void main(String[] args) {
        int num=8;
        String browserName="";
       switch (num){
           case 1:
           browserName="Chrome";
           break;
           case 2:
               browserName="FireFox";
               break;
           case 3:
               browserName="Opera";
               break;
           case 4:
               browserName="Safari";
               break;
           case 5:
               browserName="Edge";
               break;
           default:
               browserName="Invalid Browser";

       }
        System.out.println(browserName);

    }
}
