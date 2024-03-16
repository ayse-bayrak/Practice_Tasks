package ayse_working.GroupMeeting.quiz3Lambda;

interface Runnable1 {
    void run();
    void shutDown();
}

public class Main1 {

    public static void main(String[] args) {

        //run(() -> System.out.println("System is running...")); // compile error

    }

    public static void run(Runnable1 runnable) {
        runnable.run();
    }

}