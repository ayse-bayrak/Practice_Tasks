package day11_string_methods;

public class WebsiteAddress_1 {
    public static void main(String[] args) {
        String website= "www.phytocenter.com";
        if((website.startsWith("www."))&&((website.endsWith(".com"))||website.endsWith(".edu")||website.endsWith(".gov")))
        {
            System.out.println("valid website");
        }else {
            System.out.println("invalid website");
        }
    }
}
/*
1. Create a class named WebsiteAddress, and write a program that can check if the given website is a valid website or not
            starts with: www.
            ends with: .com, .edu, .gov
 */