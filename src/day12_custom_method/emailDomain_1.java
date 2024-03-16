package day12_custom_method;

public class emailDomain_1 {
    public static void main(String[] args) {

        emailDomain("Cydeo@gmail.com");
        // it can be like this
        String email ="Cydeo@gmail.com";
        emailDomain(email);

    }
    public static void emailDomain(String email) {
        String domain = email.substring(email.indexOf('@')+1, email.indexOf('.'));
        System.out.println("domain : " + domain);
    }
}
/*
1. Create a method named emailDomain that can display the domain of the email
    Ex:
        emailDomain("Cydeo@gmail.com")

        output:
            domain: gmail

 */