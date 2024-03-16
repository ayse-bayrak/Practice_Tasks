package day08_ternary_switch_practice;
/*
10. Create a class named CydeoBatches. In Cydeo, we have three batch types: US morning, US evening, and EU.
        Depending on a batch type (String) print information about the batch.

        	If batch type is US morning ==> print "Class times are 10-5 EST. M, T, Th, F."
        	If batch type is US evening ==> print "Class times are 7-10 EST. M, T, W, Th, S, S"
        	If batch type is EU ==> print "Class times are  10-5 EST. M, T, W, Th, F."
        	If the batch type is invalid, print "Invalid Btach"

        	Note:
			 	Solution 1: use if statement
				Solution 2: use the switch statement
				Solution 2: use if & switch statements mixed
 */
public class CydeoBatches_10 {
    public static void main(String[] args) {
        System.out.println("========Solution 1-if statement====");
        String result=("");
        String batcType="US Evening";
        if (batcType=="US Morning"){
            result="Class Time are 10-5 EST. M, T, Th, F.";
        }
        else if (batcType=="US Evening") {
            result="Class Time are 7-10 EST. M, T, W, Th, S, S";
        }
        else if(batcType=="EU"){
            result="Class Time are 10-5 EST. M, T, W, Th, F.";
        }
        else {
            result=
            result="Invalid Batch";
        }
        System.out.println(result);
        System.out.println("========Solution 2-switch statement====");
    switch (batcType){
        case "US Morning":
            result="Class Time are 10-5 EST. M, T, Th, F.";
            break;
        case "US Evening":
            result="Class Time are 7-10 EST. M, T, W, Th, S, S";
            break;
        case "EU":
            result="Class Time are 10-5 EST. M, T, W, Th, F.";
            break;
        default:
            result="Invalid Batch";
            break;

    }
        System.out.println(result);

        System.out.println("========Solution 2-if&switch mix====");
    if (batcType=="US Morning"||batcType=="US Evening"||batcType=="EU")
    {
        switch (batcType) {
            case "US Morning":
                result = "Class Time are 10-5 EST. M, T, Th, F.";
                break;
            case "US Evening":
                result = "Class Time are 7-10 EST. M, T, W, Th, S, S";
                break;
            case "EU":
                result = "Class Time are 10-5 EST. M, T, W, Th, F.";
                break;
        }
    }
    else {
        result="Invalid Batch";
    }
        System.out.println(result);
    }
}
