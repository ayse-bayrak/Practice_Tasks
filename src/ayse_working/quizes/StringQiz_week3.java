package ayse_working.quizes;

public class StringQiz_week3 {
    public static void main(String[] args) {


//String ta = "A";
//ta += "B";
//String tb = "C";
//ta += tb;
//ta.replace('C','D');
//        System.out.println(ta);//ABC
//
//        String str = "    Hello World   ";
//        str = str.trim();
//        int z = str.indexOf(" ");
//        System.out.println(z);//5

//        String batch = "Java Class";
//        System.out.println(batch.length());//10

//        String s1 = "wooden spoon";
//        String s2 = s1.substring(0,s1.indexOf(""));
//        System.out.println(s1.indexOf(" "));//6
//        System.out.println(s2);
//        System.out.println(s1.substring(0,6));//wooden

//        String s1 = "abc";
//        String s2 = "abc";
//        System.out.println("s1 == s2 is: " +s1==s2);//false

//        String s1 = "abcdefg";
//        System.out.println(s1.charAt(s1.length()));//StringIndexOutOfBoundryExpectetion

        String str1 = "Java";
        String str2 = new String("java");

        if(str1.equalsIgnoreCase(str2)) {
            System.out.println("equal");
        }else System.out.println("not equal");

    }
}
