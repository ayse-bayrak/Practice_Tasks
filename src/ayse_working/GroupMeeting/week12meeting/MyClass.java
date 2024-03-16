package ayse_working.GroupMeeting.week12meeting;

//INTANCE INITIALIZATION BLOCK EXAMPLE FROM GHATCPT

    public class MyClass {
        {
            // Instance Initialization Block
            System.out.println("Instance Initialization Block");
        }

        // Constructors
        public MyClass() { // Constructor 1
            System.out.println("Constructor 1");
        }

        public MyClass(int value) {  // Constructor 2
            System.out.println("Constructor 2");
        }

        public static void main(String[] args) {
            MyClass obj1 = new MyClass();       // Output: Instance Initialization Block Constructor 1
            //An instance initialization block is executed when an instance of the class is created.
            MyClass obj2 = new MyClass(42);     // Output: Instance Initialization Block Constructor 2
        }
    }


