package ayse_working.GroupMeeting.quiz3Lambda;

interface Runnable {
    void run();
}

//class System implements Runnable {
//
//    @Override
//    public void run() {
//        System.out.println("System is running...");
//    }
//
//}

public class Main {

    public static void main(String[] args) {

        run(()-> System.out.println("System is running"));
//        System system = new System();				// Line 1
//        run(system);								// Line 2

    }



    public static void run(Runnable runnable) {		// Line 3
        runnable.run();								// Line 4
    }

}