package ayse_working.GroupMeeting.quiz2;

enum Enums2
{
    A, B, C;
     
    private Enums2()
    {
        System.out.println(1);
    }
}
 
public class MainClass
{
    public static void main(String[] args)
    {
        Enum en = Enums2.B;
    }
}