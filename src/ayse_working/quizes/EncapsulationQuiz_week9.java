package ayse_working.quizes;

public class EncapsulationQuiz_week9 {


static String studentName = "Mike";
static {
    studentName = "Jordan";
}

    public static void main(String[] args) {
        studentName = "Jean";
        System.out.println(studentName);
    }

}
