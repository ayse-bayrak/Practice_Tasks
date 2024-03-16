package ayse_working.GroupMeeting.selfGroupMeeting;

import java.sql.SQLOutput;
import java.util.Arrays;

public class DNAtoRNAConversion {

    public static void main(String[] args) {
        //String givenDNA = "";
        //String givenDNA = "GCAU";
        //String givenDNA = "GCAUTYP";
        String givenDNA = "GCAT";

        String outputRNA ="";

        if (givenDNA.isEmpty()) {
            System.out.println("The input string is empty");
            return;
        }

        for (int i = 0; i < givenDNA.length(); i++) {
            char b = givenDNA.charAt(i);
            if (!(b == 'G' || b == 'C' || b == 'A' || b == 'T')) {
                System.out.println("The input string is invalid: " + b);
                return;
            }
        }
        outputRNA = givenDNA.replaceAll("T", "U");

        System.out.println("RNA: ");
        System.out.println(outputRNA);

        System.out.println("=========DIFFERENT APPROACH=============");

        char[] a = givenDNA.toCharArray();

        if (a.length==0) {
            System.out.println("The input string is empty");
            return;
        }
        System.out.println(outputRNA);
        for (int i = 0; i < a.length; i++) {
            if(!(a[i]=='G'||a[i]=='C'||a[i]=='A'||a[i]=='T')) {
                System.out.println("The input string is invalid: " + a[i]);
          return;
            }
            else if(a[i]=='T'){
                a[i]= 'U';
            }
        }
        System.out.println("RNA: ");
        System.out.println( a );
    }


}
/*

 */