package day13_custom_methods;

public class Title_7 {
    public static void main(String[] args) {
      title("jAVa");
    }
    public static void title(String w) {

        System.out.println(w.toUpperCase().charAt(0)+w.toLowerCase().substring(1));
    }
}
/*
7. Create a method named title that takes a string arguments

    The method returns the proper capitalized version of the given argument

    Ex:
        title("jAvA") ===> Java
 */