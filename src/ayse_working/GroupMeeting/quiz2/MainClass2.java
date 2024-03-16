package ayse_working.GroupMeeting.quiz2;

enum MyEnums
{
    AAA, BBB, CCC;
     
    @Override
    public String toString()
    {
        return ordinal()+" : "+name();
    }
}
 
public class MainClass2
{
    public static void main(String[] args)
    {           
        System.out.println(MyEnums.AAA);
         
        System.out.println(MyEnums.BBB);
         
        System.out.println(MyEnums.CCC);
    }
}