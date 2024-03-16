package ayse_working.GroupMeeting.quiz2;

enum Enums12 {
    ONE("ONE"), TWO("TWO"), THREE("THREE");
     
    String s = "NAME";
     
    private Enums12(String s)
    {
        this.s = s;
    }
     
    void method()
    {
        System.out.println(s);
    }

}
 
public class MainClass1 {
    public static void main(String[] args)
    {
        Enums12.ONE.method();
         
        Enums12.TWO.method();
         
        Enums12.THREE.method();
    }
}